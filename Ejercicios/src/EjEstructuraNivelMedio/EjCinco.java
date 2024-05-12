/*
 * Crear un programa que adivine un número entre 1 y 1000 pensado por el usuario. El
programa debe ir mostrando números y el usuario debe responder a cada número con
un símbolo “>”, “<” o “=”, según el número pensado sea menor, mayor o igual que el
mostrado por la computadora. Cuando se adivine el número se deberá mostrar un
mensaje especificando cuantas preguntas ha necesitado para adivinar el número. No se
debe realizar más de 10 preguntas, y se debe detectar si el usuario está haciendo
trampa respondiendo con imposibles, como por ejemplo, es mayor que 4 y menor que
5.
 */
package EjEstructuraNivelMedio;

import java.util.Scanner;

public class EjCinco {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Piensa en un número entre 1 y 1000.");
	        System.out.println("Presiona 'Enter' cuando estés listo.");
	        scanner.nextLine();

	        int min = 1;
	        int max = 1000;
	        int intentos = 0;
	        boolean adivinado = false;

	        while (!adivinado && intentos < 10) {
	            int guess = (min + max) / 2;
	            System.out.println("¿Es tu número " + guess + "? Responde con '<', '>', o '=':");
	            String respuesta = scanner.nextLine();

	            if (respuesta.equals("<")) {
	                max = guess - 1;
	            } else if (respuesta.equals(">")) {
	                min = guess + 1;
	            } else if (respuesta.equals("=")) {
	                adivinado = true;
	            } else {
	                System.out.println("Respuesta inválida. Por favor, responde con '<', '>', o '='.");
	            }

	            intentos++;
	        }

	        if (adivinado) {
	            System.out.println("¡Tu número ha sido adivinado en " + intentos + " intentos!");
	        } else {
	            System.out.println("¡No he podido adivinar tu número en 10 intentos!");
	        }
	    }
	}

