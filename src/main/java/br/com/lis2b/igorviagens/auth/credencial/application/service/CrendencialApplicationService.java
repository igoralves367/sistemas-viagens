package br.com.lis2b.igorviagens.auth.credencial.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.lis2b.igorviagens.auth.credencial.application.repository.CredencialRepository;
import br.com.lis2b.igorviagens.auth.credencial.domain.Credencial;
import br.com.lis2b.igorviagens.auth.usuario.api.UsuarioNovoRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class CrendencialApplicationService implements CredencialService {
	private final CredencialRepository credencialRepository;
	
	@Override
	public void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo) {
		log.info("[inicia] CrendencialService - criaNovaCredencial");
		var novaCredencial = new Credencial(usuarioNovo.getEmail(), usuarioNovo.getSenha());
		credencialRepository.salva(novaCredencial);
		log.info("[finaliza] CrendencialService - criaNovaCredencial");
	}
	
	@Override
	public Credencial buscaCredencialPorUsuario(String usuario) {
		log.info("[inicia] CredencialSpringDataJpaService - buscaCredencial");
		Credencial credencial = credencialRepository.buscaCredencialPorUsuario(usuario);
		log.info("[finaliza] CredencialSpringDataJpaService - buscaCredencial");
		return credencial;
	}
}
