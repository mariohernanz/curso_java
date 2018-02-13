package com.mipaquete;

public class EjemplosBooleanos {

	public static void funcionprincipal() {
		System.out.println("Ejemplos booleanos");
		
		int a = 7;
		int b = 7;
		operadoresComparacion(a, b);
		
	}
	public static void operadoresComparacion(int a, int b) {
		if (a == b)
			System.out.println(a + " Son iguales " + b);
		if (a > b)
			System.out.println(a + " mayor que " + b);
		if (a <= b)
			System.out.println(b + " menor o igual que " +a);
		if (a != b)
			System.out.println(a + " es distinto de " + b);
	}

}
