/*
 * Si la población actual fuera 7309784505 y el crecimiento poblacional por año fuera
24807909, realice un programa que estipule la población mundial luego de uno, dos,
tres, cuatro y cinco años.
 */
package EjEstructuraArregloExcepcionesNivelBasico;

public class EjSeis {

	    public static void main(String[] args) {
	        long poblacionActual = 7309784505L;
	        long crecimientoAnual = 24807909L;

	        System.out.println("Población actual: " + poblacionActual);
	        for (int i = 1; i <= 5; i++) {
	            poblacionActual += crecimientoAnual;
	            System.out.println("Población después de " + i + " años: " + poblacionActual);
	        }
	    }
	}

