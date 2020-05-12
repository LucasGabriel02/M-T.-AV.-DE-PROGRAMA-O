package facade;

import visao.Computador;
import visao.Cpu;
import visao.HardDrive;
import visao.Memoria;

public class Main {
	
	public static void main(String[] args) {
		
		Cpu cPc = new Cpu("Intel i9", null, null, null, null);
		
		Memoria memoriaRam = new Memoria("16GB Hyperx ddr 4 ", null, null);
		
		HardDrive HD = new HardDrive("1000GB de HD", null);
		
		
		System.out.println(cPc);
		System.out.println(memoriaRam);
		System.out.println(HD);
		
	}

}
