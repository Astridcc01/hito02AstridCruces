package com.cuestion3;


public class Principal {

	public static void main(String[] args) {
			  Perro perro = new Perro();
			  Gato gato = new Gato();
			  
			  perro.sonido();
			  gato.sonido();
			  
			  Animal[] zoo={gato,perro};
				zoo[0].sonido();
				zoo[1].sonido();
	}

}

//En programaci�n orientada a objetos, polimorfismo es la capacidad que tienen los objetos de una clase 
//en ofrecer respuesta distinta e independiente en funci�n de los par�metros.
//Creando un array y usando el polimorfismo hace que podamos meter distintos animales en un mismo array diferenci�ndose por clase.
