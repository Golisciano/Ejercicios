/*
 * Crear un programa que determine e informe en cuantos números de 4 cifras se
encuentran más números 1 que 2. Debe existir un 1 y un 2 para considerarlo.
 */
package EjEstructuraNivelMedio;

public class EjDiez {

	    public static void main(String[] args) {
	        int contador = 0;

	        for (int i = 1000; i <= 9999; i++) {
	            String numero = String.valueOf(i);
	            int cantidadUno = contarCaracteres(numero, '1');
	            int cantidadDos = contarCaracteres(numero, '2');

	            if (cantidadUno > cantidadDos && cantidadUno > 0 && cantidadDos > 0) {
	                contador++;
	            }
	        }

	        System.out.println("Cantidad de números de 4 cifras con más 1 que 2: " + contador);
	    }

	    private static int contarCaracteres(String cadena, char caracter) {
	        int contador = 0;
	        for (int i = 0; i < cadena.length(); i++) {
	            if (cadena.charAt(i) == caracter) {
	                contador++;
	            }
	        }
	        return contador;
	    }
	}

