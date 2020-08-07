package br.com.testes;

import org.junit.Test;

import br.com.core.Constantes;
import br.com.core.Parametros;
import br.com.pages.DadosFicticios;

public class TestDadosFicticios extends Parametros {

	DadosFicticios step = new DadosFicticios();
	
	@Test
	
	public void executaDadosFicticios () {
		
		
		step.url(UrlFakeNameGenerator);
		step.gender("Male");
		step.nameSet("Brazil");
		step.country("Brazil");
		step.generate();
		step.capturarTudo();
		step.capturarNome();
		step.capturaEmail();
		
		
		

		
		
		
		
	}
	
	
}
