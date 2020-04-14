package app;


import model.EnchantedMazeFactory;
import model.EnchantedRoom;
import model.MazeFactory;
import model.MazeGame;
import model.NormalRoom;
import model.Room;

public class MainMaze {
	
	
	public static void main(String args[]){
		MazeGame mazeg = new MazeGame ("2", "22", "6", "6", "33");
		mazeg.makeMaze();
		
		Room room = mazeg.Room();
		
		
		
		
		
		System.out.println("		room.makeLabirinto();\r\n" + "room.makeParede();\r\n" + "room.makeQuarto();\r\n" + "room.makePorta();");
		
		System.out.println("room.makeMaze();\r\n" + "room.makeWall();\r\n" + "room.makeRoom();\r\n" + "room.makeDoor();\r\n" + "");

	}


	
}
