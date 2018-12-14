package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dao.LivroDao;
import entidades.Livro;

class teste {

	@Test
	public void testeCadastro () {
		Livro l = new Livro("correr","José",1950);
		LivroDao livro = new LivroDao();
		livro.cadastrar(l);
		assertNotNull(livro.getLivros());
	}
	
	@Test
	public void testeRemover() {
		LivroDao livro = new LivroDao();
		Livro l = new Livro("correr","José",1950);
		livro.cadastrar(l);
		
		assertTrue(livro.remover("correr"));
	}

}
