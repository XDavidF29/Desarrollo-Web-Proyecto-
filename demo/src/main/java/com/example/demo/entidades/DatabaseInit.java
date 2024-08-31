package com.example.demo.entidades;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.repositorio.MascotaRepository;
import com.example.demo.repositorio.UsuarioRepository;
import java.util.List;

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
        // Guardar 50 usuarios
        usuarioRepository.save(new Usuario(null, "Juan", "juan@example.com", 123456789, 111222335, null));
        usuarioRepository.save(new Usuario(null, "Pedro", "pedro@example.com", 987654321, 444555666, null));
        usuarioRepository.save(new Usuario(null, "Carlos", "carlos@example.com", 112233445, 222333444, null));
        usuarioRepository.save(new Usuario(null, "Ana", "ana@example.com", 554433221, 665544332, null));
        usuarioRepository.save(new Usuario(null, "María", "maria@example.com", 777888999, 888777666, null));
        usuarioRepository.save(new Usuario(null, "Luis", "luis@example.com", 123123123, 321321321, null));
        usuarioRepository.save(new Usuario(null, "Sofía", "sofia@example.com", 456456456, 654654654, null));
        usuarioRepository.save(new Usuario(null, "Miguel", "miguel@example.com", 789789789, 987987987, null));
        usuarioRepository.save(new Usuario(null, "Raquel", "raquel@example.com", 147258369, 963852741, null));
        usuarioRepository.save(new Usuario(null, "David", "david@example.com", 258369147, 741852963, null));
        usuarioRepository.save(new Usuario(null, "Lucía", "lucia@example.com", 369147258, 852963741, null));
        usuarioRepository.save(new Usuario(null, "Ricardo", "ricardo@example.com", 987123654, 654321987, null));
        usuarioRepository.save(new Usuario(null, "Elena", "elena@example.com", 654987321, 321789654, null));
        usuarioRepository.save(new Usuario(null, "José", "jose@example.com", 123654789, 987456321, null));
        usuarioRepository.save(new Usuario(null, "Carmen", "carmen@example.com", 456789123, 789123456, null));
        usuarioRepository.save(new Usuario(null, "Francisco", "francisco@example.com", 741963852, 852147963, null));
        usuarioRepository.save(new Usuario(null, "Isabel", "isabel@example.com", 963741258, 258963147, null));
        usuarioRepository.save(new Usuario(null, "Jesús", "jesus@example.com", 159753486, 486357159, null));
        usuarioRepository.save(new Usuario(null, "Verónica", "veronica@example.com", 753159846, 846951753, null));
        usuarioRepository.save(new Usuario(null, "Gustavo", "gustavo@example.com", 987654321, 123456789, null));
        usuarioRepository.save(new Usuario(null, "Patricia", "patricia@example.com", 112233445, 554433221, null));
        usuarioRepository.save(new Usuario(null, "Felipe", "felipe@example.com", 998877665, 332211554, null));
        usuarioRepository.save(new Usuario(null, "Daniel", "daniel@example.com", 111222333, 444555666, null));
        usuarioRepository.save(new Usuario(null, "Andrea", "andrea@example.com", 666555444, 333222111, null));
        usuarioRepository.save(new Usuario(null, "Fernando", "fernando@example.com", 222111333, 666444555, null));
        usuarioRepository.save(new Usuario(null, "Rosa", "rosa@example.com", 555666777, 444333222, null));
        usuarioRepository.save(new Usuario(null, "Oscar", "oscar@example.com", 777666555, 222333444, null));
        usuarioRepository.save(new Usuario(null, "Natalia", "natalia@example.com", 888999000, 99888, null));
        usuarioRepository.save(new Usuario(null, "Sergio", "sergio@example.com", 333222111, 111222333, null));
        usuarioRepository.save(new Usuario(null, "Laura", "laura@example.com", 444555666, 666555444, null));
        usuarioRepository.save(new Usuario(null, "Hugo", "hugo@example.com", 222333444, 555666777, null));
        usuarioRepository.save(new Usuario(null, "Valeria", "valeria@example.com", 000111222, 333444555, null));
        usuarioRepository.save(new Usuario(null, "Alejandro", "alejandro@example.com", 555444333, 111000999, null));
        usuarioRepository.save(new Usuario(null, "Carla", "carla@example.com", 666777888, 222111000, null));
        usuarioRepository.save(new Usuario(null, "Ramiro", "ramiro@example.com", 111999888, 888777666, null));
        usuarioRepository.save(new Usuario(null, "Sara", "sara@example.com", 000555444, 333111222, null));
        usuarioRepository.save(new Usuario(null, "Iván", "ivan@example.com", 444333222, 666000999, null));
        usuarioRepository.save(new Usuario(null, "Paula", "paula@example.com", 333666555, 444222111, null));
        usuarioRepository.save(new Usuario(null, "Javier", "javier@example.com", 555999666, 777000111, null));
        usuarioRepository.save(new Usuario(null, "Ángela", "angela@example.com", 777333111, 888222000, null));
        usuarioRepository.save(new Usuario(null, "Mauricio", "mauricio@example.com", 999888777, 000111333, null));
        usuarioRepository.save(new Usuario(null, "Liliana", "liliana@example.com", 111222333, 444555666, null));
        usuarioRepository.save(new Usuario(null, "Rodrigo", "rodrigo@example.com", 222333444, 555666777, null));
        usuarioRepository.save(new Usuario(null, "Camila", "camila@example.com", 33344555, 666777888, null));
        usuarioRepository.save(new Usuario(null, "Matías", "matias@example.com", 444555666, 777888999, null));
        usuarioRepository.save(new Usuario(null, "Elisa", "elisa@example.com", 555666777, 888999000, null));
        usuarioRepository.save(new Usuario(null, "Pablo", "pablo@example.com", 666777888, 999000111, null));
        usuarioRepository.save(new Usuario(null, "Adriana", "adriana@example.com", 777888999, 1112223339, null));
        usuarioRepository.save(new Usuario(null, "Tomás", "tomas@example.com", 888999000, 222333444, null));
        usuarioRepository.save(new Usuario(null, "Olga", "olga@example.com", 999000111, 333444555, null));

        mascotaRepository.save(new Mascota("pepe", "chiquita", 1, 12.3f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("lola", "chiquita", 1, 12.3f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("max", "mediana", 2, 15.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("bella", "mediana", 2, 14.7f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("rocky", "grande", 3, 20.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("mila", "grande", 3, 19.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("duque", "grande", 3, 21.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("luna", "mediana", 2, 13.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("thor", "grande", 3, 22.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("zeus", "grande", 3, 23.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("fiona", "mediana", 2, 15.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("boby", "chiquita", 1, 10.5f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("daisy", "chiquita", 1, 11.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("bruno", "mediana", 2, 16.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("chico", "mediana", 2, 14.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("duque", "grande", 3, 20.5f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("sasha", "grande", 3, 22.5f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("duque", "grande", 3, 21.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("rex", "grande", 3, 23.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("duque", "grande", 3, 22.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("leia", "chiquita", 1, 11.5f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("kenia", "mediana", 2, 14.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("lili", "chiquita", 1, 12.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("paco", "grande", 3, 21.5f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("kira", "grande", 3, 24.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("nina", "mediana", 2, 16.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("oso", "grande", 3, 25.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("simba", "grande", 3, 26.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("rocky", "grande", 3, 23.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("balto", "grande", 3, 27.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("rambo", "grande", 3, 26.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("odin", "grande", 3, 28.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("balto", "grande", 3, 24.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("maya", "mediana", 2, 14.5f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("lucky", "chiquita", 1, 12.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("gala", "chiquita", 1, 13.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("toby", "mediana", 2, 17.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("duque", "grande", 3, 29.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("bola", "mediana", 2, 14.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("oso", "grande", 3, 25.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("tina", "chiquita", 1, 11.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("tina", "chiquita", 1, 12.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("tina", "chiquita", 1, 12.3f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("tina", "chiquita", 1, 11.9f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("tina", "chiquita", 1, 12.1f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("tina", "chiquita", 1, 12.3f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("tina", "chiquita", 1, 12.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("tina", "chiquita", 1, 12.7f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("tina", "chiquita", 1, 12.9f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("tina", "chiquita", 1, 13.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("lola", "mediana", 2, 14.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("balto", "grande", 3, 30.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("rambo", "grande", 3, 29.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("odin", "grande", 3, 28.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("balto", "grande", 3, 31.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("rambo", "grande", 3, 30.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("odin", "grande", 3, 32.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("balto", "grande", 3, 33.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("rambo", "grande", 3, 31.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("odin", "grande", 3, 34.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("balto", "grande", 3, 35.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("rambo", "grande", 3, 33.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("odin", "grande", 3, 36.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("balto", "grande", 3, 37.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("rambo", "grande", 3, 35.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("odin", "grande", 3, 38.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("balto", "grande", 3, 39.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("rambo", "grande", 3, 37.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("odin", "grande", 3, 40.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("max", "grande", 3, 41.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("coco", "mediana", 2, 18.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("bella", "chiquita", 1, 13.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("lucky", "mediana", 2, 17.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("rocky", "grande", 3, 42.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("nala", "mediana", 2, 19.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("duque", "grande", 3, 43.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("simba", "grande", 3, 44.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("mia", "chiquita", 1, 14.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("chispas", "mediana", 2, 18.5f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("bruno", "grande", 3, 45.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("luna", "mediana", 2, 20.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("duque", "grande", 3, 46.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("sasha", "grande", 3, 47.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("rocky", "grande", 3, 48.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("toby", "mediana", 2, 21.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("kira", "grande", 3, 49.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("coco", "mediana", 2, 22.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("zeus", "grande", 3, 50.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("thor", "grande", 3, 51.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("osito", "chiquita", 1, 15.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("duque", "grande", 3, 52.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("balto", "grande", 3, 53.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("rambo", "grande", 3, 54.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("odin", "grande", 3, 55.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("maya", "mediana", 2, 23.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("bella", "chiquita", 1, 16.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("max", "grande", 3, 56.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("kenia", "mediana", 2, 24.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("luna", "mediana", 2, 25.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("thor", "grande", 3, 57.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("nina", "mediana", 2, 26.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        mascotaRepository.save(new Mascota("duque", "grande", 3, 58.0f, "/images/eldoggy.jpg", "ninguna", "bien"));
        mascotaRepository.save(new Mascota("sasha", "grande", 3, 59.0f, "/images/eldoggy.jpg", "ninguna", "excelente"));

        List<Usuario> usuarios = usuarioRepository.findAll();
        List<Mascota> mascotas = mascotaRepository.findAll();

    for (int i = 0; i < mascotas.size(); i++) {
        Mascota mascota = mascotas.get(i);
        Usuario usuario = usuarios.get(i % usuarios.size()); // Asociación cíclica
        mascota.setUsuario(usuario);
        mascotaRepository.save(mascota); // Guardar cada mascota con su usuario asociado
    }

    }

        
}
