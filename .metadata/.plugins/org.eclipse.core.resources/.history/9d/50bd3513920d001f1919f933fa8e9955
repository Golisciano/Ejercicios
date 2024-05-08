/*
 * Crear un programa en donde se ingrese la variedad de artículos vendidos y luego de
eso, se ingrese la cantidad de artículos por cada ocurrencia, y el precio del artículo.
Mostrar por consola a modo de factura, Nro de artículo, cantidad, precio unitario, y al
final de la misma, total a pagar.
 */
package EjEstructuraArregloExcepcionesNivelBasico;

import java.util.Scanner;

public class EjVeinte {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese la cantidad de variedades de artículos vendidos:");
	        int cantidadVariedades = scanner.nextInt();
	        double totalPagar = 0;

	        for (int i = 1; i <= cantidadVariedades; i++) {
	            System.out.println("Ingrese el nombre del artículo " + i + ":");
	            String articulo = scanner.next();
	            System.out.println("Ingrese la cantidad de " + articulo + " vendidos:");
	            int cantidad = scanner.nextInt();
	            System.out.println("Ingrese el precio unitario de " + articulo + ":");
	            double precioUnitario = scanner.nextDouble();
	            double subtotal = cantidad * precioUnitario;
	            System.out.println("Factura del artículo " + i + ":");
	            System.out.println("Nro de artículo: " + i);
	            System.out.println("Artículo: " + articulo);
	            System.out.println("Cantidad: " + cantidad);
	            System.out.println("Precio unitario: $" + precioUnitario);
	            System.out.println("Subtotal: $" + subtotal);
	            totalPagar += subtotal;
	        }

	        System.out.println("Total a pagar: $" + totalPagar);
	    }
	}

