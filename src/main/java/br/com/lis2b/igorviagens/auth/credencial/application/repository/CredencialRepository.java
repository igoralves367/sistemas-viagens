package br.com.lis2b.igorviagens.auth.credencial.application.repository;

import br.com.lis2b.igorviagens.auth.credencial.domain.Credencial;

public interface CredencialRepository {
	Credencial salva(Credencial credencial);
	Credencial buscaCredencialPorUsuario(String usuario);
}
