/*
 * Crear un programa que llene un arreglo con cinco números enteros consecutivos y
haga una copia de ese arreglo en otro.
 */
package EjArreglosNivelInicial;

public class EjCinco {

	    public static void main(String[] args) {
	        int[] numeros = new int[5];
	        int[] copia = new int[5];

	        for (int i = 0; i < 5; i++) {
	            numeros[i] = i + 1;
	            copia[i] = numeros[i];
	        }

	        System.out.println("Arreglo original:");
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Índice " + i + ": " + numeros[i]);
	        }

	        System.out.println("Copia del arreglo:");
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Índice " + i + ": " + copia[i]);
	        }
	    }
	}

