package br.com.ragegames.streetruasv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ragegames.streetruasv.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
