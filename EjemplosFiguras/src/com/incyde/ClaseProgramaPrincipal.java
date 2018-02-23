package com.incyde;

public class ClaseProgramaPrincipal {
	
	public static void main(String[] args) {
		Cuadrado miCuadrado_A = new Cuadrado(10);
		miCuadrado_A.altura = 3;
		Cuadrado miCuadrado_B = new Cuadrado(5);
		miCuadrado_B.color = "Rojo";
		
		System.out.println("El area del cuadrado A es: " + miCuadrado_A.area());
		System.out.println("El color del cuadrado es: " + miCuadrado_A.color);
		
		Triangulo miTrinagulo = new Triangulo( 4, 6);
		System.out.println("El color del triangulo es: " + miTrinagulo.color);
		System.out.println("El area del triangulo es: " + miTrinagulo.area());
		
		Rectangulo miRectangulo = new Rectangulo( 8 , 4);
		System.out.println("El area del rectangulo es: " + miRectangulo.area());
		Rectangulo otroRec = miRectangulo;
		miRectangulo.color = "TIRQUESA";
		otroRec.color = "GRIS";
		miRectangulo.dibujar();
		otroRec.dibujar();
		
		miCuadrado_A.dibujar("DIBUJANDO: ");
		miCuadrado_B.dibujar("Mostrando cuadrado: ");
		
		ClaseTemporal objTemp = new ClaseTemporal();
		System.out.println(objTemp);
		
	}
	
 public static void mainArray() {
	Triangulo[] triangulos;
		triangulos = new Triangulo[3];
		triangulos[0] = new Triangulo(0, 0);
		triangulos[1] = new Triangulo(0, 0);
		triangulos[2] = new Triangulo(0, 0);
		triangulos[2].base = 5;
		
		triangulos[0].color = "Blanco";
		triangulos[1].color = "Rojo";
		triangulos[2].color = "Amarillo";
		
		triangulos[0].dibujar();
		triangulos[1].dibujar();
		triangulos[2].dibujar();
}
	public static void mainBascio() {
		Triangulo trianguloAngela = new Triangulo(0, 0);
		float[] tempLongitudes = {2, 3, 5};
		trianguloAngela.longitudes = tempLongitudes;
		System.out.println("El perimetro del triangulo de Angela es: " + trianguloAngela.perimetro());
		trianguloAngela.base = 5f;
		trianguloAngela.altura = 8f;
		trianguloAngela.color = "Rojo";
		System.out.println(trianguloAngela.toString());
		trianguloAngela.dibujar();
		System.out.println("El area del triangulo de Angela es: " + trianguloAngela.area());
		
		
		Triangulo trianguloMario = new Triangulo(0, 0);
		float[] tempLongitudesMario = {3, 5, 7};
		trianguloMario.longitudes = tempLongitudesMario;
		trianguloMario.base = 5f;
		trianguloMario.altura = 10f;
		trianguloMario.color = "Azul";
		System.out.println("El perimetro del triangulo de Mario es: " + trianguloMario.perimetro());
		System.out.println(trianguloMario.toString());
		trianguloMario.dibujar();
		System.out.println("El area del triangulo de Mario es: " + trianguloMario.area());
		
		
		Cuadrado cuadradoMario = new Cuadrado(0);
		cuadradoMario.base = 4;
		cuadradoMario.altura = 4;
		cuadradoMario.color = "Verde";
		System.out.println("El perimetro del cuadrado es: " + cuadradoMario.perimetro());
		System.out.println("El area del cuadrado es: " + cuadradoMario.area());
		cuadradoMario.dibujar();
		
		
		Rectangulo rectanguloMario = new Rectangulo(0, 0);
		rectanguloMario.altura = 2;
		rectanguloMario.base = 4;
		rectanguloMario.color = "Rojo";
		System.out.println("El perimetro del rectangulo es: " + rectanguloMario.perimetro());
		System.out.println("El area del rectangulo es: " + rectanguloMario.area());
		rectanguloMario.dibujar();
		
	}

}
