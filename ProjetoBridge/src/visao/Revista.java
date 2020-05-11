package visao;

public class Revista extends Publicacao{
	
	public Revista(PublicacaoImplement g) {
			
			super(g);
		}
		
		public void resultado() {
			
			System.out.println(valorTitulo("Poesia"));
			
			System.out.println(valorAutor("Braulio Bessa"));
			
			System.out.println(valorISBN("978 85 68941 05 8"));
			
			System.out.println(valorArtigo("Poesia"));
		}
	
	

}
