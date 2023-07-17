package br.com.lis2b.igorviagens.igorviagensbff.application.service;

import java.util.List;

import br.com.lis2b.igorviagens.igorviagensbff.application.api.HospedagemResponse;
import br.com.lis2b.igorviagens.igorviagensbff.application.api.ViagemCotacaoRequest;

public interface HospedagemService {
	List<HospedagemResponse> buscarHospedagens(ViagemCotacaoRequest cotacaoRequest);

}
