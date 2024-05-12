/*
 * Crear un programa que dado un número entre 0,0001 y 0,9999 (y de no más de 4 cifras
decimales), obtenga y muestre la correspondiente fracción irreducible.
Por ejemplo, el número 0,25 se puede obtener a partir de 25/100, o de 2/8, o de 1/4,
entre otros. La fracción irreducible es 1/4, que está formada por un numerador y un
denominador que son primos entre sí.
 */
package EjEstructuraNivelMedio;

import java.util.Scanner;

public class EjDiecisiete {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese un número entre 0.0001 y 0.9999 (no más de 4 cifras decimales):");
	        double numero = scanner.nextDouble();

	        String fraccion = convertirAFraccionIrreducible(numero);

	        if (fraccion != null) {
	            System.out.println("La fracción irreducible correspondiente es: " + fraccion);
	        } else {
	            System.out.println("El número ingresado está fuera del rango especificado.");
	        }

	        scanner.close();
	    }

	    public static String convertirAFraccionIrreducible(double numero) {

	        if (numero < 0.0001 || numero > 0.9999) {
	            return null;
	        }

	        int numerador = (int) (numero * 10000);
	        int denominador = 10000;

	        int mcd = mcd(numerador, denominador);

	        numerador /= mcd;
	        denominador /= mcd;

	        return numerador + "/" + denominador;
	    }

	    public static int mcd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
	}

