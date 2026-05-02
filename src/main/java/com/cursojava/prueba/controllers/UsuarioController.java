package com.cursojava.prueba.controllers;

import com.cursojava.prueba.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    /*@RequestMapping(value = "/prueba")
    public String prueba(){
        return "prueba";
    }*/

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
    Usuario usuario = new Usuario();
    usuario.setId(id);
    usuario.setNombre("Martin");
    usuario.setApellido("Gonzales");
    usuario.setEmail("edumar.gonzales@gmail.com");
    usuario.setTelefono("943762453");
    return usuario;
    }

    @RequestMapping(value = "usuario1")
    public Usuario editar(){
    Usuario usuario = new Usuario();
    usuario.setNombre("Martin");
    usuario.setApellido("Gonzales");
    usuario.setEmail("edumar.gonzales@gmail.com");
    usuario.setTelefono("943762453");
    return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminar(){
    Usuario usuario = new Usuario();
    usuario.setNombre("Martin");
    usuario.setApellido("Gonzales");
    usuario.setEmail("edumar.gonzales@gmail.com");
    usuario.setTelefono("943762453");
    return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar(){
    Usuario usuario = new Usuario();
    usuario.setNombre("Martin");
    usuario.setApellido("Gonzales");
    usuario.setEmail("edumar.gonzales@gmail.com");
    usuario.setTelefono("943762453");
    return usuario;
    }
}
