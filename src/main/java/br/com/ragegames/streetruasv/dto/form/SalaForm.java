package br.com.ragegames.streetruasv.dto.form;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.ragegames.streetruasv.model.Sala;
import br.com.ragegames.streetruasv.repository.SalaRepository;

public class SalaForm {
    boolean vazia;
	@NotNull @NotEmpty @Column(unique = true)
	int port;
	
	public boolean isVazia() {
		return vazia;
	}
	public void setVazia(boolean vazia) {
		this.vazia = vazia;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	public Sala converter(SalaRepository salaRepository) {
		return new Sala(vazia, port);
			}
	
}
