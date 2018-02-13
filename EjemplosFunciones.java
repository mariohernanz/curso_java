package com.mipaquete;

public class EjemplosFunciones {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("V3 - Programa Cine");
			// Empezando
			int x = 15;
			int y = 5;
			int resultadoSum = sumarNumeros(x,y);
			int resultadoResta = restaNumeros(x,y);
			int resultadoCuadrado = cuadradoNumeros(20);
			int resultadoMultiplicacion = multiplicacionNumeros(x,y);
			double resultadoCubo = Math.pow(7, 3);
			System.out.println("Resultado =" + resultadoSum);
			System.out.println("Resultado =" + resultadoResta);
			System.out.println("Resultado =" + resultadoCuadrado);
			System.out.println("Resultado =" + resultadoMultiplicacion);
			System.out.println("Resultado =" + resultadoCubo);
		}
		public static int sumarNumeros(int valor_1, int valor_2) {
			return valor_1 + valor_2;
			}
		public static int restaNumeros(int valor_1, int valor_2) {
			return valor_1 - valor_2;
			}
		public static int cuadradoNumeros(int v) {
			return v*v;
			}
		public static int multiplicacionNumeros(int valor_1, int valor_2) {
			return valor_1*valor_2;
			}
		public static double elevadocuboNumeros(int parametro) {
			return Math.pow(parametro, 3);
			}
		
	}


