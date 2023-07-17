package br.com.lis2b.igorviagens.voos.infra;

import org.springframework.stereotype.Component;

import br.com.lis2b.igorviagens.igorviagensbff.application.api.ViagemCotacaoRequest;
import br.com.lis2b.igorviagens.voos.application.service.VooClientRest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
@RequiredArgsConstructor
public class VooAmadeusInfraClientRest implements VooClientRest {
	private final VooAmadeusClientFeing vooClient;

	@Override
	public FlightOfferResponse buscaVoos(ViagemCotacaoRequest cotacaoRequest) {
		log.info("[start] VooAmadeusInfraClientRest - buscarVoos");
		FlightOfferResponse response = vooClient.buscaVoos(
				AUTHORIZATION_HEADER, 
				cotacaoRequest.getCodigoOrigem(),
				cotacaoRequest.getCodigoDestino(), 
				cotacaoRequest.getDataIda(), 
				cotacaoRequest.getDataVolta(), 
				cotacaoRequest.getQuantidadePessoas(),
				false,
				"BRL",
				MAX_RESULTS);
		log.info("[finish] VooAmadeusInfraClientRest - buscarVoos");
		return response;
	}

	private static final String AUTHORIZATION_HEADER = "Bearer qFhrpbxyk6Xax57WAb4R5fNQ9Cv9";
	private static final Integer MAX_RESULTS = 10;
}
