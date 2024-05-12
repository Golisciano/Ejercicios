/*
 * Unos grandes almacenes encargan a un fabricante pantalones y camperas deportivas.
El fabricante dispone para la confección de 750 m de tejido de algodón y 1000 m de
tejido de poliéster. Cada pantalón precisa 1 m de algodón y 2 m de poliéster. Para cada
chaqueta se necesitan 1.5 m de algodón y 1 m de poliéster.
El precio del pantalón se fija en $500 y el de la chaqueta en $400.
Realizar un programa que calcule e informa que número de pantalones y chaquetas
debe suministrar el fabricante a los almacenes para que estos consigan un beneficio
máximo.
 */
package EjEstructuraNivelMedio;

public class EjDieciocho {

	    public static void main(String[] args) {

	        int tejidoAlgodonDisponible = 750;
	        int tejidoPoliesterDisponible = 1000; 
	        int tejidoAlgodonPantalon = 1; 
	        int tejidoPoliesterPantalon = 2; 
	        int tejidoAlgodonChaqueta = 1; 
	        int tejidoPoliesterChaqueta = 1; 
	        int precioPantalon = 500; 
	        int precioChaqueta = 400; 

	        int maxPantalones = Math.min(tejidoAlgodonDisponible / tejidoAlgodonPantalon, 
	                                      tejidoPoliesterDisponible / tejidoPoliesterPantalon);
	        int maxChaquetas = Math.min(tejidoAlgodonDisponible / tejidoAlgodonChaqueta, 
	                                     tejidoPoliesterDisponible / tejidoPoliesterChaqueta);

	        int beneficioMaximo = 0;
	        int pantalonesOptimos = 0;
	        int chaquetasOptimas = 0;
	        for (int pantalones = 0; pantalones <= maxPantalones; pantalones++) {
	            for (int chaquetas = 0; chaquetas <= maxChaquetas; chaquetas++) {
	                int beneficio = pantalones * precioPantalon + chaquetas * precioChaqueta;
	                if (beneficio > beneficioMaximo && 
	                    pantalones * tejidoAlgodonPantalon + chaquetas * tejidoAlgodonChaqueta <= tejidoAlgodonDisponible &&
	                    pantalones * tejidoPoliesterPantalon + chaquetas * tejidoPoliesterChaqueta <= tejidoPoliesterDisponible) {
	                    beneficioMaximo = beneficio;
	                    pantalonesOptimos = pantalones;
	                    chaquetasOptimas = chaquetas;
	                }
	            }
	        }

	        System.out.println("Número óptimo de pantalones: " + pantalonesOptimos);
	        System.out.println("Número óptimo de chaquetas: " + chaquetasOptimas);
	        System.out.println("Beneficio máximo: $" + beneficioMaximo);
	    }
	}

