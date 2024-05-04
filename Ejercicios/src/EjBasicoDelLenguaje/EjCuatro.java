/*Se poseen 4 atributos:
 a de tipo short
 b de tipo long
 c de tipo float
 d de tipo String
Escriba los pasos necesarios para guardar:
 a en b
 b en c
 c en d
 d en a

*/

package EjBasicoDelLenguaje;

public class EjCuatro {
	public static void main(String[] args) {

		short a = 10;
		long b;
		float c;
		String d;
	
		b = a;
		c = b;
		d = Float.toString(c);
		a = Short.parseShort(d);
	}
}
