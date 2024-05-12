/*
 * Crear un programa que llene un arreglo con los números comprendidos entre 0 y 100
divisibles por 3 y luego los muestre por consola indicando los índices correspondientes
a cada valor.
 */
package EjArreglosNivelInicial;

public class EjCuatro {

	    public static void main(String[] args) {
	        int[] numeros = new int[34];
	        int contador = 0;

	        for (int i = 0; i <= 100; i += 3) {
	            numeros[contador] = i;
	            contador++;
	        }

	        System.out.println("Arreglo con números entre 0 y 100 divisibles por 3 con índices correspondientes:");
	        for (int i = 0; i < contador; i++) {
	            System.out.println("Índice " + i + ": " + numeros[i]);
	        }
	    }
	}

