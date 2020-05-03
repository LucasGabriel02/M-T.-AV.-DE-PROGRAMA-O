package modelo;

import abstracts.EscritorioAbstracts;

public class EditorTexto extends EscritorioAbstracts {
	
	protected String Nome;
	protected String DestinoParaSalvae;
	protected String Modelo;
	
	//Construtor
	
	public EditorTexto(String nome, String destinoParaSalvae, String modelo) {
		super();
		Nome = nome;
		DestinoParaSalvae = destinoParaSalvae;
		Modelo = modelo;
		
	}


	//Get e Set
	
	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getDestinoParaSalvae() {
		return DestinoParaSalvae;
	}


	public void setDestinoParaSalvae(String destinoParaSalvae) {
		DestinoParaSalvae = destinoParaSalvae;
	}


	public String getModelo() {
		return Modelo;
	}


	public void setModelo(String modelo) {
		Modelo = modelo;
	}


	public EditorTexto(String string) {};
	
	

	@Override
	public String editorTextoWord() {
		return "Redação";
	}

	@Override
	public String editorApresentPowerPoint() {
		return "Slide Explicativo";
	}

	@Override
	public String editorPlanilhaExcel() {
		return "Planilha de Calculo";
	}

	@Override
	public String gerenciadorDeEmail() {
		return "Envio de Email";
	}
	
	
	public String exibirInfo() {
		return "Builder";
	}


	
}
