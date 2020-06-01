package model;

public class Gole extends Lanchee{
	
	public Gole(LancheImplementada g) {
		super(g);
		
	}
	
	public void resultado() {
		System.out.println(valorQuantidade("Quantidade: "));
	}

}
