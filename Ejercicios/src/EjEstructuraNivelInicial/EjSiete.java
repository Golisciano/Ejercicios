//Crear un programa que informe si un número ingresado es par o impar.
package EjEstructuraNivelInicial;

import java.util.Scanner;

public class EjSiete {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese un número entero: ");
	        int numero = scanner.nextInt();
	        
	        if (numero % 2 == 0) {
	            System.out.println("El número " + numero + " es par.");
	        } else {
	            System.out.println("El número " + numero + " es impar.");
	        }
	    }
	}

