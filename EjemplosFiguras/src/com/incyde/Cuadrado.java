package com.incyde;

public class Cuadrado extends Rectangulo {
	
	
	public Cuadrado(int lado) {
		super(lado, lado);
	}
	public Cuadrado(int lado, String color) {
		super(lado, lado, color);
	}
	public String toString() {
		return "Cuadrado " + altura + " x " + base + " - Color: " + color ;
	}

}
