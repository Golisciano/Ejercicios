/*
 * Crear un programa que calcule e informe la serie: 1/2 + 2/22 + 3/23 + ... + n/2n
 */
package EjEstructuraNivelInicial;

import java.util.Scanner;

public class EjVeinte {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el valor de n:");
	        int n = scanner.nextInt();
	        
	        double suma = 0;
	        for (int i = 1; i <= n; i++) {
	            suma += (double) i / Math.pow(2, i);
	        }
	        
	        System.out.println("La suma de la serie es: " + suma);
	    }
	}

