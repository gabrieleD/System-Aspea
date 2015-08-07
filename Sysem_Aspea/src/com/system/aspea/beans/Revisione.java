package com.system.aspea.beans;

import java.util.Date;

public class Revisione {

	private int idRevisione;
	private String strumento;
	private String mittente;
	private String destinatario;
	private String anomalie;
	private String note;
	private String utente;
	private Date data;

	public int getIdRevisione() {
		return idRevisione;
	}

	public void setIdRevisione(int idRevisione) {
		this.idRevisione = idRevisione;
	}

	public String getStrumento() {
		return strumento;
	}

	public void setStrumento(String strumento) {
		this.strumento = strumento;
	}

	public String getMittente() {
		return mittente;
	}

	public void setMittente(String mittente) {
		this.mittente = mittente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getAnomalie() {
		return anomalie;
	}

	public void setAnomalie(String anomalie) {
		this.anomalie = anomalie;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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
