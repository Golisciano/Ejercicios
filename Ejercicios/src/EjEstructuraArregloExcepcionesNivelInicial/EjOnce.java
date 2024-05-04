/*
 Crear un programa que calcule e informe el valor de n para el cual la siguiente suma
excede a un valor x: 1 + 2 + 3 + 4 + ... + n. Por ejemplo para un x = 20, el número que
excede es n = 6, ya que 1 + 2 + 3 + 4 + 5 + 6 = 21.
 */
package EjEstructuraArregloExcepcionesNivelInicial;

import java.util.Scanner;

public class EjOnce {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el valor de x:");
	        int x = scanner.nextInt();
	        
	        int suma = 0;
	        int n = 0;
	        
	        while (suma <= x) {
	            n++;
	            suma += n;
	        }
	        
	        System.out.println("El número que excede a " + x + " es: " + n);
	    }
	}

