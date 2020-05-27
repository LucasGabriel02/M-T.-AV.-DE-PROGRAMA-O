package model;

public class Cliente {
	
	private String nome;
	
	private String numero;
	
	private String email;

	
	// Construtor
	
	public Cliente(String nome, String numero, String email) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}
	
	

	// Get e Set

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", numero=" + numero + ", email=" + email + "]";
	}
	
}
