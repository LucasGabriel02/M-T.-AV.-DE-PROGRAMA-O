package model;

import model.Shape;

public class Rectange extends Shape{
	
	
	protected Rectange(Rectange Rectange) {
		
		this.tipo = Rectange.gettipo();
	}
	
	public Rectange(String string) {
		// TODO Auto-generated constructor stub
	}

	public void Rectange() {
		
		tipo = "Retangulo";
		
	}



@Override
public Shape clonar() {
	return null;
}

}
