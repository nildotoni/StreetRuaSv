package br.com.ragegames.streetruasv.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ragegames.streetruasv.dto.SalaDto;
import br.com.ragegames.streetruasv.dto.form.SalaForm;
import br.com.ragegames.streetruasv.model.Sala;
import br.com.ragegames.streetruasv.repository.SalaRepository;

@RestController
@RequestMapping("/sala")
public class SalaController {

	@Autowired
	private SalaRepository salaRepository;
	
	@PostMapping
	public Sala registraSala(@RequestBody SalaForm form){
		Sala sala = form.converter(salaRepository);
		salaRepository.save(sala);
		return sala;
}
	@GetMapping
	public List<SalaDto> ListaSalas(){
		List<Sala> salas = salaRepository.findAll();
		
		return SalaDto.converter(salas);
	}
	
	
}
