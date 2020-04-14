package model;

import Abstract.AbstractMazeFactory;

public class MazeFactory extends AbstractMazeFactory {
	
	public MazeFactory(){};
	
	public String makeMaze() {
		return "Labirinto de Construção";
	}

	
	public String makeWall() {
		return "Parede de construção";
	}

	
	public String makeRoom() {
		return "Quarto de Construção";
	}

	
	public String makeDoor() {
		return "Porta do Edifício";
	}

}
