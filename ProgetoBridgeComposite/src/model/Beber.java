package model;

public class Beber extends Lanchee {
	
	public Beber(LancheImplementada g) {
		super(g);
		
	}
	
	public void resultado() {
		System.out.println(valorRefrigerante("Refrigerante: "));
	}
	

}
