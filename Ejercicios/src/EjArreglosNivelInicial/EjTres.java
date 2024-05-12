/*
 * 3) Crear un programa que llene un arreglo con los números pares comprendidos entre 1 y
100 y luego los muestre por consola indicando los índices correspondientes a cada
valor.
 */
package EjArreglosNivelInicial;

public class EjTres {

	    public static void main(String[] args) {
	        int[] numeros = new int[50];
	        int contador = 0;

	        for (int i = 2; i <= 100; i += 2) {
	            numeros[contador] = i;
	            contador++;
	        }

	        System.out.println("Arreglo con números pares entre 1 y 100 con índices correspondientes:");
	        for (int i = 0; i < contador; i++) {
	            System.out.println("Índice " + i + ": " + numeros[i]);
	        }
	    }
	}

