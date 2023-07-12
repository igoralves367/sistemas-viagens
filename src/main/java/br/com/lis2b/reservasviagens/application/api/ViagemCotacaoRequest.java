package br.com.lis2b.reservasviagens.application.api;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class ViagemCotacaoRequest {
	
    private String localOrigem;
    private String localDestino;
    private Integer quantidadePessoas;
    private LocalDate dataIda;
	private LocalDate dataVolta;
}
