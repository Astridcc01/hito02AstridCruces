package com.cuestion1;


public class Trabajador {
	//Atributos y tipos de dato
	public String nombre;
	public String ciudad;
	public float salarioBruto;
	public boolean contratoTemporal;
	//Constructor
	public Trabajador(String nombre, String ciudad, float salarioBruto, boolean contratoTemporal) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.salarioBruto = salarioBruto;
		this.contratoTemporal = contratoTemporal;
	}
	//Getters y setters	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public float getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public boolean isContratoTemporal() {
		return contratoTemporal;
	}
	public void setContratoTemporal(boolean contratoTemporal) {
		this.contratoTemporal = contratoTemporal;
	}
	//Método genérico para mostrar la ficha de trabajador
	public String toString() {
		return "Trabajador1 [nombre=" + nombre + ", ciudad=" + ciudad + ", salarioBruto=" + salarioBruto + ", contratoTemporal=" + contratoTemporal + "]";
	}
}//Cierra clase


