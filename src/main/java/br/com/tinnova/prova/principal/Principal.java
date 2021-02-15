package br.com.tinnova.prova.principal;

import br.com.tinnova.prova.exercicios.ExercicioDois;
import br.com.tinnova.prova.exercicios.ExercicioQuatro;
import br.com.tinnova.prova.exercicios.ExercicioTres;
import br.com.tinnova.prova.exercicios.ExercicioUm;
import br.com.tinnova.prova.interfaces.Exercicios;

public class Principal {
	

	public static void main(String args[]) {
		Exercicios exercicios;
		
		exercicios = new ExercicioUm();
		exercicios.executar();
		
		exercicios = new ExercicioDois();
		exercicios.executar();
		
		exercicios = new ExercicioTres();
		exercicios.executar();
		
		exercicios = new ExercicioQuatro();
		exercicios.executar();

	}
	
}
