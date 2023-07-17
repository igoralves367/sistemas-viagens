package br.com.lis2b.reservasviagens.autenticacao.application.api;

import br.com.lis2b.reservasviagens.autenticacao.domain.Token;
import lombok.Value;

@Value
public class TokenResponse {
	private String token;
	private String tipo;

	public TokenResponse(Token token) {
		this.token = token.getToken();
		this.tipo = token.getTipo();
	}
}