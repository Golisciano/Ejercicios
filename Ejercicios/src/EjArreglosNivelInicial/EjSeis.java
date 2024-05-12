/*
 * Crear un programa que llene un arreglo con los veinte primeros números pares y
calcule su suma, informando el resultado.
 */
package EjArreglosNivelInicial;

public class EjSeis {

	    public static void main(String[] args) {
	        int[] numeros = new int[20];
	        int suma = 0;

	        for (int i = 0; i < 20; i++) {
	            numeros[i] = (i + 1) * 2;
	            suma += numeros[i];
	        }

	        System.out.println("Arreglo con los veinte primeros números pares:");
	        for (int i = 0; i < 20; i++) {
	            System.out.println("Índice " + i + ": " + numeros[i]);
	        }

	        System.out.println("La suma de los veinte primeros números pares es: " + suma);
	    }
	}
