package br.com.lis2b.igorviagens.igorviagensbff.application.api;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.lis2b.igorviagens.aluguelveiculo.domain.AluguelVeiculo;
import lombok.Getter;
import lombok.ToString;
@Getter
@ToString
public class AluguelVeiculoResponse {
	
	private String modeloVeiculo;
	private LocalDateTime checkin;
	private LocalDateTime checkout;
	private String locadora;
	private String localizacaoLocadora;
	private BigDecimal precoTotal;

	public AluguelVeiculoResponse(AluguelVeiculo aluguelVeiculo) {
		this.modeloVeiculo = aluguelVeiculo.getModeloVeiculo();
		this.checkin = aluguelVeiculo.getCheckin();
		this.checkout = aluguelVeiculo.getCheckout();
		this.locadora = aluguelVeiculo.getLocadora();
		this.localizacaoLocadora = aluguelVeiculo.getLocalizacaoLocadora();
		this.precoTotal = aluguelVeiculo.getPrecoTotal();
	}
}
