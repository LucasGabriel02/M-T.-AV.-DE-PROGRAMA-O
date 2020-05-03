package model;

public class PathP extends EscritorioP {
	
	protected String nomeArquivo;
	protected String salvar;
	protected String escrever;
	protected String ler;
	protected String autorizacaoDeCopia;
	
	
	
	protected PathP(PathP PathP) {
		this.editorTextoWord = PathP.geteditorTextoWord();
		
		this.editorTextoWord = PathP.getEditorApresentPowerPoint();
		
		this.editorTextoWord = PathP.getEditorPlanilhaExcel();
		
		this.editorTextoWord = PathP.getGerenciadorDeEmail();
					
	}
	
	//----------------------------------------------------------------------------------
	
	//Nome do Arquivo, como ta escrito no progrma abaixo do progrma Word
	
	public String getEditorApresentPowerPoint() {
		return "Projeto Padroes Texto";
	}
	
	
	public String geteditorTextoWord() {
		return "Projeto Padroes Slide";
	}
	
	
	public String getEditorPlanilhaExcel() {
		return "Calculos para Planilha";
	}
	
	public String getGerenciadorDeEmail() {
		return "Pagina do Gmail";
	}
	
	
	//-----------------------------------------------------------------------------------
	
	
	
	//Opcao se voce quer salvar SIM ou NAO
	
	
	public String getsalvar() {
		return "Sim";		
	}
	

	public String getescrever() {
		return "Sim, Slide de Apresenração, Texto para Artigo, Planilha de Calculo e Acessar Gmail";		
	}
	
	
	public String getler() {
		return "Sim";		
	}
	
	
	public String getautorizacaoDeCopia() {
		return "Sim";		
	}
	
	//----------------------------------------------------------------------------------------------------------

	//Construtor
	
	public PathP(String nomeArquivo, String salvar, String escrever, String ler, String autorizacaoDeCopia) {
		super();
		this.nomeArquivo = nomeArquivo;
		this.salvar = salvar;
		this.escrever = escrever;
		this.ler = ler;
		this.autorizacaoDeCopia = autorizacaoDeCopia;
	}
	

	public String exibirInfo() {
		return "Escritorio";
	}

	public EscritorioP clonar() {
		
		return new PathP(this);
	}
	
	public PathP() {
		
	}
	

}
