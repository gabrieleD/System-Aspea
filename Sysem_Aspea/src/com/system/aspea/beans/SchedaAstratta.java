package com.system.aspea.beans;

import java.util.Date;

public abstract class SchedaAstratta {
	
	private int idScheda;
	private String cliente;
	private int contratto;
	private int rel;
	private String impianto;
	private Date data;
	private String tecnicoStrumentista;
	private String apporvazione;
	private int idUtente;

	public int getIdScheda() {
		return idScheda;
	}

	public void setIdScheda(int idScheda) {
		this.idScheda = idScheda;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getContratto() {
		return contratto;
	}

	public void setContratto(int contratto) {
		this.contratto = contratto;
	}

	public int getRel() {
		return rel;
	}

	public void setRel(int rel) {
		this.rel = rel;
	}

	public String getImpianto() {
		return impianto;
	}

	public void setImpianto(String impianto) {
		this.impianto = impianto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTecnicoStrumentista() {
		return tecnicoStrumentista;
	}

	public void setTecnicoStrumentista(String tecnicoStrumentista) {
		this.tecnicoStrumentista = tecnicoStrumentista;
	}

	public String getApporvazione() {
		return apporvazione;
	}

	public void setApporvazione(String apporvazione) {
		this.apporvazione = apporvazione;
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}
}
