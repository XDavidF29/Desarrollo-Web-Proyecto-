package com.example.demo.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.Mascota;
import com.example.demo.repositorio.MascotaRepository;

@Service    
public class MascotaServiceImpl implements MascotaService{
    @Autowired
    MascotaRepository repo;

    @Override
    public Mascota searchById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Collection<Mascota> searchAll() {
        return repo.findAll();
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        repo.deleteById(id);
    }

    @Override
    public void update(Mascota mascota) {
        // TODO Auto-generated method stub
        repo.save(mascota);
    }

    @Override
    public void add(Mascota mascota) {
        // TODO Auto-generated method stub
        repo.save(mascota);
    }

    
}
