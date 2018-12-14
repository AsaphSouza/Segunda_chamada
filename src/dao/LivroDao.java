package dao;

import java.util.ArrayList;

import entidades.Livro;

public class LivroDao {

private ArrayList<Livro> livros = new ArrayList<>();
	
	public  void cadastrar (Livro livro) {
		for (int i = 0; i < livros.size(); i++) {
			if (!livro.getTitulo().equals(livros.get(i).getTitulo())) {
				livros.add(livro);
			}
		}
	}
	
	public void listar () {
		for (int i = 0; i < livros.size(); i++) {
			livros.get(i).toString();
		}
	}
	
	public boolean remover (String titulo) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getTitulo().equals(titulo)) {
				livros.remove(i);
				return true;
			}
		} 
		return false;
	}


	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
}
