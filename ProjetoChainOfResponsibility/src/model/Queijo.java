package model;

public class Queijo extends Pizza{
	
	private String cobertura;
	
	private String doisSabores;

	public Queijo(String nome, String numero, String email, String sabor, String tamanho, String cobertura,
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
		return "Queijo [ Cobertura: Sem Cobertura=" + cobertura + ", Sabor: Portuguesa=" + doisSabores + "]";
	}
	
	
	

}
