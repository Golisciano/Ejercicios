/*
 * Crear un programa que pida al usuario un número entero y lo convierta a binario.
 */
package EjEstructuraArregloExcepcionesNivelBasico;

import java.util.Scanner;

public class EjDieciocho {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese un número entero:");
	        int numero = scanner.nextInt();

	        String binario = Integer.toBinaryString(numero);
	        System.out.println("El número " + numero + " en binario es: " + binario);
	    }
	}

