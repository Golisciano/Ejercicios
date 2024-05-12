/*
 * Crear un programa que almacene en un arreglo los números primos comprendidos
entre 1 y 100, y luego los muestre por consola indicando los índices correspondientes a
cada valor.
 */
package EjArreglosNivelInicial;

public class EjNueve {

	    public static void main(String[] args) {
	        int[] primos = new int[25]; 
	        int contador = 0;

	        for (int num = 2; num <= 100; num++) {
	            boolean esPrimo = true;
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    esPrimo = false;
	                    break;
	                }
	            }
	            if (esPrimo) {
	                primos[contador] = num;
	                contador++;
	            }
	        }

	        System.out.println("Números primos entre 1 y 100 con índices correspondientes:");
	        for (int i = 0; i < contador; i++) {
	            System.out.println("Índice " + i + ": " + primos[i]);
	        }
	    }
	}

