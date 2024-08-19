package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entidades.Usuario;
import com.example.demo.entidades.Mascota;
import com.example.demo.servicio.UsuarioService;
import com.example.demo.servicio.MascotaService;


@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService service;

    @Autowired
    MascotaService mascotaService;

    @GetMapping("/registro")
    public String crear_Usuario(){
        return "crear_usuario";
    }

    @GetMapping("/login")
    public String logincrear_Usuario(){
        return "login_usuario";
    }

    @GetMapping("/all")
    public String mostrarMascotas(Model model) {
        model.addAttribute("usuarios", service.searchAll());
        return "mostrar_todos_usuarios";
    }

    @GetMapping("/add")
    public String mostrarFormularioCrear(Model model) {
        Usuario usuario = new Usuario(0,"", "", 0, 0,null);
        model.addAttribute("usuario", usuario);
        return "crear_usuario";
    }

    @PostMapping("/agregar")
    public String agregarUsuario(@ModelAttribute("usuario") Usuario usuario) {
        service.add(usuario);
        return "usuario_exitoso";
    }

    @GetMapping("/update/{id}")
    public String mostrarFormularioEditar(Model model, @PathVariable("id") int idusuario) {
        model.addAttribute("usuario", service.searchById(idusuario));
        return "modificar_usuario";
    }

    @PostMapping("/update/{id}")
    public String updateUsuario(@PathVariable("id") int idusuario, @ModelAttribute("usuario") Usuario usuario) {
        usuario.setId(idusuario);
        service.update(usuario);
        return "redirect:/usuario/all";
    }

    @GetMapping("/delete/{id}")
    public String eliminarUsuario( @PathVariable("id") int idusuario) {
        service.deleteById(idusuario);
        return "redirect:/usuario/all";
    }

    @GetMapping("/find")
    public String mostrarUsuario(Model model, @RequestParam("id") int idUsuario) {
        Usuario usuario = service.searchById(idUsuario);
        Mascota mascota = mascotaService.searchById(1);
        service.addMascotaToUsuario(idUsuario, mascota);
        model.addAttribute("usuario", usuario);
        model.addAttribute("mascotas", usuario.getMascotas());
        return "datalles_usuario";
    }
}
