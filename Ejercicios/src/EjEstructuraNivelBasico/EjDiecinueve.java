/*
 * Crear un programa que pida al usuario una velocidad en Km/h, la convierta a m/s e
informe por consola la conversión.
 */
package EjEstructuraNivelBasico;

import java.util.Scanner;

public class EjDiecinueve {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese la velocidad en Km/h:");
	        double velocidadKmH = scanner.nextDouble();

	        double velocidadMS = velocidadKmH * 1000 / 3600;
	        System.out.println("La velocidad en m/s es: " + velocidadMS);
	    }
	}

