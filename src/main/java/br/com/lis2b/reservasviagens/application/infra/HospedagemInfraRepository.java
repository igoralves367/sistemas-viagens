package br.com.lis2b.reservasviagens.application.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.lis2b.reservasviagens.application.api.HospedagemResponse;
import br.com.lis2b.reservasviagens.application.api.ViagemCotacaoRequest;
import br.com.lis2b.reservasviagens.application.service.HospedagemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@RequiredArgsConstructor
@Log4j2
public class HospedagemInfraRepository implements HospedagemService {

	@Override
	public List<HospedagemResponse> buscarHospedagens(ViagemCotacaoRequest cotacaoRequest) {
		 log.info("[start] HospedagemResponse - buscarHospedagens");
		 log.info("[finish] HospedagemResponse - buscarHospedagens");
		return null;
	}
}
	