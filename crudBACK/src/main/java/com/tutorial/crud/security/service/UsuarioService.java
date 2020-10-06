package com.tutorial.crud.security.service;

import com.tutorial.crud.security.entity.Usuario;
import java.util.Optional;


public interface UsuarioService {

     Optional<Usuario> getByNombreUsuario(String nombreUsuario);
     boolean existsByNombreUsuario(String nombre);
     boolean existsByEmail(String email);
     void save (Usuario usuario);
}
