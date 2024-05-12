/*
 * Crear un programa en donde se pida al usuario la dimensión del vector a crear, y luego
se pida al mismo que ingrese números enteros correspondientes a cada posición del
vector. Se debe ordenar el mismo en forma creciente y luego mostrar el vector
ordenado indicando los índices correspondientes a cada valor.
 */
package EjArreglosNivelInicial;

import java.util.Arrays;
import java.util.Scanner;

public class EjCatorce {

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
	    }
	}


