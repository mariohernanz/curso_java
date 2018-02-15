package com.incyde;

public class Cuadrado {
	
	public float longitudesCuadrado;
	public String color;
	
	public float perimetro() {
		return longitudesCuadrado * 4;
	}
	public float area() {
		return longitudesCuadrado * longitudesCuadrado / 2;
	}
	public void dibujar( ) {
		System.out.println("Dibujando " + toString());
	}
	public String toString() {
	return "Cuadrado " + longitudesCuadrado + " x " + longitudesCuadrado + " - Color: " + color ;
	}

}
