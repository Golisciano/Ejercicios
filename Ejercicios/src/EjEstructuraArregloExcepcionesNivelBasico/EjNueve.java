/*
 * Crear un programa que calcule e informe el factorial de un número n. El factorial de un
número n es: n! = 1 x 2 x 3 x ... x n.
 */
package EjEstructuraArregloExcepcionesNivelBasico;

import java.util.Scanner;

public class EjNueve {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese un número para calcular su factorial:");
	        int n = scanner.nextInt();

	        long factorial = 1;
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        }

	        System.out.println("El factorial de " + n + " es: " + factorial);
	    }
	}


