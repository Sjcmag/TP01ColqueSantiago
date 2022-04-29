package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto11 {
	
   private int numero1;
   
   public Punto11() {
	   
	   
   }
   
   public Punto11(int numero1) {
	   super();
	   this.numero1=numero1;
	   
   }

public int getNumero1() {
	return numero1;
}

public void setNumero1(int numero1) {
	this.numero1 = numero1;
}
   
    public String restante3() {
	   String resultadoString= "";
	   int resultadoInteger=1;
	   int restante=20;
	   this.numero1=this.numero1+20;
	    do {
		   resultadoInteger=this.numero1 - restante ;
		   this.numero1=resultadoInteger;
		   resultadoString = resultadoString + Integer.toString(resultadoInteger) + " - ";
	   }while(this.numero1 > 160);
	   return resultadoString;
	   
	   
 } 
	   
   }