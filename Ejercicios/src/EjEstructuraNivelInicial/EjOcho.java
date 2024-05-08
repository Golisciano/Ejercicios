/*
Crear un programa que pida dos números enteros al usuario, y que informe si el
primero es un múltiplo del segundo o no.
 */
package EjEstructuraNivelInicial;
import java.util.Scanner;

public class EjOcho {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el primer número entero: ");
	        int num1 = scanner.nextInt();
	        System.out.println("Ingrese el segundo número entero: ");
	        int num2 = scanner.nextInt();
	        
	        if (num1 % num2 == 0) {
	            System.out.println(num1 + " es múltiplo de " + num2);
	        } else {
	            System.out.println(num1 + " no es múltiplo de " + num2);
	        }
	    }
	}

