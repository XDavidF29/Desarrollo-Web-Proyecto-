package com.example.demo.servicio;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.demo.entidades.Veterinario;

@SuppressWarnings("unused")
public interface VeterinarioService {
    public Veterinario searchById(Long id);
    public Collection<Veterinario> searchAll();
    public void deleteById(Long id);
    public void update(Veterinario veterinario);
    public void add(Veterinario veterinario);
    
}
