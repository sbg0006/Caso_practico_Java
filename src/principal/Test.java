package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {
		
		// Declaración de variables		
		
		String nombre;	
		String apellido;
		String respuesta;
		Integer edad;
		
		// Preguntar al usuario ...		
		
		nombre = pideDato("Esbribe tu nombre: ");						
		apellido = pideDato("Esbribe tu apellido: ");		
		edad = Integer.parseInt(pideDato("Escribe tu edad: "));	
		
		// Obtener la respuesta	
		respuesta = nombre + ", " + apellido + ", " + edad;	
		
		// Mostrar la respuesta por pantalla
		System.out.println(respuesta);
		
	}
	
	private static String pideDato(String pregunta) throws IOException {
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta;
		System.out.print(pregunta);
		respuesta = teclado.readLine();
		return respuesta;
	}

}
