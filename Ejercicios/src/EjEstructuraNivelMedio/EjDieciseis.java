/*
 * Crear un programa que lea tres longitudes en centímetros y determine si forman o no
un triángulo. Si forman un triángulo determinar si se trata de un triángulo
 Equilátero (si tiene los tres lados iguales)
 Isósceles (si tiene dos lados iguales)
 Escaleno (si tiene tres lados desiguales)
Para formar un triángulo se requiere que el mayor de los lados sea menor a la suma de
los otros dos lados.
Además calcular e informar los ángulos del triángulo sabiendo que
 sen α = opuesto / hipotenusa
 cos α = adyacente / hipotenusa
 tan α = opuesto / adyacente
Por último informar si el triángulo es
 Acutángulo (tres ángulos agudos)
 Obtusángulo (un ángulo obtuso)
 Rectángulo (un ángulo recto)
 */
package EjEstructuraNivelMedio;

import java.util.Scanner;

public class EjDieciseis {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese la longitud del primer lado del triángulo en centímetros:");
	        double lado1 = scanner.nextDouble();

	        System.out.println("Ingrese la longitud del segundo lado del triángulo en centímetros:");
	        double lado2 = scanner.nextDouble();

	        System.out.println("Ingrese la longitud del tercer lado del triángulo en centímetros:");
	        double lado3 = scanner.nextDouble();

	        if (esTriangulo(lado1, lado2, lado3)) {
	            System.out.println("Las longitudes ingresadas forman un triángulo.");

	            if (esEquilatero(lado1, lado2, lado3)) {
	                System.out.println("Es un triángulo equilátero.");
	            } else if (esIsosceles(lado1, lado2, lado3)) {
	                System.out.println("Es un triángulo isósceles.");
	            } else {
	                System.out.println("Es un triángulo escaleno.");
	            }

	            double[] angulos = calcularAngulos(lado1, lado2, lado3);
	            System.out.println("Ángulo 1: " + angulos[0] + " grados");
	            System.out.println("Ángulo 2: " + angulos[1] + " grados");
	            System.out.println("Ángulo 3: " + angulos[2] + " grados");

	            if (esAcutangulo(angulos)) {
	                System.out.println("Es un triángulo acutángulo.");
	            } else if (esObtusangulo(angulos)) {
	                System.out.println("Es un triángulo obtusángulo.");
	            } else {
	                System.out.println("Es un triángulo rectángulo.");
	            }
	        } else {
	            System.out.println("Las longitudes ingresadas no forman un triángulo.");
	        }

	        scanner.close();
	    }

	    public static boolean esTriangulo(double lado1, double lado2, double lado3) {
	        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
	    }

	    public static boolean esEquilatero(double lado1, double lado2, double lado3) {
	        return lado1 == lado2 && lado2 == lado3;
	    }

	    public static boolean esIsosceles(double lado1, double lado2, double lado3) {
	        return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
	    }

	    public static double[] calcularAngulos(double lado1, double lado2, double lado3) {
	        double[] angulos = new double[3];
	        angulos[0] = Math.toDegrees(Math.acos((lado2 * lado2 + lado3 * lado3 - lado1 * lado1) / (2 * lado2 * lado3)));
	        angulos[1] = Math.toDegrees(Math.acos((lado1 * lado1 + lado3 * lado3 - lado2 * lado2) / (2 * lado1 * lado3)));
	        angulos[2] = Math.toDegrees(Math.acos((lado1 * lado1 + lado2 * lado2 - lado3 * lado3) / (2 * lado1 * lado2)));
	        return angulos;
	    }

	    public static boolean esAcutangulo(double[] angulos) {
	        return angulos[0] < 90 && angulos[1] < 90 && angulos[2] < 90;
	    }

	    public static boolean esObtusangulo(double[] angulos) {
	        return angulos[0] > 90 || angulos[1] > 90 || angulos[2] > 90;
	    }
	}
