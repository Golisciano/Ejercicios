/*
 * Realizar un programa que muestre un menú con las siguientes opciones:
 Ingresar un número entero
 Ingresar un número binario
 Ingresar un número octal
 Ingresar un número hexadecimal
 Ingresar un número romano
 Salir
Una vez ingresada la opción se debe pedir al usuario que ingrese el número según la
opción que haya ingresado, y se debe verificar que el número ingresado sea correcto
dentro del sistema elegido. Luego se debe mostrar otro menú con las siguientes
opciones:
 Convertir a entero
 Convertir a binario
 Convertir a octal
 Convertir a hexadecimal
 Convertir a números romanos
 Atrás
Con excepción del número desde el que se quiere hacer la conversión. Ejemplo: Si se ha
elegido la opción ingresar un número octal, en el segundo menú no debe aparecer la
opción convertir a octal. Una vez elegida la opción deseada se debe informar la
conversión por consola y se debe volver a este menú por si se desea realizar otra
conversión. Si se desea ingresar otro número se debe elegir la opción atrás para que se
vuelva a mostrar el primer menú y si se desea salir del programa se debe elegir la
opción salir.
 */
package EjEstructuraNivelMedio;

import java.util.Scanner;

public class EjOcho {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Menú principal:");
	            System.out.println("1. Ingresar un número entero");
	            System.out.println("2. Ingresar un número binario");
	            System.out.println("3. Ingresar un número octal");
	            System.out.println("4. Ingresar un número hexadecimal");
	            System.out.println("5. Ingresar un número romano");
	            System.out.println("6. Salir");
	            System.out.print("Ingrese su opción: ");
	            int opcionPrincipal = scanner.nextInt();
	            scanner.nextLine(); 
	            
	            switch (opcionPrincipal) {
	                case 1:
	                    ingresarEntero(scanner);
	                    break;
	                case 2:
	                    ingresarBinario(scanner);
	                    break;
	                case 3:
	                    ingresarOctal(scanner);
	                    break;
	                case 4:
	                    ingresarHexadecimal(scanner);
	                    break;
	                case 5:
	                    ingresarRomano(scanner);
	                    break;
	                case 6:
	                    System.out.println("¡Hasta luego!");
	                    return;
	                default:
	                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
	            }
	        }
	    }

	    private static void ingresarEntero(Scanner scanner) {
	        System.out.print("Ingrese un número entero: ");
	        int numero = scanner.nextInt();
	        scanner.nextLine(); 
	        mostrarMenuConversiones(scanner, numero);
	    }

	    private static void ingresarBinario(Scanner scanner) {
	        System.out.print("Ingrese un número binario: ");
	        String numeroBinario = scanner.nextLine();
	        if (esBinarioValido(numeroBinario)) {
	            int numero = Integer.parseInt(numeroBinario, 2);
	            mostrarMenuConversiones(scanner, numero);
	        } else {
	            System.out.println("Número binario inválido.");
	        }
	    }

	    private static void ingresarOctal(Scanner scanner) {
	        System.out.print("Ingrese un número octal: ");
	        String numeroOctal = scanner.nextLine();
	        if (esOctalValido(numeroOctal)) {
	            int numero = Integer.parseInt(numeroOctal, 8);
	            mostrarMenuConversiones(scanner, numero);
	        } else {
	            System.out.println("Número octal inválido.");
	        }
	    }

	    private static void ingresarHexadecimal(Scanner scanner) {
	        System.out.print("Ingrese un número hexadecimal: ");
	        String numeroHexadecimal = scanner.nextLine();
	        if (esHexadecimalValido(numeroHexadecimal)) {
	            int numero = Integer.parseInt(numeroHexadecimal, 16);
	            mostrarMenuConversiones(scanner, numero);
	        } else {
	            System.out.println("Número hexadecimal inválido.");
	        }
	    }

	    private static void ingresarRomano(Scanner scanner) {
	        System.out.print("Ingrese un número romano: ");
	        String numeroRomano = scanner.nextLine();
	        if (esRomanoValido(numeroRomano)) {
	            int numero = convertirRomanoANumero(numeroRomano);
	            mostrarMenuConversiones(scanner, numero);
	        } else {
	            System.out.println("Número romano inválido.");
	        }
	    }

	    private static void mostrarMenuConversiones(Scanner scanner, int numero) {
	        while (true) {
	            System.out.println("\nMenú de conversiones:");
	            System.out.println("1. Convertir a entero");
	            if (!(numero < 0)) {
	                System.out.println("2. Convertir a binario");
	            }
	            if (!(numero < 0 || Integer.toOctalString(numero).length() > 9)) {
	                System.out.println("3. Convertir a octal");
	            }
	            if (!(numero < 0)) {
	                System.out.println("4. Convertir a hexadecimal");
	            }
	            if (!(numero < 1 || numero > 3999)) {
	                System.out.println("5. Convertir a número romano");
	            }
	            System.out.println("6. Atrás");
	            System.out.print("Ingrese su opción: ");
	            int opcionConversion = scanner.nextInt();
	            scanner.nextLine(); 
	            
	            switch (opcionConversion) {
	                case 1:
	                    System.out.println("Número entero: " + numero);
	                    break;
	                case 2:
	                    System.out.println("Número binario: " + Integer.toBinaryString(numero));
	                    break;
	                case 3:
	                    System.out.println("Número octal: " + Integer.toOctalString(numero));
	                    break;
	                case 4:
	                    System.out.println("Número hexadecimal: " + Integer.toHexString(numero));
	                    break;
	                case 5:
	                    System.out.println("Número romano: " + convertirNumeroARomano(numero));
	                    break;
	                case 6:
	                    return;
	                default:
	                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
	            }
	        }
	    }

	    private static boolean esBinarioValido(String numeroBinario) {
	        return numeroBinario.matches("[01]+");
	    }

	    private static boolean esOctalValido(String numeroOctal) {
	        return numeroOctal.matches("[0-7]+");
	    }

	    private static boolean esHexadecimalValido(String numeroHexadecimal) {
	        return numeroHexadecimal.matches("[0-9A-Fa-f]+");
	    }

	    private static boolean esRomanoValido(String numeroRomano) {
	        return numeroRomano.matches("M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})");
	    }

	    private static int convertirRomanoANumero(String numeroRomano) {
	        int numero = 0;
	        int anterior = 0;

	        for (int i = numeroRomano.length() - 1; i >= 0; i--) {
	            char letra = numeroRomano.charAt(i);
	            int valor = valorRomano(letra);

	            if (valor < anterior) {
	                numero -= valor;
	            } else {
	                numero += valor;
	            }
	            anterior = valor;
	        }

	        return numero;
	    }

	    private static String convertirNumeroARomano(int numero) {
	        if (numero < 1 || numero > 3999) {
	            return "Número fuera de rango";
	        }

	        String[] mil = {"", "M", "MM", "MMM"};
	        String[] cien = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	        String[] diez = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	        String[] uno = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

	        return mil[numero / 1000] + cien[(numero % 1000) / 100] + diez[(numero % 100) / 10] + uno[numero % 10];
	    }

	    private static int valorRomano(char letra) {
	        switch (letra) {
	            case 'I':
	                return 1;
	            case 'V':
	                return 5;
	            case 'X':
	                return 10;
	            case 'L':
	                return 50;
	            case 'C':
	                return 100;
	            case 'D':
	                return 500;
	            case 'M':
	                return 1000;
	            default:
	                return 0;
	        }
	    }
	}


