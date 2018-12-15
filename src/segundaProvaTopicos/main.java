package segundaProvaTopicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		List<Funcionario> funcionarios = new ArrayList();
		
		String nome = "";
		String cpf = "";
		int op = 0;
		
		Funcionario funcionario = null;
		
		do {
			
			System.out.println(" 1.Cadastrar Funcionario \n 2.Listar Funcionario \n 3.Remover Funcionarios \n 0.Sair");
			op = scan.nextInt();
			
			switch(op) {
			
			case 1:
				 System.out.println("Digite o Nome do Funcionário");
				 nome = scan.next();
				 
				 System.out.println("Digite o Cpf do Funcionário");
				 cpf = scan.next();
				 
				 funcionario = new Funcionario(nome , cpf);
				 cadastrarFuncionario(funcionarios,funcionario);
				 
				break;
				
			case 2:
				listarFuncionarios(funcionarios);
				break;
				
			case 3:
				System.out.println("Digite o Cpf do Funcionário");
				 cpf = scan.next();
				removerFuncionario(funcionarios,cpf);
				break;
			
			}
			
		}while(op != 0);
		
	}
	
		public static boolean cadastrarFuncionario(List<Funcionario> list, Funcionario funcionario) {
			if(!(list.contains(funcionario))) {
				list.add(funcionario);
				return true;
			}else {
				return false;
			}
				
		}
		public static void listarFuncionarios(List<Funcionario> list) {
			for(Funcionario f : list)
				System.out.println(f.toString());
		}
		public static boolean removerFuncionario(List<Funcionario> list, String mat) {
			for(Funcionario f : list) {
				if(f.getCpf().equals(mat)) {
					list.remove(f);
					return true;
				}
			}
			return false;

	}

}
