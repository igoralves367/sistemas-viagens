package br.com.lis2b.reservasviagens.application.service;

import br.com.lis2b.reservasviagens.application.api.ViagemCotacaoRequest;
import br.com.lis2b.reservasviagens.application.api.ViagemCotacaoResponse;

public interface ViagemService {

	ViagemCotacaoResponse gerarCotacao(ViagemCotacaoRequest cotacaoRequest);

}
