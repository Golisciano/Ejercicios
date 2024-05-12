/*
 * Crear un programa que determine e informe si una cadena de caracteres introducida
por el usuario es o no un palíndromo, es decir, una palabra que se lee igual al derecho
que al revés.
 */
package EjArreglosNivelInicial;

import java.util.Scanner;

public class EjDoce {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese una cadena de caracteres: ");
	        String cadena = scanner.nextLine().toLowerCase().replaceAll("\\s+", ""); // Convertimos a minúsculas y eliminamos espacios

	        boolean esPalindromo = true;
	        for (int i = 0; i < cadena.length() / 2; i++) {
	            if (cadena.charAt(i) != cadena.charAt(cadena.length() - i - 1)) {
	                esPalindromo = false;
	                break;
	            }
	        }

	        if (esPalindromo) {
	            System.out.println("La cadena es un palíndromo.");
	        } else {
	            System.out.println("La cadena no es un palíndromo.");
	        }
	    }
	}

