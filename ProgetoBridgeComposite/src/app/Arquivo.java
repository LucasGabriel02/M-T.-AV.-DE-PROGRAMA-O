package app;

import java.util.ArrayList;

public class Arquivo extends ArquivoC{
	
	ArrayList< ArquivoC> lista = new ArrayList<ArquivoC>();
	
	private String nome;
	
	private String tamanhoKB;
	
	public void nome() {
			
		System.out.println(nome + "Documento");
		
		}
	
	public void tamanhoKB() {
		System.out.println(tamanhoKB + "90KB");
		
		}
	
	// Construtor

	public Arquivo(ArrayList<ArquivoC> lista, String nome, String tamanhoKB) {
		super();
		this.lista = lista;
		this.nome = nome;
		this.tamanhoKB = tamanhoKB;
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

	public String getTamanhoKB() {
		return tamanhoKB;
	}

	public void setTamanhoKB(String tamanhoKB) {
		this.tamanhoKB = tamanhoKB;
	}
	
}