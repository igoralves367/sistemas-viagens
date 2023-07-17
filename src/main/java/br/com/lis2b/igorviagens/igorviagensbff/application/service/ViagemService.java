package br.com.lis2b.igorviagens.igorviagensbff.application.service;

import br.com.lis2b.igorviagens.igorviagensbff.application.api.ViagemCotacaoRequest;
import br.com.lis2b.igorviagens.igorviagensbff.application.api.ViagemCotacaoResponse;

public interface ViagemService {

	ViagemCotacaoResponse gerarCotacao(ViagemCotacaoRequest cotacaoRequest);

}
