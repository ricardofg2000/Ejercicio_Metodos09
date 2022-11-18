package unico;

public class Ejercicio09 {

	public static void main(String[] args) {
		/*
		 * Implementar un método que decida si dos números enteros positivos son amigos.
		 * Dos números son amigos si la suma de los divisores propios (distinto de él
		 * mismo) del primer número es igual al segundo número, y viceversa. Ejemplos:
		 * (220 - 284), (1184 - 1210)
		 */
		final String S_AMIGO = "Los números son amigos";
		final String N_AMIGO = "Los números no son amigos";
		int n1;
		int n2;
		boolean respuesta;
		String mensaje;

		n1 = Util.leerInt("Introduzca un número: ");
		n2 = Util.leerInt("Introduzca un número: ");

		mensaje = (esAmigo(n1, n2)) ? S_AMIGO : N_AMIGO;
		
		Util.escribir(mensaje);
	}

	private static boolean esAmigo(int n1, int n2) {
		boolean amigo = false;
		int sumDiv1 = 0;
		int sumDiv2 = 0;
		sumDiv1 = sumaDivisores(n1);
		sumDiv2 = sumaDivisores(n2);
		amigo = (sumDiv1 == sumDiv2);
		
		return amigo;
	}

	private static int sumaDivisores(int num) {
		int suma = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				//ver lo divisores, extra
				Util.escribir(i);
				suma += i;
			}
		}
		//ver la suma
		Util.escribir(suma);
		return suma;
	}

}
