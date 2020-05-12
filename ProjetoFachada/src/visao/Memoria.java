package visao;

public class Memoria {
	
	private String memoriaRam;
	private String load;
	private String free;
	
	
	//Construtor
	
	public Memoria(String memoriaRam,String load, String free) {
		super();
		this.memoriaRam = memoriaRam;
		this.load = load;
		this.free = free;
	}
	
	
	public String memoriaRam() {
		
		return "A memoria está sendo usada";
		
	}
	
	public String load() {
			
			return "PC está load";
		}
		
		public String free() {
			
			return "PC está em free";
		}
	
	
	

}
