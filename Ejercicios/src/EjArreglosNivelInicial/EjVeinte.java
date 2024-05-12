/*
 * Crear un programa que pida ingresar los datos de N empleados. Por cada empleado se
pide nombre y sueldo, que deben almacenar en dos vectores. Luego de eso calcular e
informar el empleado con mayor sueldo.
 */
package EjArreglosNivelInicial;

import java.util.Scanner;

public class EjVeinte {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la cantidad de empleados: ");
	        int cantidadEmpleados = scanner.nextInt();

	        String[] nombres = new String[cantidadEmpleados];
	        double[] sueldos = new double[cantidadEmpleados];

	        for (int i = 0; i < cantidadEmpleados; i++) {
	            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
	            scanner.nextLine();
	            nombres[i] = scanner.nextLine();

	            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
	            sueldos[i] = scanner.nextDouble();
	        }

	        int indiceMayorSueldo = 0;
	        double mayorSueldo = sueldos[0];
	        for (int i = 1; i < cantidadEmpleados; i++) {
	            if (sueldos[i] > mayorSueldo) {
	                mayorSueldo = sueldos[i];
	                indiceMayorSueldo = i;
	            }
	        }

	        System.out.println("El empleado con mayor sueldo es:");
	        System.out.println("Nombre: " + nombres[indiceMayorSueldo]);
	        System.out.println("Sueldo: " + mayorSueldo);
	    }
	}


