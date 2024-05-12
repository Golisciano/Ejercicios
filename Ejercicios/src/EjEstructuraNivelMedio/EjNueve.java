/*
 * Realizar un programa que genere un calendario. Se debe pedir al usuario que ingrese la
fecha actual en formato dd mm aaaa, y mediante este se debe generar el calendario
mostrando todos los días del mes actual. Así mismo debe existir un menú con las
opciones ingresar fecha, mes siguiente, mes anterior y salir.
 */
package EjEstructuraNivelMedio;

import java.util.Scanner;

public class EjNueve {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Variables para almacenar la fecha actual
	        int dia = 0, mes = 0, anio = 0;

	        while (true) {
	            // Mostrar el menú
	            System.out.println("\nMenú:");
	            System.out.println("1. Ingresar fecha");
	            System.out.println("2. Mostrar mes siguiente");
	            System.out.println("3. Mostrar mes anterior");
	            System.out.println("4. Salir");
	            System.out.print("Ingrese su opción: ");

	            int opcion = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (opcion) {
	                case 1:

	                    System.out.println("Ingrese la fecha actual en formato dd mm aaaa:");
	                    System.out.print("Día: ");
	                    dia = scanner.nextInt();
	                    System.out.print("Mes: ");
	                    mes = scanner.nextInt();
	                    System.out.print("Año: ");
	                    anio = scanner.nextInt();
	                    break;
	                case 2:

	                    if (mes == 12) {
	                        mes = 1;
	                        anio++;
	                    } else {
	                        mes++;
	                    }
	                    mostrarCalendario(mes, anio);
	                    break;
	                case 3:

	                    if (mes == 1) {
	                        mes = 12;
	                        anio--;
	                    } else {
	                        mes--;
	                    }
	                    mostrarCalendario(mes, anio);
	                    break;
	                case 4:
	 
	                    System.out.println("¡Hasta luego!");
	                    return;
	                default:
	                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
	            }
	        }
	    }

	    private static void mostrarCalendario(int mes, int anio) {

	        System.out.println("\nCalendario " + obtenerNombreMes(mes) + " " + anio);
	        System.out.println("---------------------------");
	        System.out.println("Dom Lun Mar Mie Jue Vie Sab");

	        int primerDiaSemana = obtenerDiaSemana(1, mes, anio);

	        int numDiasMes = obtenerNumeroDiasMes(mes, anio);

	        for (int i = 0; i < primerDiaSemana; i++) {
	            System.out.print("    ");
	        }

	        for (int dia = 1; dia <= numDiasMes; dia++) {
	            System.out.printf("%3d ", dia);

	            if ((primerDiaSemana + dia) % 7 == 0) {
	                System.out.println();
	            }
	        }
	        System.out.println();
	    }

	    private static String obtenerNombreMes(int mes) {
	        switch (mes) {
	            case 1:
	                return "Enero";
	            case 2:
	                return "Febrero";
	            case 3:
	                return "Marzo";
	            case 4:
	                return "Abril";
	            case 5:
	                return "Mayo";
	            case 6:
	                return "Junio";
	            case 7:
	                return "Julio";
	            case 8:
	                return "Agosto";
	            case 9:
	                return "Septiembre";
	            case 10:
	                return "Octubre";
	            case 11:
	                return "Noviembre";
	            case 12:
	                return "Diciembre";
	            default:
	                return "Mes inválido";
	        }
	    }

	    private static int obtenerNumeroDiasMes(int mes, int anio) {
	        switch (mes) {
	            case 1:
	            case 3:
	            case 5:
	            case 7:
	            case 8:
	            case 10:
	            case 12:
	                return 31;
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	                return 30;
	            case 2:
	                return esBisiesto(anio) ? 29 : 28;
	            default:
	                return -1; 
	        }
	    }

	    private static boolean esBisiesto(int anio) {
	        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
	    }

	    private static int obtenerDiaSemana(int dia, int mes, int anio) {
	        if (mes < 3) {
	            mes += 12;
	            anio--;
	        }
	        int K = anio % 100;
	        int J = anio / 100;
	        int diaSemana = (dia + (13 * (mes + 1)) / 5 + K + (K / 4) + (J / 4) - (2 * J)) % 7;
	        return (diaSemana + 5) % 7;
	    }
	}


