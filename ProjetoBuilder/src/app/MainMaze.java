package app;


import model.EnchantedMazeFactory;
import model.EnchantedRoom;
import model.MazeFactory;
import model.MazeGame;
import model.NormalRoom;
import model.Room;

public class MainMaze {
	
	
	public static void main(String[] args) {
			
			MazeGame mazeg = new MazeGame ("Encantado", "Parede de Encantada", "Quarto da Luz", "Porta Fechada");
			
			
			System.out.println(mazeg);


	}
}
