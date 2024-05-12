/*
 * Crear un programa que pida al usuario escoger entre dos opciones:
a. Ingresar peso en libras y altura en pulgadas
b. Ingresar peso en kilogramos y altura en metros
Una vez seleccionada la opción, pedir al usuario que ingrese peso y altura, y según esos
datos calcular el índice de masa corporal. Si el índice de masa corporal es menor a 18.5
se debe informar “bajo peso”, si esta entre 18.5 y 24.9 se debe informar “normal”, si
esta entre 25 y 29.9 se debe informar “sobrepeso”, y si es mayor a 30 se debe informar
“obeso”.
Para calcular la masa corporal se debe hacer
 masaCorporal = (pesoEnLibras x 703)/(alturaEnPulgadas x alturaEnPulgadas)
ó
 masaCorporal = pesoEnKilogramos/(alturaEnMetros x alturaEnMetros)

 */
package EjEstructuraNivelMedio;

import java.util.Scanner;

public class EjUno {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Seleccione una opción:");
	        System.out.println("a. Ingresar peso en libras y altura en pulgadas");
	        System.out.println("b. Ingresar peso en kilogramos y altura en metros");
	        char opcion = scanner.next().charAt(0);

	        double peso, altura;
	        if (opcion == 'a') {
	            System.out.println("Ingrese su peso en libras:");
	            peso = scanner.nextDouble();
	            System.out.println("Ingrese su altura en pulgadas:");
	            altura = scanner.nextDouble();
	            double masaCorporal = (peso * 703) / (altura * altura);
	            informarEstado(masaCorporal);
	        } else if (opcion == 'b') {
	            System.out.println("Ingrese su peso en kilogramos:");
	            peso = scanner.nextDouble();
	            System.out.println("Ingrese su altura en metros:");
	            altura = scanner.nextDouble();
	            double masaCorporal = peso / (altura * altura);
	            informarEstado(masaCorporal);
	        } else {
	            System.out.println("Opción no válida.");
	        }
	    }

	    public static void informarEstado(double imc) {
	        if (imc < 18.5) {
	            System.out.println("Su índice de masa corporal es bajo peso.");
	        } else if (imc >= 18.5 && imc <= 24.9) {
	            System.out.println("Su índice de masa corporal es normal.");
	        } else if (imc >= 25 && imc <= 29.9) {
	            System.out.println("Su índice de masa corporal indica sobrepeso.");
	        } else {
	            System.out.println("Su índice de masa corporal indica obesidad.");
	        }
	    }
	}

