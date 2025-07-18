package com.andres.curso.springboot.app.springbootcrud.repositories;

import com.andres.curso.springboot.app.springbootcrud.entities.Role;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface RoleRepository extends ListCrudRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
