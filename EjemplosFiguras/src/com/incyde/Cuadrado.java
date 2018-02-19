package com.incyde;

public class Cuadrado extends Rectangulo {
	
	
	

	public Cuadrado() {
		this.altura = 4;
		this.base = 4;
		
	}
	/*
	public Cuadrado(int base) {
		this.base = base;
		this.color = "transparente";
	}
	
	public Cuadrado(String color,int altura) {
		this.color = color;
		this.altura = altura;
	}
	
	public Cuadrado(String color) {
		this.color = color;
		this.altura = 1f;
	}*/
	
	public String toString() {
	return "Cuadrado " + altura + " x " + base + " - Color: " + color ;
	}

}
