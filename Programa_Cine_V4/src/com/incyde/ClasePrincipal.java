package com.incyde;

import java.util.Scanner;

public class ClasePrincipal {
	static float capital;
	static float precio = 7.5f;
	static int horaDisponible;
	static int horaCine_1 = 22;
	static int horaCine_2 = 20;
	static int horaCine_3 = 18;
	static int horaRecomendada;
	static Scanner teclado;

	public static void main(String[] args) {
		boolean resultadoCine;
		String siContinuar;
		System.out.println("Programa Cine V4");
		do {
			pedirDatos();
			resultadoCine = comprobarSiVamosAlCine();
			mostrarResultado(resultadoCine);
			System.out.println("¿Desea continuar? (s/n)");
			teclado.nextLine();
			siContinuar = teclado.nextLine();
		} while (siContinuar.equals("s") || siContinuar.equals("S"));
		teclado.close();
		System.out.println("Fin del programa");
	}

	public static void pedirDatos() {

		System.out.println("Introduzca capital disponible:");
		teclado = new Scanner(System.in);
		capital = teclado.nextFloat();

		System.out.println("Introduzca hora disponible para ir al cine:");
		horaDisponible = teclado.nextInt();

	}

	public static boolean comprobarSiVamosAlCine() {
		/*
		 * if ((capital >= precio) && (horaDisponible >= horaCine_1 - 1 &&
		 * horaDisponible <= horaCine_1 || horaDisponible >= horaCine_2 -1 &&
		 * horaDisponible <= horaCine_2)) return true; else return false;
		 */

		if (capital >= precio) {
			if (horaDisponible >= horaCine_1 - 1 && horaDisponible <= horaCine_1) {
				horaRecomendada = horaCine_1;
				return true;
			} else if (horaDisponible >= horaCine_2 - 1 && horaDisponible <= horaCine_2) {
				horaRecomendada = horaCine_2;
				return true;
			} else if (horaDisponible >= horaCine_3 - 1 && horaDisponible <= horaCine_3) {
					horaRecomendada = horaCine_3;
					return true;
			}
		} 
		return false;
	}

	public static void mostrarResultado(boolean resultado) {
		if (resultado == true) {
			System.out.println("La hora recomendada es " + horaRecomendada);
			System.out.println("Sí podemos ir al cine ");
		} else {
			if (capital < precio) {
				System.out.println("No podemos ir al cine porque la entrada vale mas que el dinero disponible");
			} else {
				System.out.println("No podemos ir al cine");
			}
		}

	}

}
