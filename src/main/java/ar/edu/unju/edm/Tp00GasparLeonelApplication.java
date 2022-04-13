package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;

@SpringBootApplication
public class Tp00GasparLeonelApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00GasparLeonelApplication.class, args);
		
		String nombre = "Leonel";
		System.out.println("hola edm,dice:  "+ nombre + " " + darNombre());
		
		//El numero 10 se pasa al numero1 y el 2 al numero2
		Calculadora miCalculadora = new Calculadora(125,3);
		
		int suma=miCalculadora.suma();
		System.out.println("la suma es: "+suma);
		
		//Simplificando la operacion anterior:
		System.out.println("la resta es: "+  miCalculadora.resta());
		
		System.out.println("la multiplicacion es: "+ miCalculadora.multiplicar());
		
		System.out.println("la potencia es: "+ miCalculadora.potencia());
		
		System.out.println("la raiz es: "+ miCalculadora.raiz());
		
		System.out.println("la raiz n es: "+ miCalculadora.raizn());
		
		double dividir = miCalculadora.dividir();
		if(dividir==0) {
			System.out.println("el divisor tiene que ser mayor a 0");
		}
		else {
			System.out.println("la division es: "+dividir);
		}
	}

	private static String darNombre() {
		String nuevonombre="Alejandro";
		return nuevonombre;
	}
}
