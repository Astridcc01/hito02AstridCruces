package com.cuestion2;

public class Hija extends Padre {
	public String nombre;

	public Hija(String nombre, float numHijos, String nombre2) {
		super(nombre, numHijos);
		nombre = nombre2;
	}
	public void saludar() {
		System.out.println("Hola soy la hija");
	}
	
}
