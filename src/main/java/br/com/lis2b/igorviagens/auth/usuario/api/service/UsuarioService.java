package br.com.lis2b.igorviagens.auth.usuario.api.service;

import java.util.UUID;

import javax.validation.Valid;

import br.com.lis2b.igorviagens.auth.usuario.api.UsuarioCriadoResponse;
import br.com.lis2b.igorviagens.auth.usuario.api.UsuarioNovoRequest;

public interface UsuarioService {

	UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo);
	UsuarioCriadoResponse buscaUsuarioPorId(UUID idUsuario);
}
