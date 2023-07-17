package br.com.lis2b.igorviagens.igorviagensbff.application.api;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class VooPernaResponse {
	private String aeroportoOrigem; 
	private String aeroportoDestino;
	private LocalDateTime decolagem;
	private String companhiaAerea;
	private BigDecimal preco;

}
