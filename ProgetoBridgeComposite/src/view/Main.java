package view;

import model.Beber;
import model.LancheImplementada;
import model.Lanchee;
import model.ResultadoImplent;
import model.Tamanho;
import model.Gole;
import app.ArquivoC;
import app.Arquivo;
import app.Pasta;

public abstract class Main {
	
	public static void main(String[] args) {
		
		
		// Bridge
		
		Lanchee lanche = new Beber(new ResultadoImplent());
		
		lanche.resultado();
		
		Lanchee taman = new Tamanho(new ResultadoImplent());
		
		taman.resultado();
		
		Lanchee quant = new Gole(new ResultadoImplent());
				
		quant.resultado();
		
		//-----****-----****-----****-----****-----****-----****-----****-----****-----
		
		// Composite
		
		Pasta past = new Pasta(null, null, null);
		past.nome();
		past.subPasta();
		
		Arquivo arquiv = new Arquivo(null, null, null);
		arquiv.nome();
		arquiv.tamanhoKB();
		
		System.out.println(lanche);
		
		System.out.println(taman);
		
		System.out.println(quant);
		
		System.out.println(past);
		
		System.out.println(arquiv);
		
		System.out.println("FIM!!!");
	}

}
