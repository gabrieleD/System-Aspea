package com.system.aspea.beans;

import java.util.Date;

public class Variazione {

	private int idVariazione;
	private String matricola;
	private String variazione;
	private String utente;
	private Date data;

	public int getIdVariazione() {
		return idVariazione;
	}

	public void setIdVariazione(int idVariazione) {
		this.idVariazione = idVariazione;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getVariazione() {
		return variazione;
	}

	public void setVariazione(String variazione) {
		this.variazione = variazione;
	}

	public String getUtente() {
		return utente;
	}

	public void setUtente(String utente) {
		this.utente = utente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
