/*
 * Crear un programa que mediante un menú permita consultar, asignar, modificar y
eliminar datos de un vector de tipo entero de veinte posiciones. Para realizar las
operaciones se debe ingresar la posición del vector a la cual se desea acceder.
 */
package EjArreglosNivelInicial;

import java.util.Scanner;

public class EjDiecisiete {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] vector = new int[20];

	        while (true) {
	            System.out.println("\nMenú:");
	            System.out.println("1. Consultar dato");
	            System.out.println("2. Asignar dato");
	            System.out.println("3. Modificar dato");
	            System.out.println("4. Eliminar dato");
	            System.out.println("5. Salir");
	            System.out.print("Seleccione una opción: ");
	            int opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    System.out.print("Ingrese la posición del vector a consultar: ");
	                    int posicionConsulta = scanner.nextInt();
	                    if (posicionConsulta >= 0 && posicionConsulta < 20) {
	                        System.out.println("El dato en la posición " + posicionConsulta + " es: " + vector[posicionConsulta]);
	                    } else {
	                        System.out.println("Posición fuera de rango.");
	                    }
	                    break;
	                case 2:
	                    System.out.print("Ingrese la posición del vector a asignar: ");
	                    int posicionAsignar = scanner.nextInt();
	                    if (posicionAsignar >= 0 && posicionAsignar < 20) {
	                        System.out.print("Ingrese el dato a asignar: ");
	                        int dato = scanner.nextInt();
	                        vector[posicionAsignar] = dato;
	                        System.out.println("Dato asignado correctamente.");
	                    } else {
	                        System.out.println("Posición fuera de rango.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Ingrese la posición del vector a modificar: ");
	                    int posicionModificar = scanner.nextInt();
	                    if (posicionModificar >= 0 && posicionModificar < 20) {
	                        System.out.print("Ingrese el nuevo dato: ");
	                        int nuevoDato = scanner.nextInt();
	                        vector[posicionModificar] = nuevoDato;
	                        System.out.println("Dato modificado correctamente.");
	                    } else {
	                        System.out.println("Posición fuera de rango.");
	                    }
	                    break;
	                case 4:
	                    System.out.print("Ingrese la posición del vector a eliminar: ");
	                    int posicionEliminar = scanner.nextInt();
	                    if (posicionEliminar >= 0 && posicionEliminar < 20) {
	                        vector[posicionEliminar] = 0;
	                        System.out.println("Dato eliminado correctamente.");
	                    } else {
	                        System.out.println("Posición fuera de rango.");
	                    }
	                    break;
	                case 5:
	                    System.out.println("Saliendo del programa...");
	                    return;
	                default:
	                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
	            }
	        }
	    }
	}


