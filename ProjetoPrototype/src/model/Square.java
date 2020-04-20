package model;

import model.Shape;

public class Square extends Shape{
	
	protected Square(Square Square) {
		
		this.tipo = Square.gettipo();
	}
	
public Square() {
		
		tipo = "Quadrado";
		
	}

public Square(String string) {
	// TODO Auto-generated constructor stub
}

@Override
public Shape clonar() {
	return null;
}

}
