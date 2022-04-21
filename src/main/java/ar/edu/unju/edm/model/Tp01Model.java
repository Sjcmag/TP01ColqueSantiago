package ar.edu.unju.edm.model;
import org.springframework.stereotype.Component;


@Component
public class Tp01Model {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    public Tp01Model() {
		
	}
	
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}
	public int getNum4() {
		return num4;
	}

	public void setNum4(int num4) {
		this.num4 = num4;
	}public int getNum5() {
		return num5;
	}

	public void setNum5(int num5) {
		this.num5= num5;
	}
    public Tp01Model(int num1,int num2,int num3,int num4 ,int num5) {
		
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		this.num4=num4;
		this.num5=num5;
	}
	
	public int   Punto1Fact(int num1) {
		int fact=1;
		 	for(int i = 2; i <= num1;i++) {
		 		fact *= i;
		 	}
		 
		return fact;
		
	}
	public String Punto2Ano(int num2) {
		String ano= "no es bisiesto";
		int aux;
		if (num2 == 1 && num2 ==2 && num2 ==3) {
			return ano;
		}
		else {
			aux=num2%4;
			if(aux==0) {
				ano = "es bisiesto";
				return ano;
			}
			else {
				return ano;
			}
		}
	}
    public String Punto3Primo(int num1) {
    	int cant=0;
    	String resultado= "No es par";
    	
    	if(num1%2 ==0) {
    		resultado = "es par";
    		return resultado;
    	}
    	else {
    		return  resultado ;
    	}
    }
    public String  Punto4mes(int num1) {
    	String  esmes="El numero ingresado no corresponde a un mes";
    	if(num1>1 && num1>12) {
    		esmes="El numero ingresado corresponde a un mes del anio-2";
    		return esmes;
    	}
    	else {
    		return esmes;
    	}
    }
    public String Punto5mes (int num1) {
    	String mes;
    	switch (num1){
    		case 1:
    			mes="Enero";
    			break;
    		case 2:
    			mes="Febrero";
    			break;
    		case 3:
    			mes="Marzo";
    			break;
    		case 4:
    			mes="Abril";
    			break;
    		case 5:
    			mes="Mayo";
    			break;
    		case 6:
    			mes="junio";
    			break;
    		case 7:
    			mes="Julio";
    			break;
    		case 8:
    			mes="Agosto";
    			break;
    		case 9:
    			mes="Septiembre";
    			break;
    		case 10:
    			mes="Octubre";
    			break;
    		case 11:
    			mes="Nobienmbre";
    			break;
    		case 12:
    			mes="Diciembre";
    			break;
    		default:
    			mes="El numero ingresado no es un mes";
    			break;
    	}
    	return mes;
    	
    }
    public String Punto6Notas(int num1 ,int num2,int num3,int num4,int num5) {
    	String Resultado;
    	int resultad=num1+num2+num3+num4+num5;
    	resultad=resultad/5;
    	if (resultad==6) {
        	Resultado ="alumno regulizado";
        	return Resultado;
    	 }
         else {
        	 if(resultad>6 && resultad<11) {
        		 return Resultado="el alumno es promocionado";
        	 }
        	 else {
        		 if (resultad<6 &&resultad>1) {
        			 return Resultado="el alumno desaprueba";
        		 }
        		 else {
        			 return Resultado="el valor no es permitido";
        		 }
        	 }
         }
    }
    


}
