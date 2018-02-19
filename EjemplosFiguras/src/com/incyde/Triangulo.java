package com.incyde;

public class Triangulo extends Figura {
	public float[] longitudes;
	public float base;
	public float altura;
	public String color;
	
	public Triangulo(String color) {
		this.color = color;
	}
	
	public Triangulo(String color,int base,int altura) {
		this.color = color;
		this.base = base;
		this.altura = altura;
		
	}
	public float perimetro() {
	
		return longitudes[0] + longitudes[1] + longitudes[2];
	}
	
	public float area() {
		return (this.base * this.altura)/2;
	}
	
	public String toString() {
		return "Triangulo " + this.base + " x " + this.altura + " - Color: " + this.color ;
	}
}
