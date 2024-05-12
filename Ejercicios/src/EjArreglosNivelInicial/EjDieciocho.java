/*
 * Crear un programa que reciba los datos para rellenar un arreglo de 10 posiciones con
números enteros, y que copie las últimas 5 posiciones en otro arreglo. Informar el
arreglo resultante de la copia de valores indicando los índices correspondientes a cada
valor.
 */
package EjArreglosNivelInicial;

import java.util.Scanner;

public class EjDieciocho {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] arreglo1 = new int[10];
	        int[] arreglo2 = new int[5];

	        System.out.println("Ingrese 10 números enteros para el primer arreglo:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Ingrese el número para la posición " + i + ": ");
	            arreglo1[i] = scanner.nextInt();
	        }

	        for (int i = 5, j = 0; i < 10; i++, j++) {
	            arreglo2[j] = arreglo1[i];
	        }

	        System.out.println("\nSegundo arreglo (últimas 5 posiciones del primero):");
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Índice " + i + ": " + arreglo2[i]);
	        }
	    }
	}


