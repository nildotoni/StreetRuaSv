package br.com.ragegames.streetruasv.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sala {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
    boolean vazia;
	int port;
	
	public Sala(boolean vazia, int port) {
		this.vazia = vazia;
		this.port = port;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
}
