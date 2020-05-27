package visao;

import model.Cliente;

import model.Pizza;

import model.Portuguesa;

import model.Queijo;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente client = new Cliente(" Lucas Gabriel"," 81995142607"," lucas@gmail.com");
		
		Pizza pizz = new Pizza(" 4 Queijo"," Tamanho Familia", null, null, null);
		
		Portuguesa portgue =  new Portuguesa(" Cobertura na Borda de Chocolate"," Queijo com Calabresa", null, null, null, null, null);

		Queijo queij = new Queijo ("Sem Cobertura", "Portuguesa", null, null, null, null, null);
		
		System.out.println(client);
		
		System.out.println(pizz);
		
		System.out.println(portgue);
		
		System.out.println(queij);
		
	}

}
