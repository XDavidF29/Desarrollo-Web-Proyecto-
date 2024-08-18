package com.example.demo.servicio;

import java.util.Collection;


import com.example.demo.entidades.Usuario;

public interface UsuarioService {
    public Usuario searchById(int id);
    public Collection<Usuario> searchAll();
    public void deleteById(int id);
    public void update(Usuario usuario);
    public void add(Usuario usuario);    
} 
