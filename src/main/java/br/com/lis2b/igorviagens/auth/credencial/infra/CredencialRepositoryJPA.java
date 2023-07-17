package br.com.lis2b.igorviagens.auth.credencial.infra;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.lis2b.igorviagens.auth.credencial.application.repository.CredencialRepository;
import br.com.lis2b.igorviagens.auth.credencial.domain.Credencial;
import br.com.lis2b.igorviagens.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@RequiredArgsConstructor
@Slf4j
public class CredencialRepositoryJPA implements CredencialRepository {
	private final CredencialJPARepository credencialJPARepository;

	@Override
	public Credencial salva(Credencial credencial) {
		log.info("[start] CredencialRepositoryJPA - salva");
		credencialJPARepository.save(credencial);
		log.info("[finish] CredencialRepositoryJPA - salva");
		return credencial;
	}

	@Override
	public Credencial buscaCredencialPorUsuario(String usuario) {
		log.info("[start] CredencialRepositoryJPA - buscaCredencialPorUsuario");
		var credencial = credencialJPARepository.findByUsuario(usuario).orElseThrow(
				() -> APIException.build(HttpStatus.NOT_FOUND, "Não existe credencial para o Usuario informado!"));
		log.info("[start] CredencialRepositoryJPA - buscaCredencialPorUsuario");
		return credencial;
	}
}