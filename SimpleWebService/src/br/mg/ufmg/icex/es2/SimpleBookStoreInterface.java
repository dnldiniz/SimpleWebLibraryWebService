package br.mg.ufmg.icex.es2;

public interface SimpleBookStoreInterface {

	Livro pesquisaIsbn (int isbn);
	Livro pesquisaAutor (String autor);
}
