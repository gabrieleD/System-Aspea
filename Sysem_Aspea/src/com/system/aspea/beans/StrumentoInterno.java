package com.system.aspea.beans;

public class StrumentoInterno extends StrumentoAstratto{

	private String matricola;
	private String classe;
	private String campioneDiRiferimento;
	private String laboratorioTaratura;
	private String ubicazione;
	private String[] unitaDiMisura;
	private String[] valoreMax;
	private int numero;
	private String categoria;

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getCampioneDiRiferimento() {
		return campioneDiRiferimento;
	}

	public void setCampioneDiRiferimento(String campioneDiRiferimento) {
		this.campioneDiRiferimento = campioneDiRiferimento;
	}

	public String getLaboratorioTaratura() {
		return laboratorioTaratura;
	}

	public void setLaboratorioTaratura(String laboratorioTaratura) {
		this.laboratorioTaratura = laboratorioTaratura;
	}

	public String getUbicazione() {
		return ubicazione;
	}

	public void setUbicazione(String ubicazione) {
		this.ubicazione = ubicazione;
	}

	public String[] getUnitaDiMisura() {
		return unitaDiMisura;
	}

	public void setUnitaDiMisura(String[] unitaDiMisura) {
		this.unitaDiMisura = unitaDiMisura;
	}

	public String[] getValoreMax() {
		return valoreMax;
	}

	public void setValoreMax(String[] valoreMax) {
		this.valoreMax = valoreMax;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
