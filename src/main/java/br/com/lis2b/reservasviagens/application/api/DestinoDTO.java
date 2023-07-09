package br.com.lis2b.reservasviagens.application.api;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class DestinoDTO {
	
    private final String localOrigem;
    private final String localDestino;
    private final int quantidadePessoas;
    private final String dataIda;
    private final String dataVolta;
}
