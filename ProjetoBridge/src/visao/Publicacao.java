package visao;

public abstract class Publicacao {
	
	private PublicacaoImplement Publicacao;
	
	
	public Publicacao(PublicacaoImplement g) {
		
		Publicacao = g;
	}
	
	
	public String valorTitulo(String titulo) {
		
		return Publicacao.valorTitulo( titulo);
		
	}
	
	
	
	public String valorAutor(String autor){
		
		return Publicacao.valorAutor(autor);
	}
	
	
	
	public String valorISBN(String isbn) {
		
		return Publicacao.valorISBN(isbn);
	}
	
	
	public String valorArtigo(String artigo) {
		
		return Publicacao.valorArtigo(artigo);
	}
	
	
	
	public void resultado() {
		
	}

}
