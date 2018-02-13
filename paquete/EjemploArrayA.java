package com.un.paquete;

public class EjemploArrayA {

	public static void main(String[] args) {
		
		int[] arrayEnteros = new int[100];
		
		// Bucle for ( inicialización; condición; iteración)
		for (int i = 0; i < arrayEnteros.length; i = i + 1) { // i++ 
			arrayEnteros[i] = i * i;
			System.out.println("array(" +i+") = " + arrayEnteros[i]);
		}
		float[] decimales = new float[10];
		for (int j=0; j < decimales.length; j++) {
			decimales[j] = j / 3f;
			System.out.println("El tercio de " + j + " es " + decimales[j]);
		}
		int otroArray[] = { 5, 10, 15, 20, 25};
		for (int elemento : otroArray) {
			System.out.println("Elemento = " + elemento);	
		}
		String diaArray[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		for (String dia : diaArray) {
			System.out.println(dia);
		}
		int numDia = 0;
		while (numDia < diaArray.length) {
			System.out.println( diaArray [ numDia ] );
			numDia ++;
		}
		
		
	}
}
