package com.example.demo.entidades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.repositorio.MascotaRepository;
import com.example.demo.repositorio.UsuarioRepository;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class DatabaseInit implements ApplicationRunner {

    @Autowired
    MascotaRepository mascotaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Crear usuarios
        Usuario usuario1 = new Usuario(null, "Juan", "juan@example.com", 123456789, 111222333, "password1", null);
        Usuario usuario2 = new Usuario(null, "Pedro", "pedro@example.com", 987654321, 444555666, "password2", null);

        // Crear mascotas
        Mascota mascota1 = new Mascota("pepe", "chiquita", 1, 12.3f, "/images/eldoggy.jpg", "ninguna", "bien");
        Mascota mascota2 = new Mascota("lola", "chiquita", 1, 12.3f, "/images/eldoggy.jpg", "ninguna", "bien");

        // Asignar mascotas a usuarios
        mascota1.setUsuario(usuario1);
        mascota2.setUsuario(usuario2);

        // Añadir mascotas a los usuarios
        usuario1.getMascotas().add(mascota1);
        usuario2.getMascotas().add(mascota2);

        // Guardar usuarios y sus respectivas mascotas en una sola operación
        usuarioRepository.save(usuario1);
        usuarioRepository.save(usuario2);
    }
}
