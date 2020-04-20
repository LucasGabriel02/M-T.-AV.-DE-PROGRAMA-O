package model;

import model.Shape;

public class Circle extends Shape {


	protected Circle (Circle Circle) {
		
		this.tipo = Circle.gettipo();
	}
	
	public Circle() {
		
		tipo = "circulo";
		
	}

	public Circle(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Shape clonar() {
		return null;
	}
		
}
