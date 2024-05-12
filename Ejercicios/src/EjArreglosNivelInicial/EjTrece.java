/*
 * Crear un programa en donde se almacenen los números del 1 al 100 en un vector, y se
informe por consola los números pares e impares.
 */
package EjArreglosNivelInicial;

public class EjTrece {

	    public static void main(String[] args) {
	        int[] numeros = new int[100];

	        for (int i = 0; i < 100; i++) {
	            numeros[i] = i + 1;
	        }

	        System.out.println("Números pares:");
	        for (int i = 0; i < 100; i++) {
	            if (numeros[i] % 2 == 0) {
	                System.out.println("Índice " + i + ": " + numeros[i]);
	            }
	        }

	        System.out.println("\nNúmeros impares:");
	        for (int i = 0; i < 100; i++) {
	            if (numeros[i] % 2 != 0) {
	                System.out.println("Índice " + i + ": " + numeros[i]);
	            }
	        }
	    }
	}

