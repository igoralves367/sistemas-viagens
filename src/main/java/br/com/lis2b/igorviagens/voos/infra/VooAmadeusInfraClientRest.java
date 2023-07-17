package br.com.lis2b.igorviagens.voos.infra;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.lis2b.igorviagens.igorviagensbff.application.api.ViagemCotacaoRequest;
import br.com.lis2b.igorviagens.voos.application.service.VooClientRest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
@RequiredArgsConstructor
public class VooAmadeusInfraClientRest implements VooClientRest {
	//private final VooAmadeusClientFeing vooClient;
	
	@Override
	public List<VooBuscaResponse> buscaVoos(ViagemCotacaoRequest cotacaoRequest) {
		log.info("[start] VooAmadeusInfraClientRest - buscarVoos");
		log.info("[finish] VooAmadeusInfraClientRest - buscarVoos");
		// TODO Auto-generated method stub
		return null;
	}

}
