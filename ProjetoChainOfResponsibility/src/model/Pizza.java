package model;

public class Pizza extends Cliente {
	
	private String sabor;
	
	private String tamanho;
	
	
	// Construtor
	

	public Pizza(String nome, String numero, String email, String sabor, String tamanho) {
		super(nome, numero, email);
		this.sabor = sabor;
		this.tamanho = tamanho;
	}


	
	// Get e Set
	
	
	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public String getTamanho() {
		return tamanho;
	}


	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}



	@Override
	public String toString() {
		return "Pizza [Sabor: Queijo=" + sabor + ", Tamanho: Tamanho Familia=" + tamanho + "]";
	}
	
	
	
}
