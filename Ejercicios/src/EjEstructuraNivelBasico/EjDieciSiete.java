/*
 * Crear un programa que resuelva cualquier ecuación de segundo grado ax2

-bx = c. Por
tanto, se debe pedir al usuario que introduzca los valores a, b y c, y el programa
indicará las posibles raíces solución.
 */
package EjEstructuraNivelBasico;

import java.util.Scanner;

public class EjDieciSiete {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el valor de a:");
	        double a = scanner.nextDouble();
	        System.out.println("Ingrese el valor de b:");
	        double b = scanner.nextDouble();
	        System.out.println("Ingrese el valor de c:");
	        double c = scanner.nextDouble();

	        double discriminante = b * b - 4 * a * c;
	        if (discriminante > 0) {
	            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
	            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
	            System.out.println("Las raíces son: " + raiz1 + " y " + raiz2);
	        } else if (discriminante == 0) {
	            double raiz = -b / (2 * a);
	            System.out.println("La única raíz es: " + raiz);
	        } else {
	            System.out.println("La ecuación no tiene soluciones reales.");
	        }
	    }
	}


