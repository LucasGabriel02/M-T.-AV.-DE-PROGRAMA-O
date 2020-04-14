package model;

import abstracts.AbstractRoom;


public class MazeGame {
	
	protected AbstractRoom room;
	
	public MazeGame() {};
	
	public MazeGame(AbstractRoom room) {
		this.room = room;
		
	}
	
	public MazeGame(NormalRoom room2) {
		// TODO Auto-generated constructor stub
	}

	public model.Room Room() {
		room.makeLabirinto();
		room.makeParede();
		room.makeQuarto();
		room.makePorta();
		return null;
		
	}



	public void makeMaze() {
		// TODO Auto-generated method stub
		
	}


	


}
