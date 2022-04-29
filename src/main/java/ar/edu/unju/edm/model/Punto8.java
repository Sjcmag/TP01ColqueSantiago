package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto8 {
	
   private int numero1;
   
   public Punto8() {
	   
	   
   }
   
   public Punto8(int numero1) {
	   super();
	   this.numero1=numero1;
	   
   }

public int getNumero1() {
	return numero1;
}

public void setNumero1(int numero1) {
	this.numero1 = numero1;
}
   
    public String Punto8() {
	   
	   String resultadoString= "";
	   int resultadoInteger=1;
	   int factorMultiplicador=1;
	   do {
		   resultadoInteger=this.numero1 * factorMultiplicador;
		   factorMultiplicador=factorMultiplicador+1;
		   resultadoString = resultadoString + Integer.toString(resultadoInteger) + " - ";
	   }
	   while((resultadoInteger + this.numero1)< 100);
	   return resultadoString;
 }
	   
   }