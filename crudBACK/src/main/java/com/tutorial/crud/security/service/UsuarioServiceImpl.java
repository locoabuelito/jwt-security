package com.tutorial.crud.security.service;

import com.tutorial.crud.security.entity.Usuario;
import com.tutorial.crud.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuario_Repository;

    @Override
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return usuario_Repository.findByNombreUsuario(nombreUsuario);
    }

    @Override
    public boolean existsByNombreUsuario(String nombre) {
        return usuario_Repository.existsByNombreUsuario(nombre);
    }

    @Override
    public boolean existsByEmail(String email) {
        return usuario_Repository.existsByEmail(email);
    }

    @Override
    public void save(Usuario usuario) {
        usuario_Repository.save(usuario);
    }
}
