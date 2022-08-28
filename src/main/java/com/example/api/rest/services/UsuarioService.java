package com.example.api.rest.services;

import java.util.ArrayList;

import com.example.api.rest.models.UsuarioModel;

public interface UsuarioService {
	
	public ArrayList<UsuarioModel> obtenerUsuarios();
	
	public UsuarioModel guardarUsuario (UsuarioModel usuario);
	
}
