package com.cuestion2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Padre padre=new Padre ("Juan",2);
			Hija hija=new Hija (null, 0, "María");
			padre.saludar();
			hija.saludar(); //Este método es sobreescritura/override
	}

}
//Explicación instancia de padre no posible:
//La clase padre no puede ser instanciada al crear una hija ya que
//al utlizar los mismos atributos, la "Hija" no puede tener número de hijos
//ni el nombre del padre.
//O cambiando de public a private los atributos de padre, de forma que solo se pueden utilizar en Padre.java y no en otro .java


//Creación instancia hija:
//En eclipse ya se detecta un error al instancia hija, te deja corregirlo
//añadiendo valores nulos a los campos que equivalen a 0 del padre en la hija.