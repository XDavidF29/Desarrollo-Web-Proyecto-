package com.example.demo.repositorio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Mascota;
import com.example.demo.entidades.Usuario;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UsuarioRepository {
    
    
    private Map<Integer, Usuario> data=new HashMap<>();

    public UsuarioRepository(){
        data.put(1, new Usuario(1, "Juan", "a", 0, 0,"123",new ArrayList<>()));
        data.put(2, new Usuario(2, "Pedro", "b", 0,0,"123",new ArrayList<>()));
        data.put(3, new Usuario(3, "Maria", "", 0,0,"123",new ArrayList<>()));
        data.put(4, new Usuario(4, "Jose", "", 0,0,"123",new ArrayList<>()));
        data.put(5, new Usuario(5, "Luis", "", 0,0,"123",new ArrayList<>()));
        data.put(6, new Usuario(6, "Ana", "", 0,0,"123",new ArrayList<>()));
    }

    public Usuario findById(int id){
        return data.get(id);
    }

    public Collection<Usuario> findAll(){
        return data.values();
    }

    public void deleteById(int id){
        data.remove(id);
    }

    public void update(Usuario usuario){
        data.put(usuario.getId(), usuario);
    }

    public void add(Usuario usuario){
        int tam=data.size();
        int lastId=data.get(tam).getId();
        usuario.setId(lastId+1);
        data.put(usuario.getId(), usuario);
    }

    public void addMascotaToUsuario(int idUsuario, Mascota mascota) {
        Usuario usuario = data.get(idUsuario);
        if (usuario != null) {
            List<Mascota> mascotas = usuario.getMascotas();
            if (mascotas == null) {
                mascotas = new ArrayList<>();
            }
            mascotas.add(mascota);
            usuario.setMascotas(mascotas);
            update(usuario); 
        }
    }
    public Usuario findByCorreo(String correo) {
        return data.values().stream()
            .filter(usuario -> usuario.getCorreo().equals(correo))
            .findFirst()
            .orElse(null);
    }
    public boolean verificarCredenciales(String correo, String password) {
        Usuario usuario = findByCorreo(correo);
        return usuario != null && usuario.getPassword().equals(password);
    }
}
