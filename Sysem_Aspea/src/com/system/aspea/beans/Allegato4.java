package com.system.aspea.beans;

public class Allegato4 extends SchedaAstratta {

	private String sigla;
	private String matricola;
	private String specifica;
	private String costruttore;
	private String tipo;
	private String ubicazione;
	private boolean regolazioneTip;
	private boolean intercettazioneTip;
	private String altroTip;
	private boolean pneumaticoPos;
	private boolean elettropneumaticoPos;
	private String altroPos;
	private boolean pneumaticoAtt;
	private boolean diaframmaAtt;
	private boolean cilPneumaticoAtt;
	private boolean oleodinamicoAtt;
	private boolean elettricoAtt;
	private boolean apreAz;
	private boolean chiudeAz;
	private boolean doppioEffettoAZ;
	private String campoMolla;
	private String corsa;
	private String alimentazione;
	private String segnaleValv;
	private boolean finecorsa;
	private boolean limCorsa;
	private boolean volMan;
	private boolean trasmDiPos;
	private boolean intPneumDiBL;
	private boolean releON_OFF;
	private boolean filtroRid;
	private boolean trasmPneumatico;
	private String altroAcc;
	private String[] segnali;
	private String[] usciteReali;
	private String[] scostamenti;
	private String noteRilievi;
	private boolean compilatoRapportoInefficienza;
	private String[] strumentiUsati;
	private String[] matricoleStrUsati;
	private String verificheVarie;
	private String note;
	private String[] UDM;

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getSpecifica() {
		return specifica;
	}

	public void setSpecifica(String specifica) {
		this.specifica = specifica;
	}

	public String getCostruttore() {
		return costruttore;
	}

	public void setCostruttore(String costruttore) {
		this.costruttore = costruttore;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUbicazione() {
		return ubicazione;
	}

	public void setUbicazione(String ubicazione) {
		this.ubicazione = ubicazione;
	}

	public boolean isRegolazioneTip() {
		return regolazioneTip;
	}

	public void setRegolazioneTip(boolean regolazioneTip) {
		this.regolazioneTip = regolazioneTip;
	}

	public boolean isIntercettazioneTip() {
		return intercettazioneTip;
	}

	public void setIntercettazioneTip(boolean intercettazioneTip) {
		this.intercettazioneTip = intercettazioneTip;
	}

	public String getAltroTip() {
		return altroTip;
	}

	public void setAltroTip(String altroTip) {
		this.altroTip = altroTip;
	}

	public boolean isPneumaticoPos() {
		return pneumaticoPos;
	}

	public void setPneumaticoPos(boolean pneumaticoPos) {
		this.pneumaticoPos = pneumaticoPos;
	}

	public boolean isElettropneumaticoPos() {
		return elettropneumaticoPos;
	}

	public void setElettropneumaticoPos(boolean elettropneumaticoPos) {
		this.elettropneumaticoPos = elettropneumaticoPos;
	}

	public String getAltroPos() {
		return altroPos;
	}

	public void setAltroPos(String altroPos) {
		this.altroPos = altroPos;
	}

	public boolean isPneumaticoAtt() {
		return pneumaticoAtt;
	}

	public void setPneumaticoAtt(boolean pneumaticoAtt) {
		this.pneumaticoAtt = pneumaticoAtt;
	}

	public boolean isDiaframmaAtt() {
		return diaframmaAtt;
	}

	public void setDiaframmaAtt(boolean diaframmaAtt) {
		this.diaframmaAtt = diaframmaAtt;
	}

	public boolean isCilPneumaticoAtt() {
		return cilPneumaticoAtt;
	}

	public void setCilPneumaticoAtt(boolean cilPneumaticoAtt) {
		this.cilPneumaticoAtt = cilPneumaticoAtt;
	}

	public boolean isOleodinamicoAtt() {
		return oleodinamicoAtt;
	}

	public void setOleodinamicoAtt(boolean oleodinamicoAtt) {
		this.oleodinamicoAtt = oleodinamicoAtt;
	}

	public boolean isElettricoAtt() {
		return elettricoAtt;
	}

	public void setElettricoAtt(boolean elettricoAtt) {
		this.elettricoAtt = elettricoAtt;
	}

	public boolean isApreAz() {
		return apreAz;
	}

	public void setApreAz(boolean apreAz) {
		this.apreAz = apreAz;
	}

	public boolean isChiudeAz() {
		return chiudeAz;
	}

	public void setChiudeAz(boolean chiudeAz) {
		this.chiudeAz = chiudeAz;
	}

	public boolean isDoppioEffettoAZ() {
		return doppioEffettoAZ;
	}

	public void setDoppioEffettoAZ(boolean doppioEffettoAZ) {
		this.doppioEffettoAZ = doppioEffettoAZ;
	}

	public String getCampoMolla() {
		return campoMolla;
	}

	public void setCampoMolla(String campoMolla) {
		this.campoMolla = campoMolla;
	}

	public String getCorsa() {
		return corsa;
	}

	public void setCorsa(String corsa) {
		this.corsa = corsa;
	}

	public String getAlimentazione() {
		return alimentazione;
	}

	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}

	public String getSegnaleValv() {
		return segnaleValv;
	}

	public void setSegnaleValv(String segnaleValv) {
		this.segnaleValv = segnaleValv;
	}

	public boolean isFinecorsa() {
		return finecorsa;
	}

	public void setFinecorsa(boolean finecorsa) {
		this.finecorsa = finecorsa;
	}

	public boolean isLimCorsa() {
		return limCorsa;
	}

	public void setLimCorsa(boolean limCorsa) {
		this.limCorsa = limCorsa;
	}

	public boolean isVolMan() {
		return volMan;
	}

	public void setVolMan(boolean volMan) {
		this.volMan = volMan;
	}

	public boolean isTrasmDiPos() {
		return trasmDiPos;
	}

	public void setTrasmDiPos(boolean trasmDiPos) {
		this.trasmDiPos = trasmDiPos;
	}

	public boolean isIntPneumDiBL() {
		return intPneumDiBL;
	}

	public void setIntPneumDiBL(boolean intPneumDiBL) {
		this.intPneumDiBL = intPneumDiBL;
	}

	public boolean isReleON_OFF() {
		return releON_OFF;
	}

	public void setReleON_OFF(boolean releON_OFF) {
		this.releON_OFF = releON_OFF;
	}

	public boolean isFiltroRid() {
		return filtroRid;
	}

	public void setFiltroRid(boolean filtroRid) {
		this.filtroRid = filtroRid;
	}

	public boolean isTrasmPneumatico() {
		return trasmPneumatico;
	}

	public void setTrasmPneumatico(boolean trasmPneumatico) {
		this.trasmPneumatico = trasmPneumatico;
	}

	public String getAltroAcc() {
		return altroAcc;
	}

	public void setAltroAcc(String altroAcc) {
		this.altroAcc = altroAcc;
	}

	public String[] getSegnali() {
		return segnali;
	}

	public void setSegnali(String[] segnali) {
		this.segnali = segnali;
	}

	public String[] getUsciteReali() {
		return usciteReali;
	}

	public void setUsciteReali(String[] usciteReali) {
		this.usciteReali = usciteReali;
	}

	public String[] getScostamenti() {
		return scostamenti;
	}

	public void setScostamenti(String[] scostamenti) {
		this.scostamenti = scostamenti;
	}

	public String getNoteRilievi() {
		return noteRilievi;
	}

	public void setNoteRilievi(String noteRilievi) {
		this.noteRilievi = noteRilievi;
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

	public String[] getUDM() {
		return UDM;
	}

	public void setUDM(String[] uDM) {
		UDM = uDM;
	}
}
