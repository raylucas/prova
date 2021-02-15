package br.com.tinnova.prova.exercicios;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.tinnova.prova.interfaces.Exercicios;

public class ExercicioTres implements Exercicios{
	
	  private static final Logger logger = LogManager.getLogger(ExercicioTres.class);  
	  

	public void executar() {
		
		logger.info("************* Início Exercício Três *************");
		logger.info("Digite um número para calcular seu fatorial:");

		Scanner scanner = new Scanner(System.in);
	    double numero = scanner.nextDouble();
	    
		logger.info("Fatorial de " + numero + ": " +  calculaFatorial(numero));
		logger.info("************* Fim Exercício Três *************\n");

		
	}
	
	public Double calculaFatorial(double numero) {
		if(numero == 0) {
			return 1.0;
		}
	
		double fatorial = numero;
		
		while (numero > 1){
			fatorial = fatorial *(numero - 1); numero--;
		}	
		
		return fatorial;
	}

}
