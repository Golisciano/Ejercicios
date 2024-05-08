/*
Crear un programa que informe su peso efectivo en la luna, sabiendo que este será un
17% respecto a su peso en la tierra.
 */
package EjEstructuraNivelBasico;

import java.util.Scanner;

public class EjUno {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese su peso en la Tierra:");
	        double pesoEnTierra = scanner.nextDouble();
	        
	        double pesoEnLuna = pesoEnTierra * 0.17;
	        
	        System.out.println("Su peso efectivo en la Luna es: " + pesoEnLuna + " kg");
	    }
	}
