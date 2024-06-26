/*
 * Una empresa posee 8 fábricas y emite una tarjeta por cada orden de trabajo que
recibe, con los siguientes datos:
 Número de fabrica
 Número de orden
Para finalizar el ingreso de orden de trabajos se debe indicar 10 como número de
orden.
El programa debe determinar e informar:
a. Cantidad total de trabajos realizados por cada fábrica
b. Cantidad total de trabajos realizados por todas las fábricas
c. Número de fábrica que realizo la mayor cantidad de trabajos
Para realizar este ejercicio debe definir un atributo entero que servirá para contabilizar
la cantidad de trabajos realizados por cada fábrica, tomando 4 bits del atributo entero
por cada fábrica. Esto quiere decir que una fábrica no podrá poseer más de 15 trabajos
realizados.
Para determinar los puntos se deben utilizar operadores de bit.
 */
package EjEstructuraNivelMedio;

import java.util.Scanner;

public class EjTrece {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int trabajosPorFabrica = 0;

	        int[] trabajosPorFabricaTotal = new int[8];

	        int totalTrabajos = 0;

	        int fabricaMaxTrabajos = -1;

	        int maxTrabajos = 0;

	        while (true) {
	            System.out.println("Ingrese el número de fábrica (de 0 a 7) y el número de orden de trabajo:");
	            int fabrica = scanner.nextInt();
	            int orden = scanner.nextInt();

	            if (orden == 10) {
	                break;
	            }

	            trabajosPorFabrica |= (1 << (fabrica * 4)); 

	            trabajosPorFabricaTotal[fabrica]++;
	            totalTrabajos++;

	            if (trabajosPorFabricaTotal[fabrica] > maxTrabajos) {
	                maxTrabajos = trabajosPorFabricaTotal[fabrica];
	                fabricaMaxTrabajos = fabrica;
	            }
	        }

	        System.out.println("a. Cantidad total de trabajos realizados por cada fábrica:");
	        for (int i = 0; i < 8; i++) {
	            System.out.println("Fábrica " + i + ": " + trabajosPorFabricaTotal[i]);
	        }

	        System.out.println("b. Cantidad total de trabajos realizados por todas las fábricas: " + totalTrabajos);

	        System.out.println("c. Número de fábrica que realizó la mayor cantidad de trabajos: " + fabricaMaxTrabajos);

	        scanner.close();
	    }
	}


