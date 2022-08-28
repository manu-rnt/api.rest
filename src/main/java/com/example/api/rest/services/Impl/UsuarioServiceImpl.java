package com.example.api.rest.services.Impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.rest.models.UsuarioModel;
import com.example.api.rest.repositories.UsuarioRepository;
import com.example.api.rest.services.UsuarioService;


@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	public ArrayList<UsuarioModel> obtenerUsuarios() {
		return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
	}
	
	public UsuarioModel guardarUsuario (UsuarioModel usuario) {
		return usuarioRepository.save(usuario);
	}
}
