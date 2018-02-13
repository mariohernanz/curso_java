/* Programa Cine
 * Pelicula interesante, dinero, horario, lugar, compañia. 
 */
import java.util.Scanner;

public class ProgramaCineV3 {
	public static void main(String[]args){
		
		boolean siIrAlCine = true; 
		int horaCine_1 = 21;
		int horaCine_2 = 23;
		double precioEntrada = 7.50;
		int numeroCompadres = 0;
		
		System.out.println("Introduzca su nombre");
		Scanner escaner = new Scanner(System.in);
		String nombre  = escaner .nextLine();
		System.out.println("El nombre es " + nombre + ". Introduzca capital");
		double capital = escaner.nextDouble();
		System.out.println("El nombre es " + nombre + ", el capital es " + capital + ". Introduce la hora a la que puedes ir");
		double horaCine = escaner.nextDouble();
		System.out.println("El nombre es " + nombre + ", el capital es " + capital + ". La hora a la que pouedes ir es " + horaCine + ". Introduce numero de compadres" );
		numeroCompadres = escaner.nextInt();
		/*
		if (numeroCompadres >=3)
			System.out.println("Si podemos ir al cine");
		else
			System.out.println("No podemos ir al cine");
		
		if (horaCine == horaCine_1 || horaCine == horaCine_2 )
			System.out.println("Si podemos ir al cine");
		else
			System.out.println("No podemos ir al cine");
		
		siIrAlCine = siTenemosCapital(precioEntrada, capital);
		
		if (siIrAlCine)
			System.out.println("Si podemos ir al cine");
		else
			System.out.println("No podemos ir al cine");
		*/
		escaner.close();
		
		if ((numeroCompadres >=3) && (horaCine == horaCine_1 || horaCine == horaCine_2) && (siIrAlCine) && (siIrAlCine) && (capital > precioEntrada))
			{System.out.println("Si podemos ir al cine");}
		else
			{System.out.println("No podemos ir al cine");}
			
		
		
	}
	static boolean  siTenemosCapital(double precioEntrada, double capital)
	{
		if (capital < precioEntrada) {
			return false;
		} else {
			return true;
		}
		}
	}
