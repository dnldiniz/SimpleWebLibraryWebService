package br.mg.ufmg.icex.es2;

public interface SimpleBookStoreInterface {

	Livro pesquisaIsbn (int isbn) throws Exception;
	Livro pesquisaAutor (String autor) throws Exception;
}
