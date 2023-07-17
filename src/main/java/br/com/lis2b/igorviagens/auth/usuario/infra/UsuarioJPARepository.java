package br.com.lis2b.igorviagens.auth.usuario.infra;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lis2b.igorviagens.auth.usuario.domain.Usuario;

public interface UsuarioJPARepository extends JpaRepository <Usuario, UUID>{

	Optional<Usuario> findByIdUsuario(UUID idUsuario);

}
