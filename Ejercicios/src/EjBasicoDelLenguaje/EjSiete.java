/* Indique el valor resultante de cada una de las líneas
1 !(true ^ 10 > 5) & !(!true || !(false ^ false))
2
(10 < 5) && (false) || (false == true) ^ 8.3f >= 8.3f
3
5 < 11 ^ 5 > 15 | 2 == 2 & false ^ !true ^ 10 <= 10
4
!(true && true || false ^ !(4==3) & 3 > 1 ^ !true)
 */
package EjBasicoDelLenguaje;

public class EjSiete {
	public static void main(String[] args) {
		boolean result1 = !(true ^ 10 > 5) & !(!true || !(false ^ false));
		boolean result2 = (10 < 5) && (false) || (false == true) ^ 8.3f >= 8.3f;
		boolean result3 = 5 < 11 ^ 5 > 15 | 2 == 2 & false ^ !true ^ 10 <= 10;
		boolean result4 = !(true && true || false ^ !(4 == 3) & 3 > 1 ^ !true);

		System.out.println("Resultado de la línea 1: " + result1);
		System.out.println("Resultado de la línea 2: " + result2);
		System.out.println("Resultado de la línea 3: " + result3);
		System.out.println("Resultado de la línea 4: " + result4);

	}
}
