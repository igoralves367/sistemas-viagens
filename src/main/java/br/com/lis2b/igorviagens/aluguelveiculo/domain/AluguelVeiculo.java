package br.com.lis2b.igorviagens.aluguelveiculo.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@ToString
@Builder
public class AluguelVeiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idAluguelVeiculo", updatable = false, unique = true, nullable = false)
	private UUID id;
	private String modeloVeiculo;
	private LocalDateTime checkin;
	private LocalDateTime checkout;
	private String locadora;
	private String localizacaoLocadora;
	private BigDecimal precoTotal;

}
