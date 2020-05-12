package visao;

public class HardDrive {
	
	private String read;
	
	private String write;

	
	//Construtor
	
	public HardDrive(String read, String write) {
		super();
		this.read = read;
		this.write = write;
	}
	
	
	
	public String read() {
			
			return "O HD está fazendo a leitura do Sistemas";
			
		}
	
	public String write() {
		
		return "O write está escrevendo os dados do HD";
		
	}
	
	
	

}
