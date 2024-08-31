package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entidades.Mascota;
import com.example.demo.entidades.Usuario;
import com.example.demo.servicio.MascotaService;
import com.example.demo.servicio.UsuarioService;
import com.example.demo.repositorio.UsuarioRepository;
import com.example.demo.repositorio.MascotaRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/mascota")
public class MascotaController {
    @Autowired
    private Mascota mascota;

    @Autowired MascotaService service;
    @Autowired UsuarioService UsuarioService;

    @Autowired UsuarioRepository usuarioRepository;
    @Autowired MascotaRepository mascotaRepository;

    @GetMapping("/all")
    public String mostrarMascotas(Model model) {
        model.addAttribute("mascotas", service.searchAll());
        return "mostrar_todas_mascotas";
    }

    @GetMapping("/find")
    public String mostrarMascota(Model model, @RequestParam("id") Long idMascota) {
        model.addAttribute("mascota", service.searchById(idMascota));
        return "datos_mascota";
    }
    
    
    @GetMapping("/info")    
    public String mostrarInformacionMascota(Model model){
        model.addAttribute("mascota", mascota);
        return "datos_mascota";
    }


    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {
        Mascota mascota = new Mascota("", "", 0, 0, "", "", "");
        model.addAttribute("mascota", mascota);
        return "crear_mascota";
    }

    @PostMapping("/agregar")
    public String agregarMascota(@ModelAttribute("mascota") Mascota mascota, @RequestParam("cdueno") int cdueno) {
        Usuario usuario = usuarioRepository.findByCedula(cdueno);
        if (usuario != null) {
            usuario.addMascota(mascota);
            usuarioRepository.save(usuario);
        } else {
            return "redirect:/error";
        }
        return "redirect:/mascota/all";
    }

    @GetMapping("/update/{id}")
    public String mostrarFormularioEditar(Model model, @PathVariable("id") Long idMascota) {
        model.addAttribute("mascota", service.searchById(idMascota));
        return "modificar_mascota";
    }

    @PostMapping("/update/{id}")
    public String updateMascota(@PathVariable("id") Long idMascota, @ModelAttribute("mascota") Mascota mascota) {
        mascota.setId(idMascota);
        Mascota pet=service.searchById(idMascota);
        mascota.setUsuario(pet.getUsuario());
        mascota.setEstado(pet.getEstado());
        service.update(mascota);
        return "redirect:/mascota/all";
    }

    @GetMapping("/delete/{id}")
    public String eliminarMascota( @PathVariable("id") Long idMascota) {
        service.deleteById(idMascota);
        return "redirect:/mascota/all";
    }

    
}
