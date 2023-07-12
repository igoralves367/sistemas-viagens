package br.com.lis2b.reservasviagens.application.service;

import java.util.List;

import br.com.lis2b.reservasviagens.application.api.HospedagemResponse;
import br.com.lis2b.reservasviagens.application.api.ViagemCotacaoRequest;

public interface HospedagemService {
	List<HospedagemResponse> buscarHospedagens(ViagemCotacaoRequest cotacaoRequest);

}
