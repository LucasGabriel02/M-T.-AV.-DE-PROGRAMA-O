package model;

public class Usuario {
	
	protected String nomeArquivo;
	protected String data;
	protected String hora;
	protected String proprietario;
	protected String email;
	protected String autorizacaoDeImpressao;
	protected String autorizacaoDeCopia;
	
	
	//Construtor
	
	public Usuario(String nomeArquivo, String data, String hora, String proprietario, String email,
			String autorizacaoDeImpressao, String autorizacaoDeCopia) {
		super();
		this.nomeArquivo = nomeArquivo;
		this.data = data;
		this.hora = hora;
		this.proprietario = proprietario;
		this.email = email;
		this.autorizacaoDeImpressao = autorizacaoDeImpressao;
		this.autorizacaoDeCopia = autorizacaoDeCopia;
	}

	
	//Get e Set

	public String getNomeArquivo() {
		return nomeArquivo;
	}


	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public String getProprietario() {
		return proprietario;
	}


	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAutorizacaoDeImpressao() {
		return autorizacaoDeImpressao;
	}


	public void setAutorizacaoDeImpressao(String autorizacaoDeImpressao) {
		this.autorizacaoDeImpressao = autorizacaoDeImpressao;
	}


	public String getAutorizacaoDeCopia() {
		return autorizacaoDeCopia;
	}


	public void setAutorizacaoDeCopia(String autorizacaoDeCopia) {
		this.autorizacaoDeCopia = autorizacaoDeCopia;
	}


	public String exibirInfo() {
		return "Projeto Padroes";
	}


	public EscritorioP clonar() {
		return null;
	}
	

}
