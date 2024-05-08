/*
Crear un programa que determine e informe los primeros n números primos,
comenzando de un número x. Se debe leer x y n.
 */
package EjEstructuraArregloExcepcionesNivelInicial;

import java.util.Scanner;

public class EjTrece {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el número inicial (x):");
	        int x = scanner.nextInt();
	        System.out.println("Ingrese la cantidad de números primos a mostrar (n):");
	        int n = scanner.nextInt();
	        
	        int contador = 0;
	        int numero = x;
	        
	        while (contador < n) {
	            if (esPrimo(numero)) {
	                System.out.println(numero);
	                contador++;
	            }
	            numero++;
	        }
	    }

	    public static boolean esPrimo(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

