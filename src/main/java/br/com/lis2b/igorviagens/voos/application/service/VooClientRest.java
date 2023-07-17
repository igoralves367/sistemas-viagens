package br.com.lis2b.igorviagens.voos.application.service;

import br.com.lis2b.igorviagens.igorviagensbff.application.api.ViagemCotacaoRequest;
import br.com.lis2b.igorviagens.voos.infra.FlightOfferResponse;

public interface VooClientRest {
	FlightOfferResponse buscaVoos(ViagemCotacaoRequest cotacaoRequest);
}
