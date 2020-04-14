package model;

import abstracts.AbstractMazeFactory;

public class MazeFactory extends AbstractMazeFactory {

	@Override
	public String makeMaze() {
		return makeMaze();
	}

	@Override
	public String makeWall() {
		return makeWall();
	}

	@Override
	public String makeRoom() {
		return makeRoom();
	}

	@Override
	public String makeDoor() {
		return makeRoom();
	}
	

}
