package br.com.lis2b.igorviagens.igorviagensbff.application.service;

import java.util.List;

import br.com.lis2b.igorviagens.igorviagensbff.application.api.AluguelVeiculoResponse;
import br.com.lis2b.igorviagens.igorviagensbff.application.api.ViagemCotacaoRequest;

public interface AluguelVeiculoService {
	List<AluguelVeiculoResponse> buscarAlugueisVeiculos(ViagemCotacaoRequest cotacaoRequest);

}
