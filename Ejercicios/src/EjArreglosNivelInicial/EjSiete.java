/*
 * Crear un programa que solicite cinco números, los almacene en un arreglo y luego
calcule el promedio de esos números informando el resultado.
 */
package EjArreglosNivelInicial;

import java.util.Scanner;

public class EjSiete {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numeros = new int[5];
	        int suma = 0;

	        System.out.println("Ingrese cinco números:");

	        for (int i = 0; i < 5; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            while (!scanner.hasNextInt()) {
	                System.out.println("Por favor, ingrese un número entero.");
	                scanner.next();
	            }
	            numeros[i] = scanner.nextInt();
	            suma += numeros[i];
	        }

	        double promedio = (double) suma / 5;
	        System.out.println("El promedio de los números ingresados es: " + promedio);
	    }
	}
