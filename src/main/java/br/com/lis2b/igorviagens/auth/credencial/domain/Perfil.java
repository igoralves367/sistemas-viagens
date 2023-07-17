package br.com.lis2b.igorviagens.auth.credencial.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "Perfil")
public class Perfil implements GrantedAuthority {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idNome;
	private String nome;

	@Override
	public String getAuthority() {
		return this.nome;
	}

	private static final long serialVersionUID = 1L;
}
