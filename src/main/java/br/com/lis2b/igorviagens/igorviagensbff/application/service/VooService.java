package br.com.lis2b.igorviagens.igorviagensbff.application.service;

import java.util.List;

import br.com.lis2b.igorviagens.igorviagensbff.application.api.ViagemCotacaoRequest;
import br.com.lis2b.igorviagens.igorviagensbff.application.api.VooResponse;

public interface VooService {
	List<VooResponse> buscarVoos(ViagemCotacaoRequest cotacaoRequest);

}
