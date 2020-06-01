package model;

public abstract class Lanchee implements LancheImplementada{
	
	private LancheImplementada Lanchee;
	
	public Lanchee(LancheImplementada g) {
		
		Lanchee = g;
	}
	
	public String valorRefrigerante(String refrigerante) {
			
			return Lanchee.valorRefrigerante(refrigerante);
	}
	
	public String valorTamanho(String tamanho) {
		
		return Lanchee.valorTamanho(tamanho);
		
	}
	
	public String valorQuantidade(String quantidadeGole) {
		
		
		return Lanchee.valorQuantidade(quantidadeGole);
	}
	
	public String valorPasta(String pasta) {
		
		return Lanchee.valorPasta(pasta);
		
	}
	
	public String valorArquivo(String arquivo) {
		
		return Lanchee.valorArquivo(arquivo);
	}
	
	
	
	public void resultado() {
		
	}

}
