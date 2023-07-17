package br.com.lis2b.igorviagens.auth.autenticacao.application.api;

import br.com.lis2b.igorviagens.auth.autenticacao.domain.Token;
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