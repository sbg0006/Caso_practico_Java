package Unico;

public class Principal {

	public static void main(String[] args) {
		
		int opcion = 0;
		
		do {
			mostrarMenu();
			opcion = Utiles.pideDatoEntero("Opcion (0-Salir)");
			ejecutarOpcion(opcion);
		} while(opcion!=0);

	}

	private static void ejecutarOpcion(int opcion) {
		
		switch(opcion) {
		case 7: Intercambio.maxMinMed();break;
	
		}		
	}

	private static void mostrarMenu() {
		
		System.out.println("\nMENU PRUINCIPAL");
		System.out.println("----------------");
		System.out.println("7. maxMinMed");
	
	}  

}