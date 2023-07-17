package br.com.lis2b.igorviagens.igorviagensbff.domain;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@ToString
public class Viagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idViagem", updatable = false, unique = true, nullable = false)
	private UUID idViagem;
	private int quantidadePessoas;
    private LocalDate dataIda;
    private LocalDate dataVolta;
    private String localOrigem;
    private String localDestino;

}
