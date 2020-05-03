package app;

import model.EscritorioP;
import model.PathP;
import model.Usuario;
import modelo.EditorApresentacao;
import modelo.EditorPlanilha;
import modelo.EditorTexto;
import modelo.Email;
import abstracts.EscritorioAbstracts;



public class Main {
	
	public static void main(String[] args) {
		
		
		//--------------------------------------------------------------------------
		
		//PROTOTYPE
		
		
		EscritorioP escritorioPrototype = new EscritorioP(EscritorioP);
		
		escritorioPrototype.setEditorTextoWord("Projeto Padroes Texto");
		escritorioPrototype.setEditorApresentPowerPoint("Projeto Padroes Slide");
		escritorioPrototype.setEditorPlanilhaExcel("Calculos para Planilha");
		escritorioPrototype.setGerenciadorDeEmail("lucas@gamil.com");
		
		//--------------------------------------------------------------------------
		
		Usuario UsuarioPrototype = new Usuario(Usuario);
		
		UsuarioPrototype.setNomeArquivo("Projeto Padroes");
		UsuarioPrototype.setData("02-04-2020");
		UsuarioPrototype.setHora("05:00");
		UsuarioPrototype.setProprietario("Lucas");
		UsuarioPrototype.setEmail("lucas@gmail.com");
		UsuarioPrototype.setAutorizacaoDeImpressao("sim");
		UsuarioPrototype.setAutorizacaoDeCopia("sim");
		
		//--------------------------------------------------------------------------
		
		
		//BUILDER
		

		EditorTexto texto = new EditorTexto("Redação");
		
		EditorApresentacao slide = new EditorApresentacao("Slide Explicativo");
		
		EditorPlanilha planilha = new EditorPlanilha("Planilha de Calculo");
		
		Email gmail = new Email("Envio de Email");
		
		
		
		
		
		EditorTexto editorWord = new EditorTexto(EscritorioP());
		editorWord.setNome("Arquivo Word");
		editorWord.setDestinoParaSalvae("Area de Trabalho");
		editorWord.setModelo("Artigo");
		
		//-----------------
		
		EditorApresentacao editorPowerPoint = new EditorApresentacao(new EscritorioP()); 

		editorPowerPoint.setNome("Slide");
		editorPowerPoint.setDestinoParaSalvae("Area de Trabalho");
		editorPowerPoint.setModelo("Slide de Apresentação");
		
		//-----------------
		
		EditorPlanilha editorExcel  = new EditorPlanilha(new EscritorioP());
		editorExcel.setNome("Planilha de Calculo");
		editorExcel.setDestinoParaSalvae("Area de Trabalho");
		editorExcel.setModelo("Planilha de Organização Escolar");
		
		//-----------------
		
		Email emailGmail = new Email(new EscritorioP());
		emailGmail.setSeuEmail("lucas@gmail.com");
		emailGmail.setAssunto("Boleto");
		emailGmail.setDestinatario("gabriel@hotmail.com");
		
		
		
		//---------------------------------------------------------
		
		System.out.println(escritorioPrototype);
		System.out.println(UsuarioPrototype);
		System.out.println(editorWord);
		System.out.println(editorPowerPoint);
		System.out.println(editorExcel);
		System.out.println(emailGmail);
		System.out.println(texto);
		System.out.println(slide);
		System.out.println(planilha);
		System.out.println(gmail);
		System.out.println("FIM!!!");
			
	}

}
