package com.system.aspea.beans;

public class Utente {

	private int idUtente;
	private String nome;
	private String userName;
	private String password;
	private String tipoAccesso;

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipoAccesso() {
		return tipoAccesso;
	}

	public void setTipoAccesso(String tipoAccesso) {
		this.tipoAccesso = tipoAccesso;
	}
}
