package br.com.lis2b.igorviagens.igorviagensbff.application.api;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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

}
