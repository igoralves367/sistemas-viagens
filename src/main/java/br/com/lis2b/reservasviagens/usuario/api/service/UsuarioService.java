package br.com.lis2b.reservasviagens.usuario.api.service;

import java.util.UUID;

import javax.validation.Valid;

import br.com.lis2b.reservasviagens.usuario.api.UsuarioCriadoResponse;
import br.com.lis2b.reservasviagens.usuario.api.UsuarioNovoRequest;

public interface UsuarioService {

	UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo);
	UsuarioCriadoResponse buscaUsuarioPorId(UUID idUsuario);
}
