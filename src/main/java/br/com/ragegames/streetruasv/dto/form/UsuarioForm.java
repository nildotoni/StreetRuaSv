package br.com.ragegames.streetruasv.dto.form;



import br.com.ragegames.streetruasv.model.Usuario;
import br.com.ragegames.streetruasv.repository.UsuarioRepository;

public class UsuarioForm {
	private String nome;
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
