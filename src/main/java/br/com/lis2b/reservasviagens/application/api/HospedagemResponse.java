package br.com.lis2b.reservasviagens.application.api;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class HospedagemResponse {
	
	private String localizacao;
	private LocalDateTime checkin;
	private LocalDateTime checkout;
	private String hotel;
	private BigDecimal precoTotal;

}
