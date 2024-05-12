/*
 * Crear un programa que lea una cadena de caracteres introducida desde el teclado por
el usuario y la muestre al revés.
 */
package EjArreglosNivelInicial;

import java.util.Scanner;

public class EjOnce {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese una cadena de caracteres: ");
	        String cadena = scanner.nextLine();

	        String cadenaAlReves = "";
	        for (int i = cadena.length() - 1; i >= 0; i--) {
	            cadenaAlReves += cadena.charAt(i);
	        }

	        System.out.println("La cadena al revés es: " + cadenaAlReves);
	    }
	}


