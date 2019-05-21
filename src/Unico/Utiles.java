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
		
		String respuesta = pideDatoCadena(pregunta);
		return Integer.parseInt(respuesta);
	}
    
    public static Double pideDatoDecimal (String pregunta) {
		
		String respuesta = pideDatoCadena(pregunta);
		return Double.parseDouble(respuesta);
	}
     
    public static Integer maxVector(Integer[] num) {
    	
    	Integer mayor = num[0];
    	for (int i=1; i<num.length-1;i++) {
    		mayor = Math.max(mayor, num[i]);
    	}
    	return mayor;
    }
    public static Integer minVector(Integer[] num) {
    	
    	Integer menor = num[0];
    	for (int i=1; i<num.length-1;i++) {
    		menor = Math.min(menor, num[i]);
    	}
    	return menor;
    }
    
    public static Double medVector(Integer[] num) { 
    	return sumVector(num)/ ((double)num.length);
    }
    
    public static Integer sumVector(Integer[] num) {
    	
    	Integer suma = 0;
    	for (int i=0; i<num.length;i++) {
    		suma += num[i];
    	}
    	return suma;
     }
}
