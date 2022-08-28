package com.example.api.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.api.rest.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

}
