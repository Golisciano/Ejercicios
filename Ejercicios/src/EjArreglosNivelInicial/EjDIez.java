/*
 * Crear un programa que informe el número de vocales de una cadena introducida por el
usuario.
 */
package EjArreglosNivelInicial;

import java.util.Scanner;

public class EjDIez {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese una cadena de caracteres: ");
	        String cadena = scanner.nextLine().toLowerCase();

	        int contadorVocales = 0;
	        for (int i = 0; i < cadena.length(); i++) {
	            char caracter = cadena.charAt(i);
	            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
	                contadorVocales++;
	            }
	        }

	        System.out.println("El número de vocales en la cadena es: " + contadorVocales);
	    }
	}
