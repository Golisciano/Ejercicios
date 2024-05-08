/*
 * Crear un programa que determine e informe si un año es bisiesto. Un año es bisiesto si
es múltiplo de 4, excepto los múltiplos de 100 que no son bisiestos, salvo que a su vez
también sean múltiplos de 400. (1800 no es bisiesto, 2000 si).
 */
package EjEstructuraNivelBasico;

import java.util.Scanner;

public class EjDoce {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el año:");
	        int anio = scanner.nextInt();

	        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
	            System.out.println(anio + " es un año bisiesto.");
	        } else {
	            System.out.println(anio + " no es un año bisiesto.");
	        }
	    }
	}

