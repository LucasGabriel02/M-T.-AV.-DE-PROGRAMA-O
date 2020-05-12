package visao;

public class Cpu {
	
	private String cpu;
	private String start;
	private String execute;
	private String load;
	private String free;
	
	
	//Construtor
	
	public Cpu(String cpu, String start, String execute, String load, String free) {
		super();
		this.cpu = cpu;
		this.start = start;
		this.execute = execute;
		this.load = load;
		this.free = free;
	}

	
	
	public String start() {
		
		return "PC está ligando";
		
	}
	

	public String execute() {
		
		return "PC executou com sucesso";
	}
	
	public String load() {
		
		return "PC está em load ";
	}
	
	public String free() {
		
		return "PC está em free";
	}

}
