/*
Crear un programa que reciba del usuario el radio de un círculo como un entero, y que
imprima el diámetro, la circunferencia y el área del círculo mediante el uso del valor de
punto flotante 3.14159 para π, en donde diámetro = 2r, circunferencia = 2 πr y
área = πr2
 */
package EjEstructuraNivelBasico;

import java.util.Scanner;

public class EjOcho {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el radio del círculo:");
	        int radio = scanner.nextInt();

	        double diametro = 2 * radio;
	        double circunferencia = 2 * Math.PI * radio;
	        double area = Math.PI * radio * radio;

	        System.out.println("Diámetro: " + diametro);
	        System.out.println("Circunferencia: " + circunferencia);
	        System.out.println("Área: " + area);
	    }
	}

