package br.com.lis2b.igorviagens.voos.application.service;

import java.util.List;

import br.com.lis2b.igorviagens.igorviagensbff.application.api.ViagemCotacaoRequest;
import br.com.lis2b.igorviagens.voos.infra.VooBuscaResponse;

public interface VooClientRest {
	List<VooBuscaResponse> buscaVoos(ViagemCotacaoRequest cotacaoRequest);
}
