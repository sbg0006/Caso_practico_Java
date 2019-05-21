package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {
		
		// Declaración de variables		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String nombre;	
		String apellido;
		String respuesta;
		Integer edad;
		
		// Preguntar al usuario ...		
		System.out.print("Esbribe tu nombre: ");		
		nombre = teclado.readLine();				
		
		System.out.print("Esbribe tu apellido: ");			
		apellido = teclado.readLine();	
		
		System.out.print("Esbribe tu edad: ");			
		edad = Integer.parseInt(teclado.readLine());	
		
		// Obtener la respuesta	
		respuesta = nombre + ", " + apellido + ", " + edad;	
		
		// Mostrar la respuesta por pantalla
		System.out.println(respuesta);
		
	}

}
