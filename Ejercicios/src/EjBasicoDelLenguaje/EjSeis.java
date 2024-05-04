/* Indique el valor que tendrá x en cada una de las líneas
1 x = 1;
2
++x;
3
x += x++;
4
--x;*/
package EjBasicoDelLenguaje;

public class EjSeis {

	public static void main(String[] args) {
		int x = 1;
		System.out.println("Valor de x en la línea 1: " + x);
		++x;
		System.out.println("Valor de x en la línea 2: " + x);
		x += x++;
		System.out.println("Valor de x en la línea 3: " + x);
		--x;
		System.out.println("Valor de x en la línea 4: " + x);

	}
}
