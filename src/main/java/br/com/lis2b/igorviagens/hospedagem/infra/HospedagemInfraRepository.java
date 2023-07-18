package br.com.lis2b.igorviagens.hospedagem.infra;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import br.com.lis2b.igorviagens.hospedagem.domain.Hospedagem;
import br.com.lis2b.igorviagens.igorviagensbff.application.api.HospedagemResponse;
import br.com.lis2b.igorviagens.igorviagensbff.application.api.ViagemCotacaoRequest;
import br.com.lis2b.igorviagens.igorviagensbff.application.service.HospedagemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@RequiredArgsConstructor
@Log4j2
public class HospedagemInfraRepository implements HospedagemService {
	private final HospedagemJPARepository hospedagemJPARepository;

	@Override
	public List<HospedagemResponse> buscarHospedagens(ViagemCotacaoRequest cotacaoRequest) {
		log.info("[start] HospedagemInfraRepository - buscarHospedagens");
		List<Hospedagem> hospedagens = hospedagemJPARepository.findAll();
	    List<HospedagemResponse> hospedagemResponses = hospedagens.stream()
	            .map(HospedagemResponse::new)
	            .collect(Collectors.toList());
		log.info("[finish] HospedagemInfraRepository - buscarHospedagens");
		return hospedagemResponses;
	}
}
