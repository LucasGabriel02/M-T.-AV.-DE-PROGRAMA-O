package model;

public class Portuguesa extends Pizza{
	
	private String cobertura;
	
	private String doisSabores;

	
	
	// Construtor
	
	public Portuguesa(String nome, String numero, String email, String sabor, String tamanho, String cobertura,
			String doisSabores) {
		super(nome, numero, email, sabor, tamanho);
		this.cobertura = cobertura;
		this.doisSabores = doisSabores;
	}



	// Get e Set
	
	public String getCobertura() {
		return cobertura;
	}



	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}



	public String getDoisSabores() {
		return doisSabores;
	}



	public void setDoisSabores(String doisSabores) {
		this.doisSabores = doisSabores;
	}



	@Override
	public String toString() {
		return "Portuguesa [ Cobertura na Borda de Chocolate=" + cobertura + ", Sabor: Queijo com Calabresa=" + doisSabores + "]";
	}
	
	
	
}
