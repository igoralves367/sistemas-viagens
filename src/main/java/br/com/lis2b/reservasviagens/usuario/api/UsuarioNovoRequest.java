package br.com.lis2b.reservasviagens.usuario.api;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.Value;
@Value
public class UsuarioNovoRequest {
	@Email
	private final String email;
	@Size(min = 6)
	private final String senha;
}
