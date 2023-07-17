package br.com.lis2b.igorviagens.auth.credencial.infra;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lis2b.igorviagens.auth.credencial.domain.Credencial;

public interface CredencialJPARepository extends JpaRepository<Credencial, String> {
	Optional<Credencial> findByUsuario(String usuario);
}
