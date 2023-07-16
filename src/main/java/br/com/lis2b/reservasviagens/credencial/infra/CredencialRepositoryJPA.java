package br.com.lis2b.reservasviagens.credencial.infra;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.lis2b.reservasviagens.credencial.application.repository.CredencialRepository;
import br.com.lis2b.reservasviagens.credencial.domain.Credencial;
import br.com.lis2b.reservasviagens.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@RequiredArgsConstructor
@Slf4j
public class CredencialRepositoryJPA implements CredencialRepository {
	private final CredencialJPARepository credencialMongoRepository;

	@Override
	public Credencial salva(Credencial credencial) {
		log.info("[start] CredencialRepositoryMongoDB - salva");
		credencialMongoRepository.save(credencial);
		log.info("[finish] CredencialRepositoryMongoDB - salva");
		return credencial;
	}

	@Override
	public Credencial buscaCredencialPorUsuario(String usuario) {
		log.info("[start] CredencialRepositoryMongoDB - buscaCredencialPorUsuario");
		var credencial = credencialMongoRepository.findByUsuario(usuario).orElseThrow(
				() -> APIException.build(HttpStatus.NOT_FOUND, "Não existe credencial para o Usuario informado!"));
		log.info("[start] CredencialRepositoryMongoDB - buscaCredencialPorUsuario");
		return credencial;
	}
}