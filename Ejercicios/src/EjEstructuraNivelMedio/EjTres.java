/*
 * Crear un programa que muestre un menú con las opciones:
 Sumatoria
 Factorial
 Logaritmo natural
 Salir
Según la opción elegida, a excepción de la opción salir, se debe pedir un número y con
el mismo se debe realizar la sumatoria, el factorial o el logaritmo natural del mismo.
Una vez hecho el cálculo se debe volver al menú y volver a pedir que se ingrese una
opción hasta que la misma sea salir.
 */
package EjEstructuraNivelMedio;

import java.util.Scanner;

public class EjTres {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        char opcion;
	        
	        do {
	            System.out.println("Menú de opciones:");
	            System.out.println("a. Sumatoria");
	            System.out.println("b. Factorial");
	            System.out.println("c. Logaritmo natural");
	            System.out.println("d. Salir");
	            System.out.println("Seleccione una opción:");
	            opcion = scanner.next().charAt(0);
	            
	            switch (opcion) {
	                case 'a':
	                    System.out.println("Ingrese un número:");
	                    int numSuma = scanner.nextInt();
	                    int suma = sumatoria(numSuma);
	                    System.out.println("La sumatoria de " + numSuma + " es: " + suma);
	                    break;
	                case 'b':
	                    System.out.println("Ingrese un número:");
	                    int numFactorial = scanner.nextInt();
	                    long factorial = calcularFactorial(numFactorial);
	                    System.out.println("El factorial de " + numFactorial + " es: " + factorial);
	                    break;
	                case 'c':
	                    System.out.println("Ingrese un número:");
	                    double numLog = scanner.nextDouble();
	                    double logaritmo = calcularLogaritmo(numLog);
	                    System.out.println("El logaritmo natural de " + numLog + " es: " + logaritmo);
	                    break;
	                case 'd':
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	            }
	        } while (opcion != 'd');
	    }
	    
	    public static int sumatoria(int n) {
	        int suma = 0;
	        for (int i = 1; i <= n; i++) {
	            suma += i;
	        }
	        return suma;
	    }
	    
	    public static long calcularFactorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        return n * calcularFactorial(n - 1);
	    }
	    
	    public static double calcularLogaritmo(double n) {
	        return Math.log(n);
	    }
	}

