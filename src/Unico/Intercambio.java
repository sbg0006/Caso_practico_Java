package Unico;

public class Intercambio {
	
	/**
	 * M�ximo, m�nimo, media - Realizar un programa en JAVA que lea 10
     n�meros y calcule la media, el m�ximo y el m�nimo de los n�meros
     introducidos.
	 */
	public static void maxMinMed() {
		
		final Integer TOTAL_DATOS = 10;
		Integer [] num = new Integer[TOTAL_DATOS];
		Integer maximo;
		Integer minimo;
		Double media;
		
		// Pedir los datos al usuario
		
		for (int i = 0; i<num.length; i++) {
			num[i] = Utiles.pideDatoEntero("Introduzca el numero ("+(i+1) +"/"+num.length+") :");
		}
		//Calculo de los valores
		maximo = Utiles.maxVector(num);
		minimo = Utiles.minVector(num);
		media = Utiles.medVector(num);
		
		// Mostrar los resultados
		System.out.println("El valor m�ximo es: "+ maximo);
		System.out.println("El valor m�nimo es: "+ minimo);
		System.out.println("El valor medio es: "+ media);

		
	}

}
	
