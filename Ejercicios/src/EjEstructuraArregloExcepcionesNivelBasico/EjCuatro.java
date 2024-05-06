/*
 * Crear un programa que muestre por consola los caracteres ASCII que se encuentran
entre los valores 30 y 126 inclusive. Los caracteres se deben mostrar en 7 filas de 15
columnas.
 */
package EjEstructuraArregloExcepcionesNivelBasico;

public class EjCuatro {

	    public static void main(String[] args) {
	        int inicio = 30;
	        int fin = 126;
	        int caracteresPorFila = 15;

	        for (int i = inicio; i <= fin; i++) {
	            System.out.print((char) i + " ");
	            if ((i - inicio + 1) % caracteresPorFila == 0) {
	                System.out.println();
	            }
	        }
	    }
	}
