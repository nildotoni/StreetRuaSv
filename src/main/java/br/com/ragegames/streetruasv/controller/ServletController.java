package br.com.ragegames.streetruasv.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
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
	public Page<UsuarioDto> hello(@PageableDefault(sort = "id", page=0, size=10,direction = Direction.ASC) Pageable paginacao)	 {
		Page<Usuario> list = usuarioRepository.findAll(paginacao);
		
		return UsuarioDto.converter(list);
	}
	
	@PostMapping
	public Usuario cadastrar(@RequestBody @Valid UsuarioForm form) {
		Usuario usuario = form.converter(usuarioRepository);
		usuarioRepository.save(usuario);
		return usuario;
		
	}
}
