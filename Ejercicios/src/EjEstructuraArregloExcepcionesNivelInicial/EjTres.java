/*
 Crear un programa que pida al usuario dos números enteros, y que imprima la suma,
producto, diferencia, cociente y resto de los números.
 */
package EjEstructuraArregloExcepcionesNivelInicial;
import java.util.Scanner;

public class EjTres {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el primer número entero: ");
	        int num1 = scanner.nextInt();
	        System.out.println("Ingrese el segundo número entero: ");
	        int num2 = scanner.nextInt();
	        
	        System.out.println("Suma: " + (num1 + num2));
	        System.out.println("Producto: " + (num1 * num2));
	        System.out.println("Diferencia: " + (num1 - num2));
	        if (num2 != 0) {
	            System.out.println("Cociente: " + (num1 / num2));
	            System.out.println("Resto: " + (num1 % num2));
	        } else {
	            System.out.println("El segundo número no puede ser cero para calcular cociente y resto.");
	        }
	    }
	}

