/*
 * Crear un programa que pida 10 números enteros al usuario, los guarde en un vector, y
finalmente muestre los datos del vector indicando los índices correspondientes a cada
valor.
 */
package EjArreglosNivelInicial;

import java.util.Scanner;

public class EjUno {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[10];

	        System.out.println("Ingrese 10 números enteros:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            while (!scanner.hasNextInt()) {
	                System.out.println("Por favor, ingrese un número entero.");
	                scanner.next();
	            }
	            numeros[i] = scanner.nextInt();
	        }

	        System.out.println("Datos del vector con índices correspondientes:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Índice " + i + ": " + numeros[i]);
	        }
	    }
	}
