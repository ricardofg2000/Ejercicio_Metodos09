package unico;

import java.util.Scanner;

public class Ejercicio00 {

	public static void main(String[] args) {
		
		int edad;
		int curso;
		double peso;
		String nombre;
		
		nombre = leerDatoString("¿Como te llamas? ");
		edad = leerDatoInt("Escribe tu edad: ");
		curso = leerDatoInt("¿Cuál es tu curso? ");
		peso = leerDatoDouble("¿Cuanto pesas? ");
		
		System.out.println("Te llamas" + nombre);
		System.out.println("Tienes " + edad + "años");
		System.out.println("Cursas" + curso);
		System.out.println("Tu peso es " + peso);
		

	}

	 static int leerDatoInt(String pregunta) {
		 Scanner leer = new Scanner(System.in);
		 int respuesta;
		 
		 System.out.print(pregunta);
		 respuesta = Integer.parseInt(leer.nextLine());
		 
		 return respuesta;
	}
	 
	 static double leerDatoDouble(String pregunta) {
		 Scanner leer = new Scanner(System.in);
		 double respuesta;
		 
		 System.out.print(pregunta);
		 respuesta = Double.parseDouble(leer.nextLine());
		 
		 return respuesta;
	}
	 
	 static String leerDatoString(String pregunta) {
		 Scanner leer = new Scanner(System.in);
		 String respuesta;
		 
		 System.out.print(pregunta);
		 respuesta = leer.nextLine();
		 
		 return respuesta;
	}

	
}
