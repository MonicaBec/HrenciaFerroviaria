package com.cursoceat.model;

public class Vagon {

	int numId,cargaMax,cargaActual;
	String mercancia;
	public Vagon(int numId, int cargaMax, int cargaActual, String mercancia) {
		this.numId = numId;
		this.cargaMax = cargaMax;
		this.cargaActual = cargaActual;
		this.mercancia = mercancia;
	}
	public Vagon() {
	}
	public int getNumId() {
		return numId;
	}
	public void setNumId(int numId) {
		this.numId = numId;
	}
	public int getCargaMax() {
		return cargaMax;
	}
	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}
	public int getCargaActual() {
		return cargaActual;
	}
	public void setCargaActual(int cargaActual) {
		this.cargaActual = cargaActual;
	}
	public String getMercancia() {
		return mercancia;
	}
	public void setMercancia(String mercancia) {
		this.mercancia = mercancia;
	}
	
	
	
	
}
