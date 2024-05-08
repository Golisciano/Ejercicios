/*
 * Crear un programa que pida al usuario un número entero de 5 dígitos, y que muestre
por consola el resultado de la suma de todos sus dígitos. En el caso de que se ingrese
un número de más dígitos o de menos dígitos informar el error y volver a pedir el
número.
 */
package EjEstructuraNivelBasico;

import java.util.Scanner;

public class EjDos {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numero;
	        do {
	            System.out.println("Ingrese un número entero de 5 dígitos:");
	            numero = scanner.nextInt();
	            if (numero < 10000 || numero > 99999) {
	                System.out.println("Error: El número debe tener exactamente 5 dígitos.");
	            }
	        } while (numero < 10000 || numero > 99999);
	        
	        int suma = 0;
	        int temp = numero;
	        while (temp != 0) {
	            suma += temp % 10;
	            temp /= 10;
	        }
	        
	        System.out.println("La suma de los dígitos es: " + suma);
	    }
}
