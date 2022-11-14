package unico;

import java.util.Scanner;

public class Ejercicio00 {

	public static void main(String[] args) {
		
		int edad;
		int curso;
		
		edad = leerDato("Escribe tu edad: ");
		
		curso = leerDato("¿Cuál es tu curso? ");
		
		System.out.println("Tienes " + edad + "años");
		System.out.println("Cursas" + curso);
		

	}

	 static int leerDato(String pregunta) {
		 Scanner leer = new Scanner(System.in);
		 int respuesta;
		 
		 System.out.print(pregunta);
		 respuesta = Integer.parseInt(leer.nextLine());
		 
		 return respuesta;
	}

	
}
