package br.com.lis2b.reservasviagens.application.api;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class ViagemCotacaoRequest {
	@NotBlank
    private String codigoOrigem;
	@NotBlank
    private String codigoDestino;
	@NotNull
	@Min(value = 1)
    private Integer quantidadePessoas;
	@NotNull
    private LocalDate dataIda;
	private LocalDate dataVolta;
}
