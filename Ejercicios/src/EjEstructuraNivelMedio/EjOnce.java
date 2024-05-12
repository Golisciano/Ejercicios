/*
 * Crear un programa que permita el ingreso de n ternas de valores enteros. Se debe
calcular e informar:
 De cada terna el mayor valor y su orden en la terna.
 De cada terna cuantos valores son múltiplos de 7. Ídem de todas las ternas
 De todas las ternas el promedio del primer valor de cada una
 */
package EjEstructuraNivelMedio;

import java.util.Scanner;

public class EjOnce {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la cantidad de ternas: ");
	        int n = scanner.nextInt();
	        int sumaPrimerValor = 0;

	        for (int i = 1; i <= n; i++) {
	            System.out.println("Ingrese la tercera número de la tercera " + i + ":");
	            int a = scanner.nextInt();
	            int b = scanner.nextInt();
	            int c = scanner.nextInt();

	            int mayor = a;
	            int orden = 1;
	            if (b > mayor) {
	                mayor = b;
	                orden = 2;
	            }
	            if (c > mayor) {
	                mayor = c;
	                orden = 3;
	            }

	            System.out.println("El mayor valor de la terna " + i + " es: " + mayor + ", y está en la posición: " + orden);

	            int multiplosDe7 = 0;
	            if (a % 7 == 0) multiplosDe7++;
	            if (b % 7 == 0) multiplosDe7++;
	            if (c % 7 == 0) multiplosDe7++;

	            System.out.println("En la terna " + i + " hay " + multiplosDe7 + " valores que son múltiplos de 7.");

	            sumaPrimerValor += a;
	        }

	        double promedio = (double) sumaPrimerValor / n;
	        System.out.println("El promedio del primer valor de cada terna es: " + promedio);

	        scanner.close();
	    }
	}
