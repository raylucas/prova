package br.com.tinnova.prova.exercicios;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.tinnova.prova.interfaces.Exercicios;
import br.com.tinnova.prova.modelo.Voto;

public class ExercicioUm implements Exercicios{
	
	  private static final Logger logger = LogManager.getLogger(ExercicioUm.class);  


	public void executar() {
		
		logger.info("************* In�cio Exerc�cio Um *************");
		
		Voto voto = new Voto();	
		logger.info("Percentual Votos V�lidos: " + voto.percentualValidosTotal());
		logger.info("Percentual Votos Brancos: " + voto.percentualBrancosTotal());
		logger.info("Percentual Votos Nulos: " + voto.percentualNulosTotal());
		
		logger.info("************* Fim Exerc�cio Um *************\n");

		
	}

}
