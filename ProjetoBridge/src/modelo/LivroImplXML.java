package modelo;

import visao.Livro;
import visao.PublicacaoImplement;

public class LivroImplXML extends Livro{
	
	
	private String titulo;
	
	private String autor;
	
	private String isbn;
	
	
	//Construtor
	
	public LivroImplXML(PublicacaoImplement g, String titulo, String autor, String isbn) {
		super(g);
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}
	
	

	//ToString
	@Override
	public String toString() {
		return "LivroImplXML [Poesia que Tranforma=" + titulo + ", Braulio Bessa=" + autor + ", 978 85 68941 05 8=" + isbn + "]";
	}
	
	


	//Get e Set
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



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	
	

	
	
	


}