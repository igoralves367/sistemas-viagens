package br.com.lis2b.reservasviagens.usuario.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.springframework.data.annotation.Id;

import br.com.lis2b.reservasviagens.usuario.api.UsuarioNovoRequest;
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
@Table(name = "Usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idUsuario;
	@Email
	@Column(unique = true)
	private String email;

	public Usuario(UsuarioNovoRequest usuarioNovo) {
		this.email = usuarioNovo.getEmail();
	}
}
