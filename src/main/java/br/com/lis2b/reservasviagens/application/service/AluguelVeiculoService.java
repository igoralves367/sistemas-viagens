package br.com.lis2b.reservasviagens.application.service;

import java.util.List;

import br.com.lis2b.reservasviagens.application.api.AluguelVeiculoResponse;
import br.com.lis2b.reservasviagens.application.api.ViagemCotacaoRequest;

public interface AluguelVeiculoService {
	List<AluguelVeiculoResponse> buscarAlugueisVeiculos(ViagemCotacaoRequest cotacaoRequest);

}
