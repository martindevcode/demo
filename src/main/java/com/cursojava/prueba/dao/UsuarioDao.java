package com.cursojava.prueba.dao;

import com.cursojava.prueba.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);
}
