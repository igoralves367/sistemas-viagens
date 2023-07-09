package br.com.lis2b.reservasviagens.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.lis2b.reservasviagens.application.api.DestinoDTO;
import br.com.lis2b.reservasviagens.application.api.ViagemResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class ViagemApplicationService implements ViagemService {

	@Override
	public List<ViagemResponse> buscarViagens(DestinoDTO destino) {
		 log.info("[start] ViagemApplicationService - buscarViagens");
		 log.info("[destino] {} ", destino);
		 log.info("[finish] ViagemApplicationService - buscarViagens");
		return null;
	}

}
