/*
 * Crear un programa para leer por teclado la nota de N alumnos de una clase y
almacenarlas en un vector. Calcular la nota promedio de la clase y mostrar los alumnos
por encima del promedio.
 */
package EjArreglosNivelInicial;

import java.util.Scanner;

public class EjDiecinueve {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la cantidad de alumnos: ");
	        int cantidadAlumnos = scanner.nextInt();
	        int[] notas = new int[cantidadAlumnos];

	        for (int i = 0; i < cantidadAlumnos; i++) {
	            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
	            notas[i] = scanner.nextInt();
	        }

	        double suma = 0;
	        for (int nota : notas) {
	            suma += nota;
	        }
	        double promedio = suma / cantidadAlumnos;

	        System.out.println("La nota promedio de la clase es: " + promedio);

	        System.out.println("Los alumnos por encima del promedio son:");
	        for (int i = 0; i < cantidadAlumnos; i++) {
	            if (notas[i] > promedio) {
	                System.out.println("Alumno " + (i + 1) + ": Nota " + notas[i]);
	            }
	        }
	    }
	}


