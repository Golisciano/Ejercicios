/*
Crear un programa que reciba cinco números, y que determine e imprima la cantidad
de números negativos, positivos, y la cantidad de ceros recibidos.
 */
package EjEstructuraArregloExcepcionesNivelInicial;
import java.util.Scanner;

public class EjNueve {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int negativos = 0;
	        int positivos = 0;
	        int ceros = 0;

	        System.out.println("Ingrese cinco números enteros:");

	        // Leer los cinco números enteros y contar positivos, negativos y ceros
	        for (int i = 0; i < 5; i++) {
	            int numero = scanner.nextInt();
	            if (numero < 0) {
	                negativos++;
	            } else if (numero > 0) {
	                positivos++;
	            } else {
	                ceros++;
	            }
	        }

	        System.out.println("Cantidad de números negativos: " + negativos);
	        System.out.println("Cantidad de números positivos: " + positivos);
	        System.out.println("Cantidad de ceros: " + ceros);
	    }
	}
