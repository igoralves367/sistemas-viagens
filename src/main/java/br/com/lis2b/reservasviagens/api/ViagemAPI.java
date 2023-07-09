package br.com.lis2b.reservasviagens.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequiredArgsConstructor
@RequestMapping("/viagem")
@Log4j2
public class ViagemAPI {

	@GetMapping
	public List<ViagemResponse> buscarViagens(@RequestParam int quantidadePessoas, @RequestParam String dataIda,
			@RequestParam(required = false) String dataVolta, @RequestParam String localOrigem,
			@RequestParam String localDestino) {
		log.info("[start] ViagemAPI - buscarViagens");
		log.info("[quantidadePessoas] {} - [dataIda] {} - [dataVolta] {} - [localOrigem] {} - [localDestino] {}",
				quantidadePessoas, dataIda, dataVolta, localOrigem, localDestino);
		log.info("[finish] ViagemAPI - buscarViagens");
		return null;
	}
}
