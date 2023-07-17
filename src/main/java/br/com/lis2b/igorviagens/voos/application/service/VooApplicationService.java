package br.com.lis2b.igorviagens.voos.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.lis2b.igorviagens.igorviagensbff.application.api.ViagemCotacaoRequest;
import br.com.lis2b.igorviagens.igorviagensbff.application.api.VooResponse;
import br.com.lis2b.igorviagens.igorviagensbff.application.service.VooService;
import br.com.lis2b.igorviagens.voos.infra.VooBuscaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class VooApplicationService implements VooService {
	private final VooClientRest vooClientRest;

	@Override
	public List<VooResponse> buscarVoos(ViagemCotacaoRequest cotacaoRequest) {
		log.info("[start] VooInfra - buscarVoos");
		List<VooBuscaResponse> voosBusca = vooClientRest.buscaVoos(cotacaoRequest);
		List<VooResponse> voosResponse = VooResponse.convert(voosBusca);
		log.info("[finish] VooInfra - buscarVoos");
		return voosResponse;
	}
}
