/*
 * Modificar el ejercicio anterior para calcular e informar la cantidad de números
negativos, positivos y ceros.
 */
package EjArreglosNivelInicial;

import java.util.Arrays;
import java.util.Scanner;

public class EjDieciseis {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la dimensión del vector: ");
	        int dimension = scanner.nextInt();
	        int[] vector = new int[dimension];

	        for (int i = 0; i < dimension; i++) {
	            System.out.print("Ingrese el número para la posición " + i + ": ");
	            vector[i] = scanner.nextInt();
	        }

	        Arrays.sort(vector);

	        System.out.println("\nVector ordenado:");
	        for (int i = 0; i < dimension; i++) {
	            System.out.println("Índice " + i + ": " + vector[i]);
	        }

	        int negativos = 0, positivos = 0, ceros = 0;
	        for (int num : vector) {
	            if (num < 0) {
	                negativos++;
	            } else if (num > 0) {
	                positivos++;
	            } else {
	                ceros++;
	            }
	        }
	        System.out.println("\nCantidad de números negativos: " + negativos);
	        System.out.println("Cantidad de números positivos: " + positivos);
	        System.out.println("Cantidad de ceros: " + ceros);
	    }
	}
