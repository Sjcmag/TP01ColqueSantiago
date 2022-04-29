package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto10;
import ar.edu.unju.edm.model.Punto11;
import ar.edu.unju.edm.model.Punto12;
import ar.edu.unju.edm.model.Punto8;
import ar.edu.unju.edm.model.Punto9;
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
	    public String getCalificacion(@RequestParam(name="num1")int num1,Model model) {
			String resultadoC;
			Tp01Model unalumno = new Tp01Model();
			unalumno.setNum1(num1);
			
	    	resultadoC=unalumno.Punto6Notas(num1);
	    	model.addAttribute("resultadoC", resultadoC);
			return "Punto6";
	   
		}
		
		@Autowired
		Punto8 punto8;
		@GetMapping("/calculoMultiplos")
		public ModelAndView getMultiplo1 (@RequestParam (name= "num1") String numero) {
			punto8.setNumero1(Integer.valueOf(numero));
			String resultadoMultiplos=punto8.Punto8();
			ModelAndView modelView = new ModelAndView("punto8");
			modelView.addObject("resultado8",resultadoMultiplos);
			modelView.addObject("numero",numero);
			return modelView;
			
		}
		@Autowired
		Punto9 punto9;
		@GetMapping("/calculoRestante1")
		public ModelAndView getRestante1 (@RequestParam (name= "num1") String numero) {
			punto9.setNumero1(Integer.valueOf(numero));
			String resultadoRestante1=punto9.restante1();
			ModelAndView modelView = new ModelAndView("punto9");
			modelView.addObject("resultado9",resultadoRestante1);
			//modelView.addObject("numero",numero);
			return modelView;
			
		}
		@Autowired
		Punto10 punto10;
		@GetMapping("/calculoRestante2")
		public ModelAndView getRestante2 (@RequestParam (name= "num1") String numero) {
			punto10.setNumero1(Integer.valueOf(numero));
			String resultadoRestante2=punto10.restante2();
			ModelAndView modelView = new ModelAndView("punto10");
			modelView.addObject("resultado10",resultadoRestante2);
			return modelView;
			
		}
		
		@Autowired
		Punto11 punto11;
		@GetMapping("/calculoRestante3")
		public ModelAndView getRestante3 (@RequestParam (name= "num1") String numero) {
			punto11.setNumero1(Integer.valueOf(numero));
			String resultadoRestante3=punto11.restante3();
			ModelAndView modelView = new ModelAndView("punto11");
			modelView.addObject("resultado11",resultadoRestante3);
			return modelView;
			
		}
		@Autowired
		Punto12 punto12;
		@GetMapping("/calculoTiempo")
		public ModelAndView getRestante4 (@RequestParam (name= "num1") String numero) {
			punto12.setNumero1(Integer.valueOf(numero));
			String resultadoRestante3=punto12.calculoTiempo();
			ModelAndView modelView = new ModelAndView("punto12");
			modelView.addObject("resultado12",resultadoRestante3);
			return modelView;
		}
}
