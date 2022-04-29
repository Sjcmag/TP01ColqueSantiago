package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto12 {
	
   private int numero1;
   
   public Punto12() {
	   
   }
   
   public Punto12(int numero1) {
	   super();
	   this.numero1=numero1;
	   
   }

public int getNumero1() {
	return numero1;
}

public void setNumero1(int numero1) {
	this.numero1 = numero1;
}
   
public String calculoTiempo() {
	String resultadoString="";
	double resultadoInteger;
	double g=9.8;
	if(this.numero1>0) {
		resultadoInteger=Math.sqrt((2*this.numero1)/g);
		resultadoString=resultadoString+Double.toString(resultadoInteger);
		return resultadoString;
	}
	else {
		resultadoString="El numero ingresado tiene que ser mayor a 0";
		return resultadoString;
	}
}
	   
   }