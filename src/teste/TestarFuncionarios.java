package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import segundaProvaTopicos.Funcionario;
import segundaProvaTopicos.main;

class TestarFuncionarios {
	
	
	List<Funcionario> funcionarios = null;
	Funcionario f = null;
	
	@Before
	public void incializa() {
		f = new Funcionario("leo", "111");
		funcionarios = new ArrayList();
	}

	@Test
	public void testeCadastro() {		
		main.cadastrarFuncionario(funcionarios, f);
		
		assertEquals(f, funcionarios.get(0));
	}
	@Test
	public void testeCadastro2Iguais() {
		Funcionario c = new Funcionario("alguem", "123");
		
		boolean funcionario1 = main.cadastrarFuncionario(funcionarios, f);
		boolean funcionario2 = main.cadastrarFuncionario(funcionarios, c);
		
		assertTrue(funcionario1);
		assertFalse(funcionario2);
	}
	
	@Test
	public void testeRemover() {
		main.cadastrarFuncionario(funcionarios, f);
		
		boolean remove1 = main.removerFuncionario(funcionarios, f.getCpf());
		
		assertTrue(remove1);
			
	}


}
