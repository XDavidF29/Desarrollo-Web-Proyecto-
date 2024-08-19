package com.example.demo.servicio;

import java.util.Collection;


import com.example.demo.entidades.Usuario;
import com.example.demo.entidades.Mascota;

public interface UsuarioService {
    public Usuario searchById(int id);
    public Collection<Usuario> searchAll();
    public void deleteById(int id);
    public void update(Usuario usuario);
    public void add(Usuario usuario);
    public void addMascotaToUsuario(int idUsuario, Mascota mascota);  
} 
