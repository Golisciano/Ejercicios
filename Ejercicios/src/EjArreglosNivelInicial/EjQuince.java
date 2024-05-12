/*
 * Modificar el ejercicio anterior para calcular e informar el valor máximo y mínimo del
vector.
 */
package EjArreglosNivelInicial;

import java.util.Arrays;
import java.util.Scanner;

public class EjQuince {


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

	        System.out.println("\nValor máximo del vector: " + vector[dimension - 1]);
	        System.out.println("Valor mínimo del vector: " + vector[0]);
	    }
	}


