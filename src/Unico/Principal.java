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
		case 8: Intercambio.potencia();break;
		case 12: Intercambio.dado();break;
		case 66: Intercambio.quiniela();break;
		}		
	}

	private static void mostrarMenu() {
		
		System.out.println("\nMENU PRUINCIPAL");
		System.out.println("----------------");
		System.out.println("8. Estructurado");
		System.out.println("12. Intercambio");
		System.out.println("66. Quiniela");
		System.out.println("4. XXXXXXX");
	}  

}