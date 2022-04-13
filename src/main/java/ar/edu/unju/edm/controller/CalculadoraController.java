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
     * get mapping(siempre comienza con mayus)
     *  es una anotacion que basicamente dice 
     * q cuando llamemos a /menu nos tiene q devolver el
     * browser(index)
     * 
     */
    
	public String obtenerMenu () {
	
	
	return ("index");//devolvemos la pagina que creamos para el menu
		
}
    @GetMapping("/calculoSuma")
    public String getSuma(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	int resultadoS;
    	Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(num1);
    	nuevaCalculadora.setNumero2(num2);
    	resultadoS=nuevaCalculadora.suma();
    	model.addAttribute("resultadoS", resultadoS);
    	
    	
    	
    	return "resultado";
    }      
    
    @GetMapping("/calculoResta")
    public String getResta(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	int resultadoR;
    	Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(num1);
    	nuevaCalculadora.setNumero2(num2);
    	resultadoR=nuevaCalculadora.resta();
    	model.addAttribute("resultadoR", resultadoR);
    	
    	
    	
    	return "resultadoR";
    }      
    
    @GetMapping("/calculoMultiplica")
    public String getMultiplica(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	int resultadoM;
    	Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(num1);
    	nuevaCalculadora.setNumero2(num2);
    	resultadoM=nuevaCalculadora.multiplicar();
    	model.addAttribute("resultadomult", resultadoM);
    	
    	
    	
    	return "resultadomult";
    }      

     
    @GetMapping("/calculoDivide")
    public String getDivide(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	double resultadoD;
    	Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(num1);
    	nuevaCalculadora.setNumero2(num2);
    	resultadoD=nuevaCalculadora.dividir();
    	model.addAttribute("resultadodiv", resultadoD);
    	
    	
    	
    	return "resultadodiv";
    }    
    
    
    @GetMapping("/calculoRaiz")
    public String getRaiz(@RequestParam(name="num1")int num1,Model model) {
    	int resultadoRaiz;
    	Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(num1);
    	resultadoRaiz=nuevaCalculadora.raiz();
    	model.addAttribute("resultadoraiz", resultadoRaiz);
    	
    	
    	
    	return "resultadoraiz";
    }      
    
    
    @GetMapping("/calculoRaizN")
    public String getRaizN(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	double resultadoRN;
    	Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(num1);
    	nuevaCalculadora.setNumero2(num2);
    	resultadoRN=nuevaCalculadora.raizn();
    	model.addAttribute("resultadoRN", resultadoRN);
    	
    	
    	
    	return "resultadoRN";
    }      
    
    
    @GetMapping("/calculoPotencia")
    public String getPotencia(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model) {
    	int resultadoP;
    	Calculadora nuevaCalculadora = new Calculadora();
    	nuevaCalculadora.setNumero1(num1);
    	nuevaCalculadora.setNumero2(num2);
    	resultadoP=nuevaCalculadora.potencia();
    	model.addAttribute("resultadopot", resultadoP);
    	
    	
    	
    	return "resultadopot";
    }      




        
}
