package abstracts;

import model.Room;

public abstract class AbstractRoom {
	
	public AbstractRoom() {};
	
	public abstract String makeLabirinto();
	public abstract String makeParede();
	public abstract String makeQuarto();
	public abstract String makePorta();

	public abstract void buildParede();

	protected abstract Room getRoom();


}
