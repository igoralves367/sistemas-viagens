package br.com.lis2b.reservasviagens.credencial.application.service;

import javax.validation.Valid;

import br.com.lis2b.reservasviagens.credencial.domain.Credencial;
import br.com.lis2b.reservasviagens.usuario.api.UsuarioNovoRequest;

public interface CredencialService {
	void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo);
	Credencial buscaCredencialPorUsuario(String usuario);
}
