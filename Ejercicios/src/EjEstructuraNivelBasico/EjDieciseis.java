/*
 * Crear un programa que dada una hora en formato hh:mm:ss determine e informe cual
será el tiempo dentro de n segundos. La cantidad de segundos debe ser indicada por el
usuario.
 */
package EjEstructuraNivelBasico;

import java.util.Scanner;

public class EjDieciseis {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese la hora en formato hh:mm:ss:");
	        String horaActual = scanner.nextLine();
	        System.out.println("Ingrese la cantidad de segundos a sumar:");
	        int segundos = scanner.nextInt();

	        String[] partes = horaActual.split(":");
	        int horas = Integer.parseInt(partes[0]);
	        int minutos = Integer.parseInt(partes[1]);
	        int segundosActuales = Integer.parseInt(partes[2]);

	        segundosActuales += segundos;
	        minutos += segundosActuales / 60;
	        segundosActuales %= 60;
	        horas += minutos / 60;
	        minutos %= 60;
	        horas %= 24; 

	        System.out.printf("El tiempo dentro de %d segundos será: %02d:%02d:%02d%n", segundos, horas, minutos, segundosActuales);
	    }
	}
