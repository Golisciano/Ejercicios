/*
 * Crear un programa que llene un arreglo con los números enteros comprendidos entre 4
y 14, y luego lo muestre por consola indicando los índices correspondientes a cada
valor.
 */
package EjArreglosNivelInicial;

public class EjDos {

	    public static void main(String[] args) {
	        int[] numeros = new int[11];

	        for (int i = 0; i < 11; i++) {
	            numeros[i] = i + 4;
	        }

	        System.out.println("Arreglo con números entre 4 y 14 con índices correspondientes:");
	        for (int i = 0; i < 11; i++) {
	            System.out.println("Índice " + i + ": " + numeros[i]);
	        }
	    }
	}
