/*
 * Crear un programa que pida al usuario ingresar un valor en pesos, e informe la cantidad
mínima de billetes y monedas necesarias para la cantidad ingresada.
 */
package EjEstructuraArregloExcepcionesNivelBasico;

import java.util.Scanner;

public class EjSiete {
    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese la cantidad en pesos:");
	        int cantidad = scanner.nextInt();

	        int[] denominaciones = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
	        int[] cantidadDenominaciones = new int[denominaciones.length];

	        for (int i = 0; i < denominaciones.length; i++) {
	            cantidadDenominaciones[i] = cantidad / denominaciones[i];
	            cantidad %= denominaciones[i];
	        }

	        System.out.println("Se necesitan los siguientes billetes y monedas:");
	        for (int i = 0; i < denominaciones.length; i++) {
	            if (cantidadDenominaciones[i] > 0) {
	                System.out.println(cantidadDenominaciones[i] + " billetes/monedas de $" + denominaciones[i]);
	            }
	        }
	    }
}
