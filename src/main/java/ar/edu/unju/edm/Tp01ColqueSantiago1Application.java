package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Punto12;
import ar.edu.unju.edm.model.Tp01Model;

@SpringBootApplication
public class Tp01ColqueSantiago1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp01ColqueSantiago1Application.class, args);
     Tp01Model unPunto = new Tp01Model();
     System.out.println("Es :"+unPunto.Punto1Fact(4));
     System.out.println("Es: "+unPunto.Punto2Ano(2004));
     System.out.println("Es :" +unPunto.Punto3Primo(3));
     System.out.println("Es :"+unPunto.Punto4mes(4));
     System.out.println("Es ;"+unPunto.Punto5mes(2006));
   Punto12 tiempo=new Punto12(3);
   
     System.out.println("es:"+tiempo.calculoTiempo());

	}
 }
