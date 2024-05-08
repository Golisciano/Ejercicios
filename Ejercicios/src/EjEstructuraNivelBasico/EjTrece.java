/*
 * Crear un programa para determinar e informar si un número entero es capicúa
(número que se escribe igual al derecho y al revés). No utilice cadenas.
 */
package EjEstructuraNivelBasico;

import java.util.Scanner;

public class EjTrece {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese un número entero:");
	        int numero = scanner.nextInt();

	        int numeroInvertido = 0;
	        int temp = numero;
	        while (temp != 0) {
	            int digito = temp % 10;
	            numeroInvertido = numeroInvertido * 10 + digito;
	            temp /= 10;
	        }

	        if (numero == numeroInvertido) {
	            System.out.println(numero + " es un número capicúa.");
	        } else {
	            System.out.println(numero + " no es un número capicúa.");
	        }
	    }
	}

