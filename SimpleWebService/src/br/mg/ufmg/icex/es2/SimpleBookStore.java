package br.mg.ufmg.icex.es2;

public class SimpleBookStore implements SimpleBookStoreInterface {
	
	public Livro pesquisaIsbn (int isbn) {
		Livro livro = new Livro(isbn,"Daniel");
		return livro;
	}
	public Livro pesquisaAutor (String autor) {
		Livro livro = new Livro(1234,autor);
		return livro;
	}

}
