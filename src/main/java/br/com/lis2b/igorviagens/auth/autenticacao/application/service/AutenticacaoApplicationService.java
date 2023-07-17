package br.com.lis2b.igorviagens.auth.autenticacao.application.service;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import br.com.lis2b.igorviagens.auth.autenticacao.domain.Token;

public interface AutenticacaoApplicationService {
    Token autentica(UsernamePasswordAuthenticationToken userCredentials);
    Token reativaToken(String tokenExpirado);
}
