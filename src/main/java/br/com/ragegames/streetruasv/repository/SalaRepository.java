package br.com.ragegames.streetruasv.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ragegames.streetruasv.dto.SalaDto;
import br.com.ragegames.streetruasv.model.Sala;

public interface SalaRepository extends JpaRepository<Sala, Long>{

	public Optional<Sala> findById(Long id);
	
}
