package br.com.lis2b.reservasviagens.application.service;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.lis2b.reservasviagens.application.api.ViagemCotacaoRequest;
import br.com.lis2b.reservasviagens.application.api.VooResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Component
@Log4j2
@RequiredArgsConstructor
public class VooInfra implements VooService {

	@Override
	public List<VooResponse> buscarVoos(ViagemCotacaoRequest cotacaoRequest) {
		 log.info("[start] VooInfra - buscarVoos");
		 log.info("[finish] VooInfra - buscarVoos");
		return null;
	}
}
