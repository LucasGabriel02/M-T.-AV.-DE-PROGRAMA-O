package model;

import java.util.ArrayList;

public class Individuo extends Congresso {
	
	ArrayList< Congresso> lista = new ArrayList<Congresso>();
	
	private int assento;
	
	private Congresso totalParticipantes;
	
	
	
	public void assento() {
			
			System.out.println(assento + 100);
		}
		
		
	public void totalParticipantes() {
				
			System.out.println(totalParticipantes + "60");
			
		}


	//Contrutor
	
	public Individuo() {
		super();
		this.lista = lista;
		this.assento = assento;
		this.totalParticipantes = totalParticipantes;
	}

	
	//Get e Set

	public ArrayList<Congresso> getLista() {
		return lista;
	}


	public void setLista(ArrayList<Congresso> lista) {
		this.lista = lista;
	}


	public int getAssento() {
		return assento;
	}


	public void setAssento(int assento) {
		this.assento = assento;
	}


	public Congresso getTotalParticipantes() {
		return totalParticipantes;
	}


	public void setTotalParticipantes(Congresso totalParticipantes) {
		this.totalParticipantes = totalParticipantes;
	}
		
		
		
		
	

}
