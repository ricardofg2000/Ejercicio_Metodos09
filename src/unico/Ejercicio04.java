package unico;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * Implementar un método que reciba como parámetros dos números enteros y que
		 * devuelva el mayor de los dos.
		 * 
		 * Ampliación : Repetir el ejercicio anterior con una versión que calcule el
		 * máximo de 3 números. Piensa un poco, no hagas el algoritmo de comparación de
		 * los 3 números desde cero.
		 */

		int a;
		int b;
		int c;

		int numMayor;

		a = Util.leerInt("Introduzca un número: ");
		b = Util.leerInt("Introduzca un número: ");
		c = Util.leerInt("Introduzca un número: ");

		numMayor = mayor(mayor(a, b), c);

		Util.escribir("El mayor es = " + numMayor);
	}

	public static int mayor(int n1, int n2) {
		int m;
		m = (n1 > n2) ? n1 : n2;
		return m;
	}

}
