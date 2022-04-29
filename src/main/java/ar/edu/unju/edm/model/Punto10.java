package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto10 {
	
   private int numero1;
   
   public Punto10() {
	   
	   
   }
   
   public Punto10(int numero1) {
	   super();
	   this.numero1=numero1;
	   
   }

public int getNumero1() {
	return numero1;
}

public void setNumero1(int numero1) {
	this.numero1 = numero1;
}
   
    public String restante2() {
	   String resultadoString= "";
	   int resultadoInteger=1;
	   int restante=20;
	   this.numero1=this.numero1+20;
	   while (this.numero1!=160) {
		   resultadoInteger=this.numero1 - restante ;
		   this.numero1=resultadoInteger;
		   resultadoString = resultadoString + Integer.toString(resultadoInteger) + " - ";
	   }
	   return resultadoString;
	   
	   
 } 
	   
   }