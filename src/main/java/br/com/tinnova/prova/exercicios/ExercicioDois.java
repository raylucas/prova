package br.com.tinnova.prova.exercicios;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.tinnova.prova.interfaces.Exercicios;

public class ExercicioDois implements Exercicios{
	
	private static final Logger logger = LogManager.getLogger(ExercicioDois.class);  

	public void executar() {
		
		logger.info("************* Início Exercício Dois *************");
		
		int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6};
	
		logger.info("Vetor Antes Ordenação: " + montarVetor(vetor));
		
		ordenar(vetor);
		
		logger.info("Vetor Após Ordenação: " + montarVetor(vetor));
		
		logger.info("************* Fim Exercício Dois *************\n");

		
	}
	
	public void ordenar(int[] vetor) {
		for(int i = 0; i < vetor.length - 1; i++) {
			for(int j = 0; j < vetor.length - 1 - i; j++) {
				if(vetor[j] > vetor[j + 1]) {
					int aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
	}
	
	public String montarVetor(int[] vetor) {
		StringBuilder vetorString = new StringBuilder();
		for(int numero : vetor) {
			vetorString.append(numero);
			vetorString.append(" ");
		}
		
		return vetorString.toString();
	}

}
