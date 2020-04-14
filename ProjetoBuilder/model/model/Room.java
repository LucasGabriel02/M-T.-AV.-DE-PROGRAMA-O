package model;

public class Room {
	
	private int totalPorta;
	private int totalParede;
	private int totalQuarto;

	
	public Room(String totalPorta, int totalParede, int totalQuarto,) {
		super();
		TotalPorta = totalPorta;
		
		this.totalPorta = totalPorta;
		this.totalParede = totalParede;
		this.totalQuarto = totalQuarto;
	
	}


	public int getTotalPorta() {
		return totalPorta;
	}

	public void setTotalPorta(int totalPorta) {
		this.totalPorta = totalPorta;
	}

	public int getTotalParede() {
		return totalParede;
	}

	public void setTotalParede(int totalParede) {
		this.totalParede = totalParede;
	}

	public int getTotalQuarto() {
		return totalQuarto;
	}

	public void setTotalQuarto(int totalQuarto) {
		this.totalQuarto = totalQuarto;
	}
	

}
