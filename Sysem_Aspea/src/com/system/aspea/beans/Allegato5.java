package com.system.aspea.beans;

public class Allegato5 extends SchedaAstratta {

	private String siglaLoop;
	private String servizio;
	private String[] segnaliIngresso;
	private String[] usciteTeoriche;
	private String[] usciteReali;
	private String[] usciteTeoriche2;
	private String[] usciteReali2;
	private String[] costruttori;
	private String[] tipi;
	private String[] campi;
	private String[] numSerie;
	private boolean compilatoRapportoInefficienza;
	private String[] strumentiUsati;
	private String[] matricoleStrUsati;
	private String[] UDM;

	public String getSiglaLoop() {
		return siglaLoop;
	}

	public void setSiglaLoop(String siglaLoop) {
		this.siglaLoop = siglaLoop;
	}

	public String getServizio() {
		return servizio;
	}

	public void setServizio(String servizio) {
		this.servizio = servizio;
	}

	public String[] getSegnaliIngresso() {
		return segnaliIngresso;
	}

	public void setSegnaliIngresso(String[] segnaliIngresso) {
		this.segnaliIngresso = segnaliIngresso;
	}

	public String[] getUsciteTeoriche() {
		return usciteTeoriche;
	}

	public void setUsciteTeoriche(String[] usciteTeoriche) {
		this.usciteTeoriche = usciteTeoriche;
	}

	public String[] getUsciteReali() {
		return usciteReali;
	}

	public void setUsciteReali(String[] usciteReali) {
		this.usciteReali = usciteReali;
	}

	public String[] getUsciteTeoriche2() {
		return usciteTeoriche2;
	}

	public void setUsciteTeoriche2(String[] usciteTeoriche2) {
		this.usciteTeoriche2 = usciteTeoriche2;
	}

	public String[] getUsciteReali2() {
		return usciteReali2;
	}

	public void setUsciteReali2(String[] usciteReali2) {
		this.usciteReali2 = usciteReali2;
	}

	public String[] getCostruttori() {
		return costruttori;
	}

	public void setCostruttori(String[] costruttori) {
		this.costruttori = costruttori;
	}

	public String[] getTipi() {
		return tipi;
	}

	public void setTipi(String[] tipi) {
		this.tipi = tipi;
	}

	public String[] getCampi() {
		return campi;
	}

	public void setCampi(String[] campi) {
		this.campi = campi;
	}

	public String[] getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String[] numSerie) {
		this.numSerie = numSerie;
	}

	public boolean isCompilatoRapportoInefficienza() {
		return compilatoRapportoInefficienza;
	}

	public void setCompilatoRapportoInefficienza(
			boolean compilatoRapportoInefficienza) {
		this.compilatoRapportoInefficienza = compilatoRapportoInefficienza;
	}

	public String[] getStrumentiUsati() {
		return strumentiUsati;
	}

	public void setStrumentiUsati(String[] strumentiUsati) {
		this.strumentiUsati = strumentiUsati;
	}

	public String[] getMatricoleStrUsati() {
		return matricoleStrUsati;
	}

	public void setMatricoleStrUsati(String[] matricoleStrUsati) {
		this.matricoleStrUsati = matricoleStrUsati;
	}

	public String[] getUDM() {
		return UDM;
	}

	public void setUDM(String[] uDM) {
		UDM = uDM;
	}
}
