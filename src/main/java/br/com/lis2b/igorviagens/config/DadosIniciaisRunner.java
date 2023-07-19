package br.com.lis2b.igorviagens.config;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.lis2b.igorviagens.aluguelveiculo.domain.AluguelVeiculo;
import br.com.lis2b.igorviagens.aluguelveiculo.infra.AluguelVeiculoJPARepository;
import br.com.lis2b.igorviagens.hospedagem.domain.Hospedagem;
import br.com.lis2b.igorviagens.hospedagem.infra.HospedagemJPARepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Component
@RequiredArgsConstructor
@Log4j2
public class DadosIniciaisRunner implements ApplicationRunner {
	private final HospedagemJPARepository hospedagemJPARepository;
	private final AluguelVeiculoJPARepository aluguelVeiculoJPARepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("[start] DadosIniciaisRunner - run");
        initHospedagem();
        initAluguelVeiculo();
        log.info("[finish] DadosIniciaisRunner - run");

    }

    private void initHospedagem() {
        if (hospedagemJPARepository.count() == 0) {
            for (int i = 0; i < 5; i++) {
                Hospedagem hospedagem = Hospedagem.builder()
                        .localizacao("Localização " + i)
                        .checkin(LocalDateTime.now().plusDays(i))
                        .checkout(LocalDateTime.now().plusDays(i + 1))
                        .hotel("Hotel " + i)
                        .precoTotal(BigDecimal.valueOf(500.23 + i))
                        .build();
                hospedagemJPARepository.save(hospedagem);
                log.info("[hospedagem] {}", hospedagem);
            }
        }
    }

    private void initAluguelVeiculo() {
        if (aluguelVeiculoJPARepository.count() == 0) {
            for (int i = 0; i < 5; i++) {
                AluguelVeiculo aluguelVeiculo = AluguelVeiculo.builder()
                        .modeloVeiculo("Modelo " + i)
                        .checkin(LocalDateTime.now().plusDays(i))
                        .checkout(LocalDateTime.now().plusDays(i + 1))
                        .locadora("Locadora " + i)
                        .localizacaoLocadora("Localização Locadora " + i)
                        .precoTotal(BigDecimal.valueOf(100.50 + i))
                        .build();
                aluguelVeiculoJPARepository.save(aluguelVeiculo);
                log.info("[aluguelVeiculo] {}", aluguelVeiculo);
            }
        }
    }

}
