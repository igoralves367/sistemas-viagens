package br.com.lis2b.igorviagens.voos;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.lis2b.igorviagens.igorviagensbff.application.api.ViagemCotacaoRequest;
import br.com.lis2b.igorviagens.igorviagensbff.application.api.VooResponse;
import br.com.lis2b.igorviagens.igorviagensbff.application.service.VooService;
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
