package br.com.casageral.modelo;

public class CasageralModelo {

	private String marca;
	private float valor;
	private boolean status;
	private int canal;
	private int volume;

	public void preencherMarca(String pMarca) {
		marca=pMarca.toUpperCase();
	}
	public void preencherValor(float pValor) {
		valor=pValor;
	}
	public void preencherStatus(boolean pStatus) {
		status=pStatus;
	}
	public void preencherCanal(int pCanal) {
		canal=pCanal;

	}
	public void preencherVolume(int pVolume) {
		
	}
}
