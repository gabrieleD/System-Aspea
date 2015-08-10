package com.system.aspea.beans;

public class Allegato6 extends SchedaAstratta {

	private boolean sistemaDiAllarme;
	private boolean sistemaDiBlocco;
	private boolean sistemaSequenziale;
	private boolean sistemaSegnLuminosi;
	private boolean aRele;
	private boolean logicaCablata;
	private boolean plc;
	private String specificaNum;
	private String disegnoNum;
	private String ubicazione;
	private String verificaFunzionale;
	private boolean compilatoRapportoInefficienza;
	private String[] strumentiUsati;
	private String[] matricoleStrUsati;
	private String verificheVarie;
	private String note;

	public boolean isSistemaDiAllarme() {
		return sistemaDiAllarme;
	}

	public void setSistemaDiAllarme(boolean sistemaDiAllarme) {
		this.sistemaDiAllarme = sistemaDiAllarme;
	}

	public boolean isSistemaDiBlocco() {
		return sistemaDiBlocco;
	}

	public void setSistemaDiBlocco(boolean sistemaDiBlocco) {
		this.sistemaDiBlocco = sistemaDiBlocco;
	}

	public boolean isSistemaSequenziale() {
		return sistemaSequenziale;
	}

	public void setSistemaSequenziale(boolean sistemaSequenziale) {
		this.sistemaSequenziale = sistemaSequenziale;
	}

	public boolean isSistemaSegnLuminosi() {
		return sistemaSegnLuminosi;
	}

	public void setSistemaSegnLuminosi(boolean sistemaSegnLuminosi) {
		this.sistemaSegnLuminosi = sistemaSegnLuminosi;
	}

	public boolean isaRele() {
		return aRele;
	}

	public void setaRele(boolean aRele) {
		this.aRele = aRele;
	}

	public boolean isLogicaCablata() {
		return logicaCablata;
	}

	public void setLogicaCablata(boolean logicaCablata) {
		this.logicaCablata = logicaCablata;
	}

	public boolean isPlc() {
		return plc;
	}

	public void setPlc(boolean plc) {
		this.plc = plc;
	}

	public String getSpecificaNum() {
		return specificaNum;
	}

	public void setSpecificaNum(String specificaNum) {
		this.specificaNum = specificaNum;
	}

	public String getDisegnoNum() {
		return disegnoNum;
	}

	public void setDisegnoNum(String disegnoNum) {
		this.disegnoNum = disegnoNum;
	}

	public String getUbicazione() {
		return ubicazione;
	}

	public void setUbicazione(String ubicazione) {
		this.ubicazione = ubicazione;
	}

	public String getVerificaFunzionale() {
		return verificaFunzionale;
	}

	public void setVerificaFunzionale(String verificaFunzionale) {
		this.verificaFunzionale = verificaFunzionale;
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

	public String getVerificheVarie() {
		return verificheVarie;
	}

	public void setVerificheVarie(String verificheVarie) {
		this.verificheVarie = verificheVarie;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
