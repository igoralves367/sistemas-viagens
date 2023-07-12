package br.com.lis2b.reservasviagens.application.service;

import org.springframework.stereotype.Service;

import br.com.lis2b.reservasviagens.application.api.ViagemCotacaoRequest;
import br.com.lis2b.reservasviagens.application.api.ViagemCotacaoResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ViagemApplicationService implements ViagemService {

	private final VooService vooService;
	private final HospedagemService hospedagemService;
	private final AluguelVeiculoService aluguelVeiculoService;  
 
	@Override
	public ViagemCotacaoResponse gerarCotacao(ViagemCotacaoRequest cotacaoRequest) {
		log.info("[start] ViagemApplicationService - gerarCotacao");
		var voos = vooService.buscarVoos(cotacaoRequest);
		var hospedagens = hospedagemService.buscarHospedagens(cotacaoRequest);
		var alugueisVeiculos = aluguelVeiculoService.buscarAlugueisVeiculos(cotacaoRequest); 
		log.info("[finish] ViagemApplicationService - gerarCotacao");
		return new ViagemCotacaoResponse(cotacaoRequest, voos, hospedagens, alugueisVeiculos);
	}
}
