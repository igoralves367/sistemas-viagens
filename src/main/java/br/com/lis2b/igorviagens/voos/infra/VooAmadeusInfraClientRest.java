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
		try {
			FlightOfferResponse response = getFlightOfferResponse(cotacaoRequest);
			log.info("[finish] VooAmadeusInfraClientRest - buscarVoos");
			return response;
		} catch (Exception e) {
			log.error("[ERROR] VooAmadeusInfraClientRest - buscarVoos",e);
			log.info("[finish] VooAmadeusInfraClientRest - buscarVoos");
			return null;
		}
	}
	
	private FlightOfferResponse getFlightOfferResponse(ViagemCotacaoRequest cotacaoRequest) {
		FlightOfferResponse response = vooClient.buscaVoos(
				cotacaoRequest.getCodigoOrigem(),
				cotacaoRequest.getCodigoDestino(), 
				cotacaoRequest.getDataIda(), 
				cotacaoRequest.getDataVolta(), 
				cotacaoRequest.getQuantidadePessoas(),
				false,
				"BRL",
				MAX_RESULTS);
		return response;
	}
	private static final Integer MAX_RESULTS = 10;
}
