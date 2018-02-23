package com.incyde;

public class JuegoAhorcado {
	 static String palabraElegida = "";
	 static String letra = "";
	 static String guiones = "";
	 static String nuevosGuiones = "";
	 static String nuevosGuionesAnterior = "";
	 static ListaFalladas listaFalladas;
	 static int LongitudPalabra;
	 static int contadorFallos = 0;
	 
	static String soloGuiones_A() {
		String guiones = "";
		for (int i = 0; i <palabraElegida.length(); i++) {
			guiones = guiones + "-";
		}
		return guiones;}	 
	public static void main(String[] args) {
		listaFalladas = new ListaFalladas();
		palabraElegida = ListaPalabras.palabraAleatoria();
		LongitudPalabra = palabraElegida.length();
		nuevosGuiones = guiones;
		//System.out.println("La plabra es " + ListaPalabras.palabraAleatoria());
		guiones = soloGuiones_A();
		nuevosGuionesAnterior = guiones;
		System.out.println("Palabra: " + guiones);
		while( ! nuevosGuiones.contains(palabraElegida)) {
			listaFalladas.MostrarLista();
			letra = VistaYTeclado.pedirletra();
			System.out.println("La letra es " + letra);
			
			//guiones = "------------".substring(0, (LongitudPalabra));
			
			if (palabraElegida.contains(letra)) {
				cuandoAciertaLetra();
			} else {
				contadorFallos = contadorFallos + 1; // contadorFallos ++
				System.out.println("Has fallado " + contadorFallos + " veces" );
				listaFalladas.AgregarLetra(letra);
				if (contadorFallos > 6)
					return;
			}		
		}
		
		System.out.println("¡¡Felicidades!! Has ganado");
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
