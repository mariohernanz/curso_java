package com.incyde;

public class ClaseProgramaPrincipal {
	
	public static void main(String[] args) {
		Cuadrado miCuadrado = new Cuadrado();
		// miCuadrado.longitudesCuadrado = 5;
		System.out.println("Area " + miCuadrado.area());
		System.out.println("El color del cuadrado es " + miCuadrado.color);
		
		Triangulo miTrinagulo = new Triangulo("rojo", 4, 6);
		System.out.println("El color del triangulo es " + miTrinagulo.color);
		System.out.println("El area del triangulo es " + miTrinagulo.area());
		
	}
public static void mainArray() {
	Triangulo[] triangulos;
		triangulos = new Triangulo[3];
		triangulos[0] = new Triangulo();
		triangulos[1] = new Triangulo();
		triangulos[2] = new Triangulo();
		triangulos[2].base = 5;
		
		triangulos[0].color = "Blanco";
		triangulos[1].color = "Rojo";
		triangulos[2].color = "Amarillo";
		
		triangulos[0].dibujar();
		triangulos[1].dibujar();
		triangulos[2].dibujar();
}
	public static void mainBascio() {
		Triangulo trianguloAngela = new Triangulo();
		float[] tempLongitudes = {2, 3, 5};
		trianguloAngela.longitudes = tempLongitudes;
		System.out.println("El perimetro del triangulo de Angela es " + trianguloAngela.perimetro());
		trianguloAngela.base = 5f;
		trianguloAngela.altura = 8f;
		trianguloAngela.color = "Rojo";
		System.out.println(trianguloAngela.toString());
		trianguloAngela.dibujar();
		System.out.println("El area del triangulo de Angela es " + trianguloAngela.area());
		
		
		Triangulo trianguloMario = new Triangulo();
		float[] tempLongitudesMario = {3, 5, 7};
		trianguloMario.longitudes = tempLongitudesMario;
		trianguloMario.base = 5f;
		trianguloMario.altura = 10f;
		trianguloMario.color = "Azul";
		System.out.println("El perimetro del triangulo de Mario es " + trianguloMario.perimetro());
		System.out.println(trianguloMario.toString());
		trianguloMario.dibujar();
		System.out.println("El area del triangulo de Mario es " + trianguloMario.area());
		
		
		Cuadrado cuadradoMario = new Cuadrado();
		cuadradoMario.base = 4;
		cuadradoMario.altura = 4;
		cuadradoMario.color = "Verde";
		System.out.println("El perimetro del cuadrado es " + cuadradoMario.perimetro());
		System.out.println("El area del cuadrado es " + cuadradoMario.area());
		cuadradoMario.dibujar();
		
		
		Rectangulo rectanguloMario = new Rectangulo();
		rectanguloMario.altura = 2;
		rectanguloMario.base = 4;
		rectanguloMario.color = "Rojo";
		System.out.println("El perimetro del rectangulo es " + rectanguloMario.perimetro());
		System.out.println("El area del rectangulo es " + rectanguloMario.area());
		rectanguloMario.dibujar();
		
	}

}
