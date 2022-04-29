package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto9 {
	
   private int numero1;
   
   public Punto9() {
	   
	   
   }
   
   public Punto9(int numero1) {
	   super();
	   this.numero1=numero1;
	   
   }

public int getNumero1() {
	return numero1;
}

public void setNumero1(int numero1) {
	this.numero1 = numero1;
}
   
   public String restante1() {
	   String resultadoString= "";
	   int resultadoInteger=1;
	   int restante=20;
	   this.numero1=this.numero1+20;
	   for (int i=1 ; i!=10 ; i++)   {
		   resultadoInteger=this.numero1  - restante ;
		   this.numero1=resultadoInteger;
		   resultadoString = resultadoString + Integer.toString(resultadoInteger) + " - ";
	   }
	   return resultadoString;
	   
	   
   } 
	   
   }
	   
	   
   