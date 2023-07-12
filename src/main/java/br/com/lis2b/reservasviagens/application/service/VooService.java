package br.com.lis2b.reservasviagens.application.service;

import java.util.List;

import br.com.lis2b.reservasviagens.application.api.ViagemCotacaoRequest;
import br.com.lis2b.reservasviagens.application.api.VooResponse;

public interface VooService {
	List<VooResponse> buscarVoos(ViagemCotacaoRequest cotacaoRequest);

}
