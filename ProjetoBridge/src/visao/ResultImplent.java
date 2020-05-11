package visao;

public class ResultImplent implements PublicacaoImplement {
	
	
	public ResultImplent() {}
	
	public String valorTitulo(String titulo) {
		
		return (titulo+ "Poesia");
	}
	
	
	public String valorAutor(String autor) {
		
		return (autor+ "Braulio Bessa");
	}
	
	
	public String valorISBN(String isbn) {
		return (isbn+ "978 85 68941 05 8");
	}
	
	
	public String valorArtigo(String artigo) {
		
		return (artigo+ "Poesia");
	}

}
