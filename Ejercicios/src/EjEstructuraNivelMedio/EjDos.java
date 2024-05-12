/*
 * Crear un programa para calcular los salarios semanales de unos empleados a los que se
les paga 180 pesos la hora si éstas no superan las 35 horas. Cada hora por encima de
las 35 se considerará extra y se paga a 240 pesos. La cantidad de horas no puede
superar las 84.
Para calcular e informar el sueldo de un empleado se debe pedir la cantidad de horas
trabajadas por el mismo. Además el programa debe preguntar si se desea calcular otro
salario, si es así el programa se vuelve a repetir.
 */
package EjEstructuraNivelMedio;

import java.util.Scanner;

public class EjDos {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        char opcion;
	        do {
	            System.out.println("Ingrese la cantidad de horas trabajadas:");
	            int horasTrabajadas = scanner.nextInt();

	            if (horasTrabajadas <= 35) {
	                calcularSalario(horasTrabajadas, 180);
	            } else if (horasTrabajadas <= 84) {
	                int salarioBase = 35 * 180;
	                int horasExtras = horasTrabajadas - 35;
	                int salarioTotal = salarioBase + (horasExtras * 240);
	                System.out.println("El salario semanal es: $" + salarioTotal);
	            } else {
	                System.out.println("La cantidad de horas trabajadas no puede superar las 84.");
	            }

	            System.out.println("¿Desea calcular otro salario? (s/n)");
	            opcion = scanner.next().charAt(0);
	        } while (opcion == 's');
	    }

	    public static void calcularSalario(int horasTrabajadas, int salarioHora) {
	        int salario = horasTrabajadas * salarioHora;
	        System.out.println("El salario semanal es: $" + salario);
	    }
	}
