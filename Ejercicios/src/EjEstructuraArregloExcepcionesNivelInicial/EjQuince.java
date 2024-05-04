/*
Crear un programa que dado un carácter determine e informe si este es un dígito entre
0 y 9.
 */
package EjEstructuraArregloExcepcionesNivelInicial;

import java.util.Scanner;

public class EjQuince {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese un carácter:");
	        char caracter = scanner.next().charAt(0);
	        
	        if (Character.isDigit(caracter)) {
	            System.out.println("El carácter ingresado es un dígito entre 0 y 9.");
	        } else {
	            System.out.println("El carácter ingresado no es un dígito.");
	        }
	    }
}
