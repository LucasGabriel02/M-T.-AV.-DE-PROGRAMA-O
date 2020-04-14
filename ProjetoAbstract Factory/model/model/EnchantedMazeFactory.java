package model;

import Abstract.AbstractMazeFactory;

public class EnchantedMazeFactory extends AbstractMazeFactory{
	
	public EnchantedMazeFactory(){};
	

	
	public String makeMaze() {
		return "Labirinto encantado";
	}

	
	public String makeWall() {
		return "Parede Encantado";
	}

	
	public String makeRoom() {
		return "Quarto encantado";
	}

	
	public String makeDoor() {
		return "Porta encantada";
	}
	
	

}
