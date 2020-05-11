package main;

import visao.Publicacao;
import visao.Livro;
import visao.PublicacaoImplement;
import visao.Revista;
import visao.ResultImplent;
import modelo.LivroImplXML;
import modelo.LivroImplBD;
import modelo.RevistaImplXML;
import modelo.RevistaImplBD;

public abstract class Main {
	
	public static void main(String[] args) {
		
		Publicacao publicacao = new Livro(new ResultImplent());
		
		publicacao.resultado();
		
		LivroImplXML livroImplXML = new LivroImplXML(null, "", null, null);
		
		LivroImplBD livroImplBD = new LivroImplBD(null, "", null, null);
		
		RevistaImplXML revistaImplXML = new RevistaImplXML(null, "", null, null);
		
		RevistaImplBD revistaImplBD = new RevistaImplBD(null, "", null, null);

		
		
		System.out.println(publicacao);
		
		System.out.println(livroImplXML);
		
		System.out.println(livroImplBD);
		
		System.out.println(revistaImplXML);
		
		System.out.println(revistaImplBD);
		
		
		
		
		
	}

}
