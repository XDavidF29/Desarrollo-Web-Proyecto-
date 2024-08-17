package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entidades.Mascota;
import com.example.demo.servicio.MascotaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/mascota")
public class MascotaController {
    @Autowired
    private Mascota mascota;

    @Autowired MascotaService service;

    @GetMapping("/all")
    public String mostrarMascotas(Model model) {
        model.addAttribute("mascotas", service.searchAll());
        return "mostrar_todas_mascotas";
    }

    @GetMapping("/find")
    public String mostrarMascota() {
        return "mostrar_mascota";
    }
    
    
    @GetMapping("/info")    
    public String mostrarInformacionMascota(Model model){
        model.addAttribute("mascota", mascota);
        return "datos_mascota";
    }
}
