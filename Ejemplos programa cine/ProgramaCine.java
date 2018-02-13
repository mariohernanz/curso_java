/* 
	Fichero: ProgramaCine.Java
	Autor: Mario Díaz
	Descripción: Programa que nos ayuda a saber si ir al cine o no.
*/
// Inicio de la clase ProgramaCine

public class ProgramaCine
{
	// Metodo principal, que se llama al arrancar el programa
	public static void main(String[] argumetos)
	{
		// Asignamos variables
		String titulo = "Torrente 8";  // Titulo en variable de texto
		boolean varSiIrAlCine = false; // Resultado para saber si ir al cine en boolean
		//Logica del dinero
		int precioEntrada = 20;         // Precio entrada			
		int nuestroCapital= 20;        // El dinero que tenemos
		
		// Imprimimos el titulo
		System.out.println ("Titulo: " + titulo + ".");
		System.out.println ("Mi primer programa");
		System.out.println ("PROGRAMA CINE");	

		
		System.out.println ("Precio: " + precioEntrada);
		if (nuestroCapital >= precioEntrada) 
		{
			varSiIrAlCine = true; 
		}else {
			varSiIrAlCine = false;
		}
		if (varSiIrAlCine == true) {
			System.out.println ("SI PODRIAMOS IR AL CINE");
			nuestroCapital = nuestroCapital - precioEntrada;
		} else {
			System.out.println ("NO PODRIAMOS IR AL CINE");
		}
		System.out.println ("Capital Final: " + nuestroCapital);
		
		
	}   
}