package br.com.ragegames.streetruasv.model;

public class User {

	private Long id;
	private String user;
	private String pass;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public User(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}

}
