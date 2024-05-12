/*
 * El Miércoles de Ceniza es 46 días antes que el domingo de resurrección. Crear un
programa que dados el día D, el mes M y el año A, calcule e informe la fecha del
miércoles de Ceniza en ese año. Se debe tener en cuenta si el año es o no bisiesto.
 */
package EjEstructuraNivelMedio;

import java.util.Scanner;

public class EjSeis {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese el día:");
	        int dia = scanner.nextInt();
	        System.out.println("Ingrese el mes:");
	        int mes = scanner.nextInt();
	        System.out.println("Ingrese el año:");
	        int año = scanner.nextInt();

	        int diasHastaResurreccion = 46;
	        int miercolesCenizaDia = dia - diasHastaResurreccion;
	        int miercolesCenizaMes = mes;
	        int miercolesCenizaAño = año;

	        if (miercolesCenizaDia <= 0) {
	     
	            miercolesCenizaMes -= 1;
	            if (miercolesCenizaMes == 0) {
	                miercolesCenizaMes = 12; 
	                miercolesCenizaAño -= 1;
	            }
	            miercolesCenizaDia += diasEnMes(miercolesCenizaMes, miercolesCenizaAño);
	        }

	        System.out.println("El Miércoles de Ceniza en " + año + " es el " + miercolesCenizaDia + "/" + miercolesCenizaMes + "/" + miercolesCenizaAño);
	    }

	    public static int diasEnMes(int mes, int año) {
	        switch (mes) {
	            case 1, 3, 5, 7, 8, 10, 12:
	                return 31;
	            case 4, 6, 9, 11:
	                return 30;
	            case 2:
	                return esBisiesto(año) ? 29 : 28;
	            default:
	                return -1; 
	        }
	    }

	    public static boolean esBisiesto(int año) {
	        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
	    }
	}

