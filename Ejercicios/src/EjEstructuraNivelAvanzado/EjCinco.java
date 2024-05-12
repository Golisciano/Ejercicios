/*
 * Se sabe que el operador << desplaza dos bits hacia la izquierda, por lo que si se realiza
por ejemplo 2<<2 se obtiene como resultado 8. Al hacer 2 << -2 el resultado es
-2147483648, y al hacer 12<<-2 el resultado es 0. ¿Por qué sucede esto?
 */
package EjEstructuraNivelAvanzado;

public class EjCinco {

	    public static void main(String[] args) {
	        int result1 = 2 << 2;
	        int result2 = 2 << -2;
	        int result3 = 12 << -2;

	        System.out.println("Resultado de 2 << 2: " + result1);
	        System.out.println("Resultado de 2 << -2: " + result2);
	        System.out.println("Resultado de 12 << -2: " + result3);
	    }
	}


