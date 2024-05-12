/*
 * Se dispone de una máquina expendedora de café que acepta y da vueltos en monedas
de 2 pesos, 1 peso, 50 centavos, 25 centavos, 1 centavos y 5 centavos. Realizar un
programa que dado el precio del café a consumir y la cantidad de dinero entregada por
el consumidor, informe el vuelto a entregar empleando la menor cantidad de monedas
posibles. Debe verificar que el precio del café pueda pagarse con las monedas
expuestas y que el usuario no ingrese monedas demás.
 */
package EjEstructuraNivelMedio;

import java.util.Scanner;

public class EjSiete {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] valoresMonedas = {200, 100, 50, 25, 10, 5};
	        String[] nombresMonedas = {"2 pesos", "1 peso", "50 centavos", "25 centavos", "10 centavos", "5 centavos"};

	        System.out.println("Ingrese el precio del café:");
	        int precioCafe = scanner.nextInt();

	        if (precioCafe <= 0 || precioCafe % 5 != 0) {
	            System.out.println("Precio inválido. El precio debe ser mayor que cero y múltiplo de 5.");
	            return;
	        }

	        System.out.println("Ingrese la cantidad de dinero entregada:");
	        int dineroEntregado = scanner.nextInt();

	        int vuelto = dineroEntregado - precioCafe;

	        if (vuelto < 0) {
	            System.out.println("El dinero entregado no es suficiente.");
	            return;
	        }

	        System.out.println("El vuelto a entregar es:");

	        for (int i = 0; i < valoresMonedas.length; i++) {
	            int cantidadMonedas = vuelto / valoresMonedas[i];
	            vuelto %= valoresMonedas[i];
	            if (cantidadMonedas > 0) {
	                System.out.println(cantidadMonedas + " " + nombresMonedas[i]);
	            }
	        }
	    }
	}


