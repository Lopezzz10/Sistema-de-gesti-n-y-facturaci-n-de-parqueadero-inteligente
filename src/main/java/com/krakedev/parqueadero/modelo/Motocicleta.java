package com.krakedev.parqueadero.modelo;

public class Motocicleta extends Vehiculo {
	
	private int cilindraje;

	public Motocicleta(String placa, String propietario, int cilindraje) {
		super(placa, propietario);
		this.cilindraje = cilindraje;
	}
	
	@Override
	public double calcularTarifa(int horasPermanencia) {
	    if (cilindraje > 250) {
	        return horasPermanencia * 1.00;
	    }
	    return horasPermanencia * 0.75;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	
	@Override
	public String toString() {
	    return "Motocicleta [placa=" + getPlaca() + ", propietario=" + getPropietario() + ", horaIngreso=" + getHoraIngreso() +
	            ", cilindraje=" + cilindraje + "]";
	}
	
}
