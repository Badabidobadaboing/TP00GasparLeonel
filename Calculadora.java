package ar.edu.unju.edm;

public class Calculadora {
	//atribute
	private int numero1;
	private int numero2;
	
	
	//constructors
	
	public Calculadora(int numero1,int numero2) {
		
		this.numero1=numero1;
		this.numero2=numero2;
	}
	
	//methos basics operations
	
	public int suma() {
		int resultadosuma=this.numero1 + this.numero2;
		return resultadosuma;
	}
	
	public int resta() {
		int resultadoresta=this.numero1 - this.numero2;
		return resultadoresta;
	}
	
	public int multiplicar() {
		int resultadomultiplicar=this.numero1 * this.numero2;
		return resultadomultiplicar;
	}
	
	public double dividir() {
		if(numero2>0) {
			double resultadodividir=(double)this.numero1 / (double)this.numero2;
			return resultadodividir;
		}
		else {
			int resultadoresta=this.numero1 - this.numero2;
			return resultadoresta;
		}
		
		public int multiplicar() {
			int resultadomultiplicar=this.numero1 * this.numero2;
			return resultadomultiplicar;
		}
		
		public double dividir() {
			if(numero2>0) {
				double resultadodividir=(double)this.numero1 / (double)this.numero2;
				return resultadodividir;
			}
			else {
				return 0;
				
			}
			
		}
		
		public int getNumero1() {
			return numero1;
		}
		
		public void setNumero1(int numero1) {
			this.numero1 = numero1;
		}
		
		public int getNumero2() {
			return numero2;
		}
	}
	

	