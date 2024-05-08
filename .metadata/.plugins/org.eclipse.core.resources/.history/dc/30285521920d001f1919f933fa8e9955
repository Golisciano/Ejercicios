/*
 * Crear un programa que pida al usuario cinco números enteros y que determine e
imprima los enteros mayor y menor en el grupo.
 */
package EjEstructuraArregloExcepcionesNivelInicial;

import java.util.Scanner;
public class EjSeis {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        int[] numeros = new int[5];

		        System.out.println("Ingrese cinco números enteros:");

		        for (int i = 0; i < 5; i++) {
		            numeros[i] = scanner.nextInt();
		        }

		        int mayor = numeros[0];
		        int menor = numeros[0];
		        for (int i = 1; i < 5; i++) {
		            if (numeros[i] > mayor) {
		                mayor = numeros[i];
		            }
		            if (numeros[i] < menor) {
		                menor = numeros[i];
		            }
		        }

		        System.out.println("El número mayor es: " + mayor);
		        System.out.println("El número menor es: " + menor);
		    }

	}

