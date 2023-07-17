package br.com.lis2b.igorviagens.auth.usuario.api.service;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.lis2b.igorviagens.auth.credencial.application.service.CredencialService;
import br.com.lis2b.igorviagens.auth.usuario.api.UsuarioCriadoResponse;
import br.com.lis2b.igorviagens.auth.usuario.api.UsuarioNovoRequest;
import br.com.lis2b.igorviagens.auth.usuario.api.repository.UsuarioRepository;
import br.com.lis2b.igorviagens.auth.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioApplicationService implements UsuarioService {
	private final CredencialService credencialService;
	private final UsuarioRepository usuarioRepository;

	@Override
	public UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
		log.info("[start] UsuarioApplicationService - criaNovoUsuario");
		credencialService.criaNovaCredencial(usuarioNovo);
		var usuario = new Usuario(usuarioNovo);
		usuarioRepository.salva(usuario);
		log.info("[finish] UsuarioApplicationService - criaNovoUsuario");
		return new UsuarioCriadoResponse(usuario);
	}

	@Override
	public UsuarioCriadoResponse buscaUsuarioPorId(UUID idUsuario) {
		log.info("[start] UsuarioApplicationService - buscaUsuarioPorId");
		Usuario usuario = usuarioRepository.buscaUsuarioPorId(idUsuario);
		log.info("[finish] UsuarioApplicationService - buscaUsuarioPorId");
		return new UsuarioCriadoResponse(usuario);
	}
}
