package br.com.lis2b.reservasviagens.usuario.api.infra;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lis2b.reservasviagens.usuario.domain.Usuario;

public interface UsuarioJPARepository extends JpaRepository <Usuario, UUID>{

	Optional<Usuario> findByIdUsuario(UUID idUsuario);

}
