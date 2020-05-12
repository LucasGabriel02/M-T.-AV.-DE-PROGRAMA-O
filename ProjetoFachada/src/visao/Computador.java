package visao;

public class Computador {
	
	private String CPU;
	
	private String MemoriaRam;
	
	private String HD;
	
	
	//Construtor

	public Computador(String cPU, String memoriaRam, String hD) {
		super();
		CPU = cPU;
		MemoriaRam = memoriaRam;
		HD = hD;
	}
	
	
	public String CPU() {
		
		return " Intel i9 ";
		
	}
	
	public String MemoriaRam() {
		
		return " 16GB Hyperx ddr 4 ";
		
	}
	
	public String HD() {
		
		return " 1000GB de HD ";
		
	}
	
	
	

}
