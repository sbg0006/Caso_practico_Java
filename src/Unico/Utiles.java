package Unico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utiles {
   
	public static String pideDatoCadena(String pregunta) {
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta="";
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return respuesta;
	}
    
    public static Integer pideDatoEntero (String pregunta) {
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = "";
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return Integer.parseInt(respuesta);
	}
    

}
