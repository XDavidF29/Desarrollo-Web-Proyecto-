package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    @GetMapping("/registro")
    public String crear_Usuario(){
        return "crear_usuario";
    }

    @GetMapping("/login")
    public String logincrear_Usuario(){
        return "login_usuario";
    }
}
