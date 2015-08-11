package com.system.aspea.beans;

import java.util.Date;

public class Taratura {

	private int idTaratura;
	private Date dataTaratura;
	private String validita;
	private Date scadenza;
	private String laboratorio;
	private String certificato;
	private String strumentoCampione;
	private Date dataAvvioProcedura;
	private boolean avviataProcedura;
	private String utente;

	public int getIdTaratura() {
		return idTaratura;
	}

	public void setIdTaratura(int idTaratura) {
		this.idTaratura = idTaratura;
	}

	public Date getDataTaratura() {
		return dataTaratura;
	}

	public void setDataTaratura(Date dataTaratura) {
		this.dataTaratura = dataTaratura;
	}

	public String getValidita() {
		return validita;
	}

	public void setValidita(String validita) {
		this.validita = validita;
	}

	public Date getScadenza() {
		return scadenza;
	}

	public void setScadenza(Date scadenza) {
		this.scadenza = scadenza;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String getCertificato() {
		return certificato;
	}

	public void setCertificato(String certificato) {
		this.certificato = certificato;
	}

	public String getStrumentoCampione() {
		return strumentoCampione;
	}

	public void setStrumentoCampione(String strumentoCampione) {
		this.strumentoCampione = strumentoCampione;
	}

	public Date getDataAvvioProcedura() {
		return dataAvvioProcedura;
	}

	public void setDataAvvioProcedura(Date dataAvvioProcedura) {
		this.dataAvvioProcedura = dataAvvioProcedura;
	}

	public boolean isAvviataProcedura() {
		return avviataProcedura;
	}

	public void setAvviataProcedura(boolean avviataProcedura) {
		this.avviataProcedura = avviataProcedura;
	}

	public String getUtente() {
		return utente;
	}

	public void setUtente(String utente) {
		this.utente = utente;
	}
}
