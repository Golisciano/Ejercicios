/*
 * Crear un programa en el que se ingrese el valor de un préstamo a obtener, el
porcentaje de interés anual de ese préstamo y el valor que desea abonar por mes.
Mediante esos datos calcule e informe cuanto tiempo en años y en meses, se tardará
en pagar el préstamo.
 */
package EjEstructuraArregloExcepcionesNivelBasico;

import java.util.Scanner;

public class EjDiez {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el valor del préstamo:");
	        double prestamo = scanner.nextDouble();
	        System.out.println("Ingrese el porcentaje de interés anual:");
	        double interesAnual = scanner.nextDouble();
	        System.out.println("Ingrese el valor que desea abonar por mes:");
	        double abonoMensual = scanner.nextDouble();

	        double saldo = prestamo;
	        int años = 0;
	        int meses = 0;
	        while (saldo > 0) {
	            double interesMensual = saldo * (interesAnual / 100) / 12;
	            saldo += interesMensual - abonoMensual;
	            meses++;
	            if (meses == 12) {
	                años++;
	                meses = 0;
	            }
	        }

	        System.out.println("Se tardará " + años + " años y " + meses + " meses en pagar el préstamo.");
	    }
	}

