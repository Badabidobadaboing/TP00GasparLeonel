package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Calculadora;

//Se especifica con que clase se esta trabajando
@Controller
public class CalculadoraController {
	
	
    @GetMapping("/menu")
    /*
     * get mapping (siempre debe comenzar con mayuscula)
     * es una anotacion que indica que cuando 
     * llamemos a /menu este nos debe devolver el
     * browser(index) 
     */
    
	public String obtenerMenu () {
	
	
	return ("index");//Se devuelve la pagina que creamos para el menu
		
}
    @GetMapping("/calculoSuma")
    public String getSuma(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	int resultadoS;
    	Calculadora NuevaCalculadora = new Calculadora();
    	NuevaCalculadora.setNumero1(num1);
    	NuevaCalculadora.setNumero2(num2);
    	resultadoS=NuevaCalculadora.suma();
    	model.addAttribute("resultadoS", resultadoS);
    	
    	
    	
    	return "resultado";
    }      
    
    @GetMapping("/calculoResta")
    public String getResta(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	int resultadoR;
    	Calculadora NuevaCalculadora = new Calculadora();
    	NuevaCalculadora.setNumero1(num1);
    	NuevaCalculadora.setNumero2(num2);
    	resultadoR=NuevaCalculadora.resta();
    	model.addAttribute("resultadoR", resultadoR);
    	
    	
    	
    	return "resultadoR";
    }      
    
    @GetMapping("/calculoMultiplica")
    public String getMultiplica(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	int resultadoM;
    	Calculadora NuevaCalculadora = new Calculadora();
    	NuevaCalculadora.setNumero1(num1);
    	NuevaCalculadora.setNumero2(num2);
    	resultadoM=NuevaCalculadora.multiplicar();
    	model.addAttribute("resultadomult", resultadoM);
    	
    	
    	
    	return "resultadomult";
    }      

     
    @GetMapping("/calculoDivide")
    public String getDivide(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	double resultadoD;
    	Calculadora NuevaCalculadora = new Calculadora();
    	NuevaCalculadora.setNumero1(num1);
    	NuevaCalculadora.setNumero2(num2);
    	resultadoD=NuevaCalculadora.dividir();
    	model.addAttribute("resultadodiv", resultadoD);
    	
    	
    	
    	return "resultadodiv";
    }    
    
    
    @GetMapping("/calculoRaiz")
    public String getRaiz(@RequestParam(name="num1")int num1,Model model) {
    	int resultadoRaiz;
    	Calculadora NuevaCalculadora = new Calculadora();
    	NuevaCalculadora.setNumero1(num1);
    	resultadoRaiz=NuevaCalculadora.raiz();
    	model.addAttribute("resultadoraiz", resultadoRaiz);
    	
    	
    	
    	return "resultadoraiz";
    }      
    
    
    @GetMapping("/calculoRaizN")
    public String getRaizN(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	double resultadoRN;
    	Calculadora NuevaCalculadora = new Calculadora();
    	NuevaCalculadora.setNumero1(num1);
    	NuevaCalculadora.setNumero2(num2);
    	resultadoRN=NuevaCalculadora.raizn();
    	model.addAttribute("resultadoRN", resultadoRN);
    	
    	
    	
    	return "resultadoRN";
    }      
    
    
    @GetMapping("/calculoPotencia")
    public String getPotencia(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	int resultadoP;
    	Calculadora NuevaCalculadora = new Calculadora();
    	NuevaCalculadora.setNumero1(num1);
    	NuevaCalculadora.setNumero2(num2);
    	resultadoP=NuevaCalculadora.potencia();
    	model.addAttribute("resultadopot", resultadoP);
    	
    	
    	
    	return "resultadopot";
    }      
    
}
