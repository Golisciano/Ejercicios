package EjEstructuraNivelAvanzado;

import java.util.ArrayList;
import java.util.List;

public class EjDos {

	    enum Trabajo {
	        DISEÑADORA_DE_MODA,
	        FLORISTA,
	        JARDINERA,
	        DIRECTORA_DE_ORQUESTA
	    }

	    static class CombinacionTrabajos {
	        Trabajo clara;
	        Trabajo luisa;
	        Trabajo maria;
	        Trabajo nelida;

	        public CombinacionTrabajos(Trabajo clara, Trabajo luisa, Trabajo maria, Trabajo nelida) {
	            this.clara = clara;
	            this.luisa = luisa;
	            this.maria = maria;
	            this.nelida = nelida;
	        }

	        @Override
	        public String toString() {
	            return "Clara: " + clara + ", Luisa: " + luisa + ", Maria: " + maria + ", Nelida: " + nelida;
	        }
	    }

	    static List<CombinacionTrabajos> encontrarCombinacionesValidas() {
	        List<CombinacionTrabajos> combinacionesValidas = new ArrayList<>();
	        for (Trabajo clara : Trabajo.values()) {
	            for (Trabajo luisa : Trabajo.values()) {
	                for (Trabajo maria : Trabajo.values()) {
	                    for (Trabajo nelida : Trabajo.values()) {

	                        if (clara != Trabajo.JARDINERA && clara != Trabajo.DIRECTORA_DE_ORQUESTA &&
	                            luisa != Trabajo.JARDINERA && maria != Trabajo.JARDINERA &&
	                            nelida != Trabajo.DIRECTORA_DE_ORQUESTA && nelida != Trabajo.DISEÑADORA_DE_MODA &&
	                            luisa != Trabajo.FLORISTA && (luisa == Trabajo.FLORISTA || luisa != maria) &&
	                            (luisa == Trabajo.FLORISTA || maria != Trabajo.DIRECTORA_DE_ORQUESTA)) {
	                                CombinacionTrabajos combinacion = new CombinacionTrabajos(clara, luisa, maria, nelida);
	                                combinacionesValidas.add(combinacion);
	                        }
	                    }
	                }
	            }
	        }
	        return combinacionesValidas;
	    }

	    public static void main(String[] args) {
	        List<CombinacionTrabajos> combinacionesValidas = encontrarCombinacionesValidas();

	        for (CombinacionTrabajos combinacion : combinacionesValidas) {
	            System.out.println(combinacion);
	        }
	    }
	}

