/*
 * Realizar una calculadora en la cual se deberá ingresar una expresión, se analizará si la
expresión ingresada es válida y se resuelva dicha expresión. Las operaciones de la
calculadora son: Suma, resta, multiplicación, división, potenciación y radicación.
 */
package EjEstructuraNivelAvanzado;

import java.util.Scanner;
import java.util.Stack;

public class EjCuatro {

	    public static double evaluarExpresion(String expresion) {
	        Stack<Double> numeros = new Stack<>();
	        Stack<Character> operadores = new Stack<>();
	        
	        for (int i = 0; i < expresion.length(); i++) {
	            char caracter = expresion.charAt(i);
	            if (Character.isDigit(caracter)) {
	                StringBuilder numero = new StringBuilder();
	                while (i < expresion.length() && (Character.isDigit(expresion.charAt(i)) || expresion.charAt(i) == '.')) {
	                    numero.append(expresion.charAt(i));
	                    i++;
	                }
	                numeros.push(Double.parseDouble(numero.toString()));
	                i--;
	            } else if (caracter == '(') {
	                operadores.push(caracter);
	            } else if (caracter == ')') {
	                while (operadores.peek() != '(') {
	                    double resultado = aplicarOperacion(operadores.pop(), numeros.pop(), numeros.pop());
	                    numeros.push(resultado);
	                }
	                operadores.pop();
	            } else if (esOperador(caracter)) {
	                while (!operadores.isEmpty() && precedencia(operadores.peek()) >= precedencia(caracter)) {
	                    double resultado = aplicarOperacion(operadores.pop(), numeros.pop(), numeros.pop());
	                    numeros.push(resultado);
	                }
	                operadores.push(caracter);
	            }
	        }
	        
	        while (!operadores.isEmpty()) {
	            double resultado = aplicarOperacion(operadores.pop(), numeros.pop(), numeros.pop());
	            numeros.push(resultado);
	        }
	        
	        return numeros.pop();
	    }

	    public static boolean esOperador(char caracter) {
	        return caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/' || caracter == '^' || caracter == '√';
	    }

	    public static int precedencia(char operador) {
	        switch (operador) {
	            case '+':
	            case '-':
	                return 1;
	            case '*':
	            case '/':
	                return 2;
	            case '^':
	            case '√':
	                return 3;
	            default:
	                return -1;
	        }
	    }

	    public static double aplicarOperacion(char operador, double b, double a) {
	        switch (operador) {
	            case '+':
	                return a + b;
	            case '-':
	                return a - b;
	            case '*':
	                return a * b;
	            case '/':
	                if (b == 0) {
	                    throw new ArithmeticException("Error: división por cero");
	                }
	                return a / b;
	            case '^':
	                return Math.pow(a, b);
	            case '√':
	                return Math.pow(a, 1.0 / b);
	            default:
	                return 0;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese una expresión matemática: ");
	        String expresion = scanner.nextLine();
	        try {
	            double resultado = evaluarExpresion(expresion);
	            System.out.println("El resultado es: " + resultado);
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        }
	        scanner.close();
	    }
	}

