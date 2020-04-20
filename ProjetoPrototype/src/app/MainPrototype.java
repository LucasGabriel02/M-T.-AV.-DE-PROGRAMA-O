package app;

import model.Circle;
import model.Shape;
import model.Rectange;
import model.Square;

public class MainPrototype {
	
	public static void main(String[] args) {
		
		Circle circulo = new Circle("Circulo");
		
		Rectange retangulo = new Rectange("Retangulo");
		
		Square quadrado = new Square("Quadrado");
		
		
		
		System.out.println(circulo);
		System.out.println(retangulo);
		System.out.println(quadrado);
	}

}
