package com.incyde;

public class JuegoAhorcado {
	 static String palabraElegida;
	 static String letra;
	 static String guiones;
	 static String nuevosGuiones;
	 static String nuevosGuionesAnterior;
	 static int LongitudPalabra;
	 
	static String soloGuiones_A() {
		String guiones = "";
		for (int i = 0; i <palabraElegida.length(); i++) {
			guiones = guiones + "-";
		}
		return guiones;}
	//static String soloGuiones_B() {
		//guiones = "----------".substring(0, (LongitudPalabra));
				//return guiones;
	//}
	 
	public static void main(String[] args) {
		palabraElegida = ListaPalabras.palabraAleatoria();
		LongitudPalabra = palabraElegida.length();
		nuevosGuiones = guiones;
		//System.out.println("La plabra es " + ListaPalabras.palabraAleatoria());
		guiones = soloGuiones_A();
	
		while(true) {
			letra = VistaYTeclado.pedirletra();
			System.out.println("La letra es " + letra);
			
			//guiones = "------------".substring(0, (LongitudPalabra));
			
			if (palabraElegida.contains(letra)) {
				cuandoAciertaLetra();
			} else {
				System.out.println("No contiene");
			}		
		}
	}
	
	
	static void cuandoAciertaLetra() {
		int posicion;
				 String letraPos;
				 nuevosGuiones = "";
				for (posicion = 0; posicion < LongitudPalabra; posicion++) {
					letraPos = String.valueOf(palabraElegida.charAt(posicion));
					if (letra.equals(letraPos)) {
						//System.out.println("pos: " + posicion + ", let " +letraPos);
						nuevosGuiones = nuevosGuiones + letraPos;
				} else {
					nuevosGuiones = nuevosGuiones + nuevosGuionesAnterior.charAt(posicion);
					
				}				
			}
			nuevosGuionesAnterior = nuevosGuiones;
			System.out.println(nuevosGuiones);
	}
	void pruebasString() {
	/*
			System.out.println("Si que contiene");
			int posicionLetra = palabraElegida.indexOf(letra);
			System.out.println("Posicion " + posicionLetra);
			System.out.println(palabraElegida.charAt(posicionLetra));
	 * 
		
		System.out.println("Indice: " + palabraElegida.indexOf(letra));
	 */
	}
}
