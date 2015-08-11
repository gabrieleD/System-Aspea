package com.system.aspea.beans;

public abstract class StrumentoAstratto {

	private int idStrumento;
	private String nome;

	public int getIdStrumento() {
		return idStrumento;
	}

	public void setIdStrumento(int idStrumento) {
		this.idStrumento = idStrumento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
