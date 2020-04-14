package model;

public class Room {
	
	private String Area;
	private int totalPorta;
	private int totalParede;
	private int totalQuarto;
	private String encantado;
	
	public Room(String area, int totalPorta, int totalParede, int totalQuarto, String encantado) {
		super();
		Area = area;
		this.totalPorta = totalPorta;
		this.totalParede = totalParede;
		this.totalQuarto = totalQuarto;
		this.encantado = encantado;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
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

	public String getEncantado() {
		return encantado;
	}

	public void setEncantado(String encantado) {
		this.encantado = encantado;
	}
	
	
	
	

}
