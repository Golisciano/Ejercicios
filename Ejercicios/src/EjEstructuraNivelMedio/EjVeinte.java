/*
 * Una oruga está situada en la base de una rama de un metro de largo. Su objetivo es
llegar al final de la rama. Para ello, durante el día camina una distancia de 1 cm y por la
noche descansa. Y es entonces, durante la noche, que la rama crece 1 metro de forma
uniforme. Es decir, que en el segundo día, la oruga al despertar se encuentra a 2 cm. de
la base pero la rama mide 2 metros. Y así sucesivamente.
Crear un programa que calcule e informe exactamente el número de días que tardaría
la oruga en llegar al final de la rama. Y más importante aún, que el programa sea lo más
óptimo posible.
 */
package EjEstructuraNivelMedio;

public class EjVeinte {

	    public static void main(String[] args) {

	        int longitudRama = 100 * 100;

	        int posicionOruga = 0;

	        int dias = 0;

	        while (posicionOruga < longitudRama) {

	            posicionOruga++;

	            if (posicionOruga % 100 == 0) {
	                longitudRama += 100;
	            }

	            dias++;
	        }

	        System.out.println("La oruga tardará " + dias + " días en llegar al final de la rama.");
	    }
	}
