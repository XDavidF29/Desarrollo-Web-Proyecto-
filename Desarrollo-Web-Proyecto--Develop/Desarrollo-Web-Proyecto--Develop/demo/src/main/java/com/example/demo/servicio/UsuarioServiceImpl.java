package com.example.demo.servicio;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entidades.Usuario;
import com.example.demo.entidades.Mascota;
import com.example.demo.repositorio.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository repo;

    @Override
    public Usuario searchById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }

    @Override
    public void update(Usuario usuario) {
        repo.save(usuario);
    }

    @Override
    public void add(Usuario usuario) {
        repo.save(usuario);
    }

    @Override
    public Collection<Usuario> searchAll() {
        return repo.findAll();
    }

    @Override
    public void addMascotaToUsuario(int idUsuario, Mascota mascota) {
        Usuario usuario = repo.findById(idUsuario).orElse(null);
        if (usuario != null) {
            usuario.getMascotas().add(mascota);
            repo.save(usuario);
        }
    }

    @Override
    public boolean verificarCredenciales(String correo, String password) {
        Usuario usuario = repo.findByCorreo(correo);
        return usuario != null && usuario.getPassword().equals(password);
    }

    @Override
    public Usuario searchByCorreo(String correo) {
        return repo.findByCorreo(correo);
    }
}
