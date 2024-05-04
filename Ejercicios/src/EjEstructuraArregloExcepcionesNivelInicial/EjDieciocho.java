/*
 * Crear un programa que cuente e informe la cantidad de un número entero que ingrese
el usuario.
 */
package EjEstructuraArregloExcepcionesNivelInicial;

import java.util.Scanner;

public class EjDieciocho {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el número entero:");
	        int numero = scanner.nextInt();
	        System.out.println("Ingrese el número para contar:");
	        int numeroConteo = scanner.nextInt();
	        
	        int contador = 0;
	        int temp = numero;
	        while (temp != 0) {
	            int digito = temp % 10;
	            if (digito == numeroConteo) {
	                contador++;
	            }
	            temp /= 10;
	        }
	        
	        System.out.println("El número " + numeroConteo + " aparece " + contador + " veces en el número " + numero + ".");
	    }
	}
