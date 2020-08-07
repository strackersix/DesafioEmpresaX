package br.com.suite;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.core.DriverFactory;
import br.com.testes.TestDadosFicticios;
import br.com.testes.TestTentativaCadastroGmail;

@RunWith(Suite.class)
@SuiteClasses({

	TestDadosFicticios.class,
	TestTentativaCadastroGmail.class,	


})

public class SuiteGeral {

	@AfterClass
	public static void finaliza() throws InterruptedException {

//		DriverFactory.finalizarDriverFactory();
		
		
	}

}
