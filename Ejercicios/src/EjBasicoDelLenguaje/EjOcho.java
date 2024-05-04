/*
 Indique el valor resultante de cada una de las líneas

1 int i = 43;
2
int mascara = 32;
3
int bit = i & mascara;
4
bit >>= 5;
5
mascara ^= 1;
6
bit |= i & mascara;
7
bit <<= 1;
8
mascara &= (~bit) >>> 3;
9
bit += (~(~0)<<1);
10 mascara += bit + i;
 */
package EjBasicoDelLenguaje;

public class EjOcho {
	public static void main(String[] args) {
		int i = 43;
		int mascara = 32;
		int bit = i & mascara;
		bit >>= 5;
		mascara ^= 1;
		bit |= i & mascara;
		bit <<= 1;
		mascara &= (~bit) >>> 3;
		bit += (~(~0) << 1);
		mascara += bit + i;

		System.out.println("El valor de bit es: " + bit);
		System.out.println("El valor de mascara es: " + mascara);

	}
	
}
