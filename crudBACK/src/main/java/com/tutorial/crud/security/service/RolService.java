package com.tutorial.crud.security.service;

import com.tutorial.crud.security.entity.Rol;
import com.tutorial.crud.security.enums.RolNombre;
import java.util.Optional;

public interface RolService {

    Optional<Rol> getByRolNombre(RolNombre rolNombre);
    void save(Rol rol);

}
