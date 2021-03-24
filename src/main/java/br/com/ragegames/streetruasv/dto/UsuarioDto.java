package br.com.ragegames.streetruasv.dto;

import java.util.List;
import java.util.stream.Collectors;


import br.com.ragegames.streetruasv.model.Usuario;

public class UsuarioDto {
	private String nome;

	public UsuarioDto(Usuario usuario) {
		
		this.nome = usuario.getNome();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static List<UsuarioDto> converter(List<Usuario> lista) {
		return lista.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}
}
