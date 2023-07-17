package br.com.lis2b.igorviagens.auth.usuario.api.repository;

import java.util.UUID;

import br.com.lis2b.igorviagens.auth.usuario.domain.Usuario;

public interface UsuarioRepository {
	Usuario salva(Usuario usuario);
	Usuario buscaUsuarioPorId(UUID idUsuario);
}
