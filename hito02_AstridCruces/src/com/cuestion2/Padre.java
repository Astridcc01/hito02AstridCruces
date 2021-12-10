package com.cuestion2;

public class Padre {
	//Atributos
	public String nombre;
	public float numHijos;
	//Constructor
	public Padre(String nombre, float numHijos) {
		super();
		this.nombre = nombre;
		this.numHijos = numHijos;
	}
	public void saludar() {
		System.out.println("Hola soy el padre");
	}
	
}
