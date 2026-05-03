package com.cursojava.prueba.controllers;

import com.cursojava.prueba.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

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

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(25L);
        usuario.setNombre("Martin");
        usuario.setApellido("Gonzales");
        usuario.setEmail("edumar.gonzales@gmail.com");
        usuario.setTelefono("943762453");

        Usuario usuario2 = new Usuario();
        usuario2.setId(30L);
        usuario2.setNombre("Martina");
        usuario2.setApellido("Gonza");
        usuario2.setEmail("gonzales@gmail.com");
        usuario2.setTelefono("123654789");

        Usuario usuario3 = new Usuario();
        usuario3.setId(45L);
        usuario3.setNombre("nuevo");
        usuario3.setApellido("moreno");
        usuario3.setEmail("edumar@gmail.com");
        usuario3.setTelefono("741258963");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }


    @RequestMapping(value = "usuario1")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Martin");
        usuario.setApellido("Gonzales");
        usuario.setEmail("edumar.gonzales@gmail.com");
        usuario.setTelefono("943762453");
        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Martin");
        usuario.setApellido("Gonzales");
        usuario.setEmail("edumar.gonzales@gmail.com");
        usuario.setTelefono("943762453");
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Martin");
        usuario.setApellido("Gonzales");
        usuario.setEmail("edumar.gonzales@gmail.com");
        usuario.setTelefono("943762453");
        return usuario;
    }
}
