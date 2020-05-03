package modelo;

import abstracts.EscritorioAbstracts;

public class Email extends EscritorioAbstracts {
	
	protected String SeuEmail;
	protected String Assunto;
	protected String Destinatario;
	
	//Construtor
	
	public Email(String seuEmail, String assunto, String destinatario) {
		super();
		SeuEmail = seuEmail;
		Assunto = assunto;
		Destinatario = destinatario;
		
	}

	//Get e Set
	
	public String getSeuEmail() {
		return SeuEmail;
	}

	public void setSeuEmail(String seuEmail) {
		SeuEmail = seuEmail;
	}

	public String getAssunto() {
		return Assunto;
	}

	public void setAssunto(String assunto) {
		Assunto = assunto;
	}

	public String getDestinatario() {
		return Destinatario;
	}

	public void setDestinatario(String destinatario) {
		Destinatario = destinatario;
	}

	public Email(String string) {};
	
	
	
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
		return "Projeto";
	}
}
