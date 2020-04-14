package model;

public class Room {
	
	private String Labirinto;
	private String Parede;
	private String Quarto;
	private String Porta;
	
	public MazeGame(){};

	public MazeGame(String labirinto, String parede, String quarto, String porta) {
		super();
		Labirinto = labirinto;
		Parede = parede;
		Quarto = quarto;
		Porta = porta;
	}

	public MazeGame(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
	}

	public String getLabirinto() {
		return Labirinto;
	}

	public void setLabirinto(String labirinto) {
		Labirinto = labirinto;
	}

	public String getParede() {
		return Parede;
	}

	public void setParede(String parede) {
		Parede = parede;
	}

	public String getQuarto() {
		return Quarto;
	}

	public void setQuarto(String quarto) {
		Quarto = quarto;
	}

	public String getPorta() {
		return Porta;
	}

	public void setPorta(String porta) {
		Porta = porta;
	}

	@Override
	public String toString() {
		return "MazeGame [Labirinto=" + Labirinto + ", Parede=" + Parede + ", Quarto=" + Quarto + ", Porta=" + Porta
				+ "]";
	}
	
	

}
