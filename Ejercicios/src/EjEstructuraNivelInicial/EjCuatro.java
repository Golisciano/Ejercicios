/*Crear un programa que pida al usuario dos números enteros y que imprima un mensaje
indicando si el primer número es mayor, menor o igual al segundo.
*/
package EjEstructuraNivelInicial;

import java.util.Scanner;

public class EjCuatro {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el primer número entero: ");
	        int num1 = scanner.nextInt();
	        System.out.println("Ingrese el segundo número entero: ");
	        int num2 = scanner.nextInt();
	        
	        if (num1 > num2) {
	            System.out.println(num1 + " es mayor que " + num2);
	        } else if (num1 < num2) {
	            System.out.println(num1 + " es menor que " + num2);
	        } else {
	            System.out.println(num1 + " es igual a " + num2);
	        }
	    }
	}

