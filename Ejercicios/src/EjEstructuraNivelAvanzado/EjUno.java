/*
 * Realizar un programa para resolver el siguiente problema: Un granjero, un lobo, una
gallina y un saco de maíz deben cruzar el río. Para ello se dispone de un bote con una
capacidad de dos ocupantes, el hombre (el único que sabe remar) y otro. Si de un lado
del rio se quedan solos el lobo y la gallina, el lobo se come a la gallina. Si en una orilla se
quedan solos la gallina y el maíz, la gallina se come al maíz.
 */
package EjEstructuraNivelAvanzado;

import java.util.ArrayList;
import java.util.List;

public class EjUno {
    
    static class Estado {
        boolean granjero;
        boolean lobo;
        boolean gallina;
        boolean maiz;

        public Estado(boolean granjero, boolean lobo, boolean gallina, boolean maiz) {
            this.granjero = granjero;
            this.lobo = lobo;
            this.gallina = gallina;
            this.maiz = maiz;
        }

        public boolean esValido() {
            if ((lobo && gallina) || (gallina && maiz)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "Granjero: " + granjero + ", Lobo: " + lobo + ", Gallina: " + gallina + ", Maiz: " + maiz;
        }
    }

    static List<Estado> encontrarEstadosValidos() {
        List<Estado> estadosValidos = new ArrayList<>();
        for (boolean granjero : new boolean[]{true, false}) {
            for (boolean lobo : new boolean[]{true, false}) {
                for (boolean gallina : new boolean[]{true, false}) {
                    for (boolean maiz : new boolean[]{true, false}) {
                        Estado estado = new Estado(granjero, lobo, gallina, maiz);
                        if (estado.esValido()) {
                            estadosValidos.add(estado);
                        }
                    }
                }
            }
        }
        return estadosValidos;
    }

    public static void main(String[] args) {
        List<Estado> estadosValidos = encontrarEstadosValidos();

        for (Estado estado : estadosValidos) {
            System.out.println(estado);
        }
    }
}


