package model;


public abstract class EscritorioP extends Usuario {
	
	protected String editorTextoWord;
	protected String editorApresentPowerPoint;
	protected String editorPlanilhaExcel;
	protected String gerenciadorDeEmail;
	

	
	
	public EscritorioP(String nomeArquivo, String data, String hora, String proprietario, String email,
			String autorizacaoDeImpressao, String autorizacaoDeCopia, String editorTextoWord,
			String editorApresentPowerPoint, String editorPlanilhaExcel, String gerenciadorDeEmail) {
		super(nomeArquivo, data, hora, proprietario, email, autorizacaoDeImpressao, autorizacaoDeCopia);
		
		this.editorTextoWord = editorTextoWord;
		this.editorApresentPowerPoint = editorApresentPowerPoint;
		this.editorPlanilhaExcel = editorPlanilhaExcel;
		this.gerenciadorDeEmail = gerenciadorDeEmail;
	}
	
	
	

	//Get e Set


	public String getEditorTextoWord() {
		return editorTextoWord;
	}

	public void setEditorTextoWord(String editorTextoWord) {
		this.editorTextoWord = editorTextoWord;
	}

	public String getEditorApresentPowerPoint() {
		return editorApresentPowerPoint;
	}

	public void setEditorApresentPowerPoint(String editorApresentPowerPoint) {
		this.editorApresentPowerPoint = editorApresentPowerPoint;
	}

	public String getEditorPlanilhaExcel() {
		return editorPlanilhaExcel;
	}

	public void setEditorPlanilhaExcel(String editorPlanilhaExcel) {
		this.editorPlanilhaExcel = editorPlanilhaExcel;
	}

	public String getGerenciadorDeEmail() {
		return gerenciadorDeEmail;
	}

	public void setGerenciadorDeEmail(String gerenciadorDeEmail) {
		this.gerenciadorDeEmail = gerenciadorDeEmail;
	}
	
	


}
