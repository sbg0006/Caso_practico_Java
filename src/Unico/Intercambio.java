package Unico;

import java.util.Random;

public class Intercambio {
	
	/**
	 * Intercambio-Realizar un programa en JAVA que lea dos números por
       teclado e intercambie sus valores.
	 */

	public static void estructurado() {
		
		int a,b,aux;
		
		a = Utiles.pideDatoEntero("Introduzca un numero: ");
		b = Utiles.pideDatoEntero("Introduzca otro numero: ");
		
		System.out.println("ANTES: a= "+a+"b= "+b);
	
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("DESPUES INTERCAMBIO: a= "+ a +"b= "+ b);
	}
		
	/**
	 * Potencia - Realizar un programa en JAVA que calcule la potencia de un
        número leyendo por teclado el valor de su base y su exponente.
	 */
		
	public static void potencia() {
		Integer base;
		Integer exponente;
		Integer potencia; 
		base = Utiles.pideDatoEntero("Introduzca la base: ");
		exponente= Utiles.pideDatoEntero("Introduzca el exponente: ");
		potencia = calc_potencia(base,exponente);
		System.out.println(base + "elevado a "+ exponente + "vale "+ potencia);
	
	}
	
	private static Integer calc_potencia(Integer base, Integer exponente) {
	
		Integer p=1;
		
		for (int i=1; i<=exponente; i++) {
		
			p = p * base;
		}
		return p;	
	}
	
	/**
	 * Dado - Realizar un programa en JAVA que simule las tiradas de un dado.
      Indicarle el número de tiradas a realizar.
	 */
	
	public static void dado() {
		
		Integer tiradas;
		Integer puntosDado;	
		tiradas= Utiles.pideDatoEntero("Numero de tiradas del dado: ");
		
		for (int t =1; t<= tiradas; t++) {
			
			puntosDado = aleatorio(1,6);
			System.out.println("Puntos = "+ puntosDado);
		}
	}
	
	private static Integer aleatorio(int min, int max) {
		
		Random aleatorio = new Random();
		Integer n = aleatorio.nextInt((max - min)+1)+ min;	
		return n;
		
	}
	
	/**
	 * Quiniela - Realizar un programa en JAVA que muestre por pantalla una
     posible combinación de una quiniela, es decir, 14 más el pleno al quince.
	 */
	
	public static void quiniela() {
		
		Integer resultado;
		String mostrar;
		String salida="";
		for (int p=1; p <= 14; p++) {
			resultado=aleatorio(1,3);
			mostrar = (resultado==3)?"X":"" + resultado;	
			salida += "Resultado " + p + " es: " + mostrar +"\n";		
		}
		
		System.out.println(salida);
			
	}
	
}
	
