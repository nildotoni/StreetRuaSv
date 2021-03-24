package br.com.ragegames.streetruasv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ragegames.streetruasv.dto.UsuarioDto;
import br.com.ragegames.streetruasv.dto.form.UsuarioForm;
import br.com.ragegames.streetruasv.model.Usuario;
import br.com.ragegames.streetruasv.repository.UsuarioRepository;

@RestController
@RequestMapping("/")
public class ServletController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	public List<UsuarioDto> hello() {
		List<Usuario> list = usuarioRepository.findAll();
		
		return UsuarioDto.converter(list);
	}
	
	@PostMapping
	public Usuario cadastrar(@RequestBody UsuarioForm form) {
		Usuario usuario = form.converter(usuarioRepository);
		usuarioRepository.save(usuario);
		return usuario;
		
	}
}
