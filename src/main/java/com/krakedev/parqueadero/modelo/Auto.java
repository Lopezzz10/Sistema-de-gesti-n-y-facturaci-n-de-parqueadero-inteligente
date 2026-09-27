package com.krakedev.parqueadero.modelo;

public class Auto extends Vehiculo {
	
	private int numeroPuertas;

	public Auto(String placa, String propietario, int numeroPuertas) {
		super(placa, propietario);
		this.numeroPuertas = numeroPuertas;
	}
	
	@Override
	public double calcularTarifa(int horasPermanecidas) {
		double total;
		total = horasPermanecidas * 1.50;
		if(horasPermanecidas > 4) {
			total +=2.00;
		}
		return total;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	
	@Override
	public String toString() {
		return "Auto [placa=" + getPlaca() + ", propietario=" + getPropietario() + ", horaIngreso=" + getHoraIngreso() + 
				"numero de puertas "+  numeroPuertas+"]";
	}
	
}
