package com.example.demo.repositorio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.example.demo.entidades.Mascota;

@Repository
public class MascotaRepository {
    private Map<Integer, Mascota> data = new HashMap<>();

    public MascotaRepository() {
        data.put(1, new Mascota("pepe", "pitbull", 10, 10.f, "/images/eldoggy.jpg",
                "ninguna", "bien"));
        data.put(2, new Mascota("luna", "labrador", 5, 15.f, "/images/eldoggy.jpg", "ninguna", "excelente"));
        data.put(3, new Mascota("rocky", "bulldog", 8, 12.f, "/images/eldoggy.jpg", "alergia al polvo", "bueno"));
        data.put(4, new Mascota("bella", "beagle", 3, 7.5f, "/images/eldoggy.jpg", "ninguna", "muy bien"));
        data.put(5,
                new Mascota("max", "pastor alemán", 6, 20.f, "/images/eldoggy.jpg", "displasia de cadera", "regular"));
        data.put(6, new Mascota("toby", "chihuahua", 2, 4.f, "/images/eldoggy.jpg", "ninguna", "excelente"));
    }

    public Mascota findById(int id) {
        return data.get(id);
    }

    public Collection<Mascota> findAll() {
        return data.values();
    }
}
