package com.incyde;

import java.util.*;

public class ListaPalabras {
	
	static String[] palabras = {"aguila", "pilum", "gladius", "vaso", "luz", "pan", "ordenador"};
	
	public static String palabraAleatoria() {
		// Buscamos un numero aleatorio y devolvemos la palbra en esa posicion
		Random objRandom = new Random();
		int indiceAleatorio = objRandom.nextInt(palabras.length);
		return palabras[indiceAleatorio];
	}
}
