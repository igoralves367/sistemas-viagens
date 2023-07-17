package br.com.lis2b.igorviagens.auth.credencial.application.service;

import javax.validation.Valid;

import br.com.lis2b.igorviagens.auth.credencial.domain.Credencial;
import br.com.lis2b.igorviagens.auth.usuario.api.UsuarioNovoRequest;

public interface CredencialService {
	void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo);
	Credencial buscaCredencialPorUsuario(String usuario);
}
