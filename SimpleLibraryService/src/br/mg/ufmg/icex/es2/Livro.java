package br.mg.ufmg.icex.es2;

public class Livro {
	
	private int isbn;
	private String titulo;
	private String autor;
	private String editora = "Editora Abril";
	private int ano = 2015;
	
	
	public Livro() {
	}
	
	public Livro(String autor_, String titulo_, int isbn_) {
		this.isbn = isbn_;
		this.autor = autor_;
		this.titulo = titulo_;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
