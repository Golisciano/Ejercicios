/*
 * Crear un programa que lea un número entero n mayor a cero que identifica una
cantidad de segundos, y calcule e imprima el número de horas, minutos y segundos
contenidos en ella. Ejemplo: Para n = 15723 se debe imprimir 4 horas, 22 minutos y 3
segundos.
 */
package EjEstructuraArregloExcepcionesNivelBasico;

import java.util.Scanner;

public class EjQuince {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese la cantidad de segundos:");
	        int segundos = scanner.nextInt();

	        int horas = segundos / 3600;
	        segundos %= 3600;
	        int minutos = segundos / 60;
	        segundos %= 60;

	        System.out.println("Tiempo: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
	    }
	}


