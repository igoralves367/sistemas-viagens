package br.com.lis2b.igorviagens.aluguelveiculo.infra;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import br.com.lis2b.igorviagens.aluguelveiculo.domain.AluguelVeiculo;
import br.com.lis2b.igorviagens.igorviagensbff.application.api.AluguelVeiculoResponse;
import br.com.lis2b.igorviagens.igorviagensbff.application.api.ViagemCotacaoRequest;
import br.com.lis2b.igorviagens.igorviagensbff.application.service.AluguelVeiculoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@RequiredArgsConstructor
@Log4j2
public class AluguelVeiculoInfraRepository implements AluguelVeiculoService {
	private final AluguelVeiculoJPARepository aluguelVeiculoJPARepository; 

	@Override
	public List<AluguelVeiculoResponse> buscarAlugueisVeiculos(ViagemCotacaoRequest cotacaoRequest) {
		log.info("[start] AluguelVeiculoResponse - buscarAlugueisVeiculos");
		List<AluguelVeiculo> alugueisVeiculos = aluguelVeiculoJPARepository.findAll();
		List<AluguelVeiculoResponse> alugueisVeiculosResponse = alugueisVeiculos.stream()
				.map(AluguelVeiculoResponse::new)
				.collect(Collectors.toList());
		log.info("[finish] AluguelVeiculoResponse - buscarAlugueisVeiculos");
		return alugueisVeiculosResponse;
	}
}
