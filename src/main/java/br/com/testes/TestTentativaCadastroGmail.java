package br.com.testes;

import org.junit.Test;

import br.com.core.Parametros;
import br.com.pages.TentativaCadastroGmail;

public class TestTentativaCadastroGmail extends Parametros {
	
	TentativaCadastroGmail step = new TentativaCadastroGmail();

	@Test
	public void executaTentativaCadastroGmail () throws InterruptedException {
		
		step.signin();
		step.criarConta();
		step.nome(armazenaNome);
		step.sobrenome(armazenaNome);
		step.email(armazenaEmail);
		step.senha(senhaGmail);
		step.confirmaSenha(senhaGmail);
		step.proxima();
		
		
		
	}
	
}
