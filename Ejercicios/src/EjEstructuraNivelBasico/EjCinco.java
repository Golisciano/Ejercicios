/*
 * Crear un programa que escriba los primeros 20 números de la sucesión de Fibonacci
sabiendo que x1 = 1, x2 = 1 y xn = xn – 1 + xn – 2 para n > 2.
 */
package EjEstructuraNivelBasico;

public class EjCinco {

	    public static void main(String[] args) {
	        int n = 20; 
	        int fib1 = 1;
	        int fib2 = 1;

	        System.out.println("Los primeros " + n + " números de la sucesión de Fibonacci son:");
	        System.out.print(fib1 + " " + fib2 + " ");

	        for (int i = 3; i <= n; i++) {
	            int fib = fib1 + fib2;
	            System.out.print(fib + " ");
	            fib1 = fib2;
	            fib2 = fib;
	        }
	    }
	}

