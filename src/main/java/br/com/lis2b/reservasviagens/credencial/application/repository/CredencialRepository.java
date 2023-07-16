package br.com.lis2b.reservasviagens.credencial.application.repository;

import br.com.lis2b.reservasviagens.credencial.domain.Credencial;

public interface CredencialRepository {
	Credencial salva(Credencial credencial);
	Credencial buscaCredencialPorUsuario(String usuario);
}
