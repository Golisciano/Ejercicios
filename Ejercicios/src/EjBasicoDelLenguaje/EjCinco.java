/*Indique el valor de que tendrá x si se tiene que:
1 x = 5;
2
x *= x%2*3+2;
*/
package EjBasicoDelLenguaje;

public class EjCinco {

	public static void main(String[] args) {
		int x = 5;
		x *= x % 2 * 3 + 2;
		System.out.println("El valor de x es: " + x);

	}
}
