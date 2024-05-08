/*
 * Crear un programa que determine e informe el monto a pagar por una llamada
telefónica, teniendo en cuenta lo siguiente: Toda llamada que dure hasta 5 minutos
tiene un costo de 5 pesos. Por cada minuto adicional se cobrará 50 centavos. Se debe
leer el tiempo de la llamada.
 */
package EjEstructuraArregloExcepcionesNivelBasico;

import java.util.Scanner;

public class EjOnce {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese la duración de la llamada en minutos:");
	        int duracion = scanner.nextInt();

	        double costo = 0;
	        if (duracion <= 5) {
	            costo = 5;
	        } else {
	            costo = 5 + (duracion - 5) * 0.5;
	        }

	        System.out.println("El costo de la llamada es: $" + costo);
	    }
	}
