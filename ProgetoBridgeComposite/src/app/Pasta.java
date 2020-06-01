package app;

import java.util.ArrayList;

public class Pasta extends ArquivoC{
	
	ArrayList< ArquivoC> lista = new ArrayList<ArquivoC>();
	
	private String nome;
	
	private String subPasta;
	
	
	public void nome() {
		
		System.out.println(nome + "Lucas");
	}
	
	public void subPasta() {
			
		System.out.println(subPasta + "Área de Trablho, Lucas");
		}
	
	
	// Construtor
	
	public Pasta(ArrayList<ArquivoC> lista, String nome, String subPasta) {
		super();
		this.lista = lista;
		this.nome = nome;
		this.subPasta = subPasta;
	}

	// Get e Set

	public ArrayList<ArquivoC> getLista() {
		return lista;
	}



	public void setLista(ArrayList<ArquivoC> lista) {
		this.lista = lista;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSubPasta() {
		return subPasta;
	}



	public void setSubPasta(String subPasta) {
		this.subPasta = subPasta;
	}
	
}