/* Leyendo los códigos correspondientes de la tabla de código ASCII descifre el mensaje
1 String mensaje;
2
char caracter;
3
int encriptado = 79 >> 2;
4
5
encriptado = (~((-160) >> 3) << 2) + 3;
6
caracter = (char) encriptado;
7
mensaje = String.valueOf(caracter);
8
9
encriptado = (((encriptado >> 1 ) ^ 30) << 1) -7;
10 caracter = (char) encriptado;
11 mensaje += String.valueOf(caracter);
 */
package EjBasicoDelLenguaje;

public class EjNueve {

	public static void main(String[] args) {
		String mensaje;
		char caracter;
		int encriptado = 79 >> 2;
		encriptado = (~((-160) >> 3) << 2) + 3;
		caracter = (char) encriptado;
		mensaje = String.valueOf(caracter);
		encriptado = (((encriptado >> 1) ^ 30) << 1) - 7;
		caracter = (char) encriptado;
		mensaje += String.valueOf(caracter);

		System.out.println("El mensaje descifrado es: " + mensaje);

	}
}
