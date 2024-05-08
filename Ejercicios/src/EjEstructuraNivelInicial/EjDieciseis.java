/*
Crear un programa que multiplique dos números por medio de sumas sucesivas e
informe el resultado.
 */
package EjEstructuraNivelInicial;

import java.util.Scanner;

public class EjDieciseis {

  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese el primer número:");
	        int num1 = scanner.nextInt();
	        System.out.println("Ingrese el segundo número:");
	        int num2 = scanner.nextInt();
	        
	        int resultado = multiplicarPorSumas(num1, num2);
	        System.out.println("El resultado de la multiplicación es: " + resultado);
	    }

	    public static int multiplicarPorSumas(int a, int b) {
	        int resultado = 0;
	        for (int i = 0; i < b; i++) {
	            resultado += a;
	        }
	        return resultado;
	    }
	}
