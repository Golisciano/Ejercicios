/*
 * Realizar un programa para resolver el siguiente problema: El Sr. Ido, el químico, tiene
seis frascos llenos de líquidos coloreados. Hay uno de cada color: rojo, anaranjado,
amarillo, verde, azul y violeta. El señor Ido sabe que algunos de esos líquidos son
tóxicos, pero no recuerda cuales...
Sin embargo, sí recuerda algunos datos. En cada uno de los siguientes pares de frascos
hay uno con veneno y otro no:
a) los frascos violeta y azul
b) los frascos rojo y amarillo
c) los frascos azul y anaranjado
El Sr. Ido recuerda también que en estos otros pares de frascos hay uno sin veneno:
d) el violeta y el amarillo
e) el rojo y el anaranjado
f) el verde y el azul
¡Ah! Casi lo olvido, añade el Sr. Ido, el líquido del frasco rojo no es venenoso. ¿Qué
frascos tienen veneno?
 */
package EjEstructuraNivelAvanzado;

import java.util.ArrayList;
import java.util.List;

public class EjTres {

	    enum Color {
	        ROJO,
	        ANARANJADO,
	        AMARILLO,
	        VERDE,
	        AZUL,
	        VIOLETA
	    }

	    static List<Color> encontrarFrascosVeneno() {
	        List<Color> frascosVeneno = new ArrayList<>();

	        for (Color violetaAzul : new Color[] {Color.VIOLETA, Color.AZUL}) {
	            for (Color rojoAmarillo : new Color[] {Color.ROJO, Color.AMARILLO}) {
	                for (Color azulAnaranjado : new Color[] {Color.AZUL, Color.ANARANJADO}) {
	                    for (Color violetaAmarillo : new Color[] {Color.VIOLETA, Color.AMARILLO}) {
	                        for (Color rojoAnaranjado : new Color[] {Color.ROJO, Color.ANARANJADO}) {
	                            for (Color verdeAzul : new Color[] {Color.VERDE, Color.AZUL}) {
	  
	                                if ((violetaAzul == Color.VIOLETA || violetaAzul == Color.AZUL) &&
	                                    (rojoAmarillo == Color.ROJO || rojoAmarillo == Color.AMARILLO) &&
	                                    (azulAnaranjado == Color.AZUL || azulAnaranjado == Color.ANARANJADO) &&
	                                    (violetaAmarillo == Color.VIOLETA || violetaAmarillo == Color.AMARILLO) &&
	                                    (rojoAnaranjado == Color.ROJO || rojoAnaranjado == Color.ANARANJADO) &&
	                                    (verdeAzul == Color.VERDE || verdeAzul == Color.AZUL) &&
	                                    (rojoAmarillo == Color.ROJO)) {

	                                        frascosVeneno.add(violetaAzul);
	                                        frascosVeneno.add(rojoAmarillo);
	                                        frascosVeneno.add(azulAnaranjado);
	                                        frascosVeneno.add(violetaAmarillo);
	                                        frascosVeneno.add(rojoAnaranjado);
	                                        frascosVeneno.add(verdeAzul);
	                                        return frascosVeneno;
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	        }
	        return frascosVeneno;
	    }

	    public static void main(String[] args) {
	        List<Color> frascosVeneno = encontrarFrascosVeneno();

	        System.out.println("Los frascos con veneno son:");
	        for (Color frasco : frascosVeneno) {
	            System.out.println(frasco);
	        }
	    }
	}

