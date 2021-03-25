package br.com.ragegames.streetruasv.dto;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;



import br.com.ragegames.streetruasv.model.Sala;

public class SalaDto {
    boolean vazia;
	int port;
	
	public SalaDto(Sala sala) {
		this.vazia = sala.isVazia();
		this.port = sala.getPort();
	}
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
	public SalaDto(boolean vazia, int port) {
		this.vazia = vazia;
		this.port = port;
	}
	public static List<SalaDto> converter(List<Sala> salas) {
		return salas.stream().map(SalaDto::new).collect(Collectors.toList());
	}
	
	
}
