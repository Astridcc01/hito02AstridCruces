package com.cuestion2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Padre padre=new Padre ("Juan",2);
			Hija hija=new Hija (null, 0, "Mar�a");
			padre.saludar();
			hija.saludar(); //Este m�todo es sobreescritura/override
	}

}
//Explicaci�n instancia de padre no posible:
//La clase padre no puede ser instanciada al crear una hija ya que
//al utlizar los mismos atributos, la "Hija" no puede tener n�mero de hijos
//ni el nombre del padre.
//O cambiando de public a private los atributos de padre, de forma que solo se pueden utilizar en Padre.java y no en otro .java


//Creaci�n instancia hija:
//En eclipse ya se detecta un error al instancia hija, te deja corregirlo
//a�adiendo valores nulos a los campos que equivalen a 0 del padre en la hija.