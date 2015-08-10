package com.system.aspea.beans;

import java.util.Date;

public class Allegato1A extends SchedaAstratta {

	private Date dataInLavoro;
	private Date dataFineLavoro;
	private String coordLavoro;
	private String descrizioneLavoro;
	private boolean schBifilare;
	private boolean schFunzionale;
	private String altro1;
	private String altro2;
	private boolean conformitaSpecificheProg;
	private boolean conformitaSiglePreviste;
	private boolean agibilita;
	private boolean permFiamma;
	private boolean tutaAntifiamma;
	private boolean mascheraAntigas;
	private boolean autoProtettore;
	private boolean bonificaProcesso;
	private String[] num;
	private String[] descrizioni;
	private String[] quantita;
	private String[] note;
	private String[] idSchedeAll;

	public Date getDataInLavoro() {
		return dataInLavoro;
	}

	public void setDataInLavoro(Date dataInLavoro) {
		this.dataInLavoro = dataInLavoro;
	}

	public Date getDataFineLavoro() {
		return dataFineLavoro;
	}

	public void setDataFineLavoro(Date dataFineLavoro) {
		this.dataFineLavoro = dataFineLavoro;
	}

	public String getCoordLavoro() {
		return coordLavoro;
	}

	public void setCoordLavoro(String coordLavoro) {
		this.coordLavoro = coordLavoro;
	}

	public String getDescrizioneLavoro() {
		return descrizioneLavoro;
	}

	public void setDescrizioneLavoro(String descrizioneLavoro) {
		this.descrizioneLavoro = descrizioneLavoro;
	}

	public boolean isSchBifilare() {
		return schBifilare;
	}

	public void setSchBifilare(boolean schBifilare) {
		this.schBifilare = schBifilare;
	}

	public boolean isSchFunzionale() {
		return schFunzionale;
	}

	public void setSchFunzionale(boolean schFunzionale) {
		this.schFunzionale = schFunzionale;
	}

	public String getAltro1() {
		return altro1;
	}

	public void setAltro1(String altro1) {
		this.altro1 = altro1;
	}

	public String getAltro2() {
		return altro2;
	}

	public void setAltro2(String altro2) {
		this.altro2 = altro2;
	}

	public boolean isConformitaSpecificheProg() {
		return conformitaSpecificheProg;
	}

	public void setConformitaSpecificheProg(boolean conformitaSpecificheProg) {
		this.conformitaSpecificheProg = conformitaSpecificheProg;
	}

	public boolean isConformitaSiglePreviste() {
		return conformitaSiglePreviste;
	}

	public void setConformitaSiglePreviste(boolean conformitaSiglePreviste) {
		this.conformitaSiglePreviste = conformitaSiglePreviste;
	}

	public boolean isAgibilita() {
		return agibilita;
	}

	public void setAgibilita(boolean agibilita) {
		this.agibilita = agibilita;
	}

	public boolean isPermFiamma() {
		return permFiamma;
	}

	public void setPermFiamma(boolean permFiamma) {
		this.permFiamma = permFiamma;
	}

	public boolean isTutaAntifiamma() {
		return tutaAntifiamma;
	}

	public void setTutaAntifiamma(boolean tutaAntifiamma) {
		this.tutaAntifiamma = tutaAntifiamma;
	}

	public boolean isMascheraAntigas() {
		return mascheraAntigas;
	}

	public void setMascheraAntigas(boolean mascheraAntigas) {
		this.mascheraAntigas = mascheraAntigas;
	}

	public boolean isAutoProtettore() {
		return autoProtettore;
	}

	public void setAutoProtettore(boolean autoProtettore) {
		this.autoProtettore = autoProtettore;
	}

	public boolean isBonificaProcesso() {
		return bonificaProcesso;
	}

	public void setBonificaProcesso(boolean bonificaProcesso) {
		this.bonificaProcesso = bonificaProcesso;
	}

	public String[] getNum() {
		return num;
	}

	public void setNum(String[] num) {
		this.num = num;
	}

	public String[] getDescrizioni() {
		return descrizioni;
	}

	public void setDescrizioni(String[] descrizioni) {
		this.descrizioni = descrizioni;
	}

	public String[] getQuantita() {
		return quantita;
	}

	public void setQuantita(String[] quantita) {
		this.quantita = quantita;
	}

	public String[] getNote() {
		return note;
	}

	public void setNote(String[] note) {
		this.note = note;
	}

	public String[] getIdSchedeAll() {
		return idSchedeAll;
	}

	public void setIdSchedeAll(String[] idSchedeAll) {
		this.idSchedeAll = idSchedeAll;
	}
}
