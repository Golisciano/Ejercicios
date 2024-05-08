/*
 * Crear un programa que divida dos números por medio de restas sucesivas e informe el
resultado.
 */
package EjEstructuraNivelInicial;

import java.util.Scanner;

public class EjDiecisiete {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el dividendo:");
	        int dividendo = scanner.nextInt();
	        System.out.println("Ingrese el divisor:");
	        int divisor = scanner.nextInt();
	        
	        if (divisor == 0) {
	            System.out.println("No se puede dividir por cero.");
	        } else {
	            int cociente = dividirPorRestas(dividendo, divisor);
	            System.out.println("El resultado de la división es: " + cociente);
	        }
	    }

	    public static int dividirPorRestas(int dividendo, int divisor) {
	        int cociente = 0;
	        while (dividendo >= divisor) {
	            dividendo -= divisor;
	            cociente++;
	        }
	        return cociente;
	    }
	}
