package visao;

import model.Congresso;
import model.Individuo;
import model.Instituicao;

public class Main {
	
	public static void main(String[] args) {
		
		Individuo indiv = new Individuo();
		indiv.assento();
		
		
		Instituicao inst = new Instituicao();
		inst.membros();
		
		Instituicao insti = new Instituicao();
		insti.instituicaoPessoa();
	
		
	
	System.out.println("Quantidade de Assento:"+indiv);
	
	
	System.out.println("Quantidade de Pessoa:"+inst);
	
	System.out.println("Instituição:"+insti);
}
}

