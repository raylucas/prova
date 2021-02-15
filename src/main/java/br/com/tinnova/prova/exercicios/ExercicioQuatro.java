package br.com.tinnova.prova.exercicios;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.tinnova.prova.interfaces.Exercicios;

public class ExercicioQuatro implements Exercicios{
	
	private static final int TRES = 3;
	private static final int CINCO = 5;

	
	private static final Logger logger = LogManager.getLogger(ExercicioQuatro.class);  

	public void executar() {
		logger.info("************* Início Exercício Quatro *************");
		logger.info("Digite um número para calcular seu fatorial:");

		Scanner scanner = new Scanner(System.in);
	    int numero = scanner.nextInt();
	    
		logger.info("A soma dos multiplos de 3 e 5 abaixo de " + numero + ": " +  calculaMultiplos(numero));
		logger.info("************* Fim Exercício Quatro *************");		
	}
	
	public int calculaMultiplos(int numero) {
	    int soma = 0;
	    
	    for(int i = 1; i < numero; i++) {
	    	
	    	if(i % TRES == 0 || i % CINCO == 0){
	    		soma += i;
	        }
	       
	    }
	    
	   return soma;
	}

}
