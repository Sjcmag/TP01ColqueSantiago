package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import ar.edu.unju.edm.model.Tp01Model;

@Controller
public class Tp01Controller {
	 @GetMapping("/menu")
	   
	    
		public String obtenerMenu () {
		
		
		return ("index");
			
	}
	 @GetMapping("/calculoFactorial")
	    public String getFactorial(@RequestParam(name="num1")int num1,Model model) {
			int Fact;
			Tp01Model  unFactorial = new Tp01Model();
			unFactorial.setNum1(num1);
	    	Fact=unFactorial.Punto1Fact(num1);
	    	model.addAttribute("resultadoF", Fact);
			return "Punto1";
	    	
			
		
		}
		
		@GetMapping("/calculoBisiesto")
	    public String getBisiesto(@RequestParam(name="num1")int num1,Model model) {
			String resultado;
			Tp01Model unbisiesto=new Tp01Model();
			unbisiesto.setNum1(num1);
	    	resultado=unbisiesto.Punto2Ano(num1)
;	    	model.addAttribute("resultadoB", resultado);
			return "Punto2";
	   
		}
		@GetMapping("/calculoPar")
	    public String getPar(@RequestParam(name="num1")int num1,Model model) {
			String Par;
			Tp01Model unPar=new Tp01Model();
			unPar.setNum1(num1);
	    	Par=unPar.Punto3Primo(num1);
;	    	model.addAttribute("resultadoP", Par);
			return "Punto3";
	   
		}
		@GetMapping("/calculoMes")
	    public String getMes(@RequestParam(name="num1")int num1,Model model) {
			String resultadoM;
			Tp01Model nuevoMes=new Tp01Model();
			nuevoMes.setNum1(num1);
	    	resultadoM=nuevoMes.Punto4mes(num1);
	    	model.addAttribute("resultadoM", resultadoM);
			return "Punto4";
	   
		}
		
		@GetMapping("/calculoMes2")
	    public String getMes2(@RequestParam(name="num1")int num1,Model model) {
			String resultadoM2;
			Tp01Model nuevoMes2=new Tp01Model();
			nuevoMes2.setNum1(num1);
	    	resultadoM2=nuevoMes2.Punto5mes(num1);
	    	model.addAttribute("resultadoM2", resultadoM2);
			return "Punto5";
	   
		}
		
		@GetMapping("/calculoCalificacion")
	    public String getCalificacion(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,@RequestParam(name="num3")int num3,@RequestParam(name="num4")int num4,@RequestParam(name="num5")int num5,Model model) {
			String resultadoC;
			Tp01Model unalumno = new Tp01Model();
			unalumno.setNum1(num1);
			unalumno.setNum2(num2);
			unalumno.setNum3(num3);
			unalumno.setNum4(num4);
			unalumno.setNum5(num5);
	    	resultadoC=unalumno.Punto6Notas(num1, num2, num3, num4, num5);
	    	model.addAttribute("resultadoC", resultadoC);
			return "Punto6";
	   
		}
}
