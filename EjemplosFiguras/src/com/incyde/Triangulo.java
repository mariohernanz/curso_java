package com.incyde;

public class Triangulo extends Figura {
	public float[] longitudes;
	public float base;
	public float altura;
		
	public Triangulo(int base,int altura) {
		super("transparente");
		this.base = base;
		this.altura = altura;	
	}
	public Triangulo(int base,int altura,String color) {
		super(color);
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
