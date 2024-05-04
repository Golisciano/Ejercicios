/*
 * Crear un programa que calcule e informe la suma de la progresión geométrica: 1 + x +
x
2 + ... + xn
.
 */
package EjEstructuraArregloExcepcionesNivelInicial;

import java.util.Scanner;

public class EjDiecinueve {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el valor de x:");
	        double x = scanner.nextDouble();
	        System.out.println("Ingrese el valor de n:");
	        int n = scanner.nextInt();
	        
	        double suma = 0;
	        for (int i = 0; i <= n; i++) {
	            suma += Math.pow(x, i);
	        }
	        
	        System.out.println("La suma de la progresión geométrica es: " + suma);
	    }
	}

