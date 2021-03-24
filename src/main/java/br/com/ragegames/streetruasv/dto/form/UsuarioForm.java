package br.com.ragegames.streetruasv.dto.form;



import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.ragegames.streetruasv.model.Usuario;
import br.com.ragegames.streetruasv.repository.UsuarioRepository;

public class UsuarioForm {
	@NotNull @NotEmpty  @Size(min=3, max=30) @Column(unique = true)
	private String nome;
	@NotNull @NotEmpty  @Size(min=3, max=30) 
	private String pass;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public Usuario converter(UsuarioRepository usuarioRepository){
		return new Usuario(nome,pass);
		
	}
}
