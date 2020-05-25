package model;
import java.util.ArrayList;

public class Instituicao extends Congresso {
	
	ArrayList< Congresso> lista = new ArrayList<Congresso>();
	
	private String membros;
	
	private String instituicaoPessoa;
	
	
	public void membros() {
		
		System.out.println(membros + 20);
	}
	
	
	public void instituicaoPessoa() {
			
			System.out.println(instituicaoPessoa + "UNIESP");
		}

	
	//Contrutor
	
	public Instituicao() {
		super();
		this.lista = lista;
		this.membros = membros;
		this.instituicaoPessoa = instituicaoPessoa;
	}
	

	//Get e Set

	public ArrayList<Congresso> getLista() {
		return lista;
	}


	public void setLista(ArrayList<Congresso> lista) {
		this.lista = lista;
	}


	public String getMembros() {
		return membros;
	}


	public void setMembros(String membros) {
		this.membros = membros;
	}


	public String getInstituicaoPessoa() {
		return instituicaoPessoa;
	}


	
}
