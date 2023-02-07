package modulo1;

import java.util.Scanner;

public class ong {

	static final double Cotacao = 5.14;
	
	public static void main(String[] args) {
		double doacaoDolares, doacaoReais; 
		double investimento = 0; 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual o valor do investimento? ");
		doacaoDolares = s.nextDouble();
		doacaoReais = doacaoDolares * Cotacao;
		
		if(doacaoReais> 1 && doacaoReais>1000) {
			investimento = doacaoReais * 0.15;
		}else if (doacaoReais> 1 && doacaoReais<1000){
			investimento = doacaoReais * 0.05;
		}else {
			System.out.println("Valor inaceitavel para uma doação!");
			doacaoReais = 0;
			investimento = 0;
		}
		
		System.out.println("O valor da doação em reais foi de: " + doacaoReais);
		System.out.println("O valor do investimento será de: " + String.format("%.2f", investimento));
		
		s.close();
		
	}

}
