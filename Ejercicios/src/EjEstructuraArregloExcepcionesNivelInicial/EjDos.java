/* Crear un programa que pida al usuario nombre y apellido y los muestre por consola.
 */
package EjEstructuraArregloExcepcionesNivelInicial;

import java.util.Scanner;

public class EjDos {

	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese su nombre: ");
	        String nombre = scanner.nextLine();
	        System.out.println("Ingrese su apellido: ");
	        String apellido = scanner.nextLine();
	        System.out.println("Nombre completo: " + nombre + " " + apellido);
	    }
	}

