package dao;

import java.util.ArrayList;

import entidades.Livro;

public class LivroDao {

ArrayList<Livro> livros = new ArrayList<>();
	
	public  void cadastrar (Livro livro) {
		for (int i = 0; i < livros.size(); i++) {
			if (!livro.getTitulo().equals(livros.get(i).getTitulo())) {
				livros.add(livro);
			}
		}
	}
	
}
