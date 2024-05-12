/*
 * Crear un programa que permita al usuario ingresar las coordenadas “x” e “y” de 10
puntos del plano, cuyos valores serán en punto flotante y deben ser distintos a 0.
Determinar e informar:
 Para cada punto ingresado, las coordenadas y el cuadrante en donde se haya
ubicado.
 En cual o cuales cuadrantes no se encontró ningún punto.
 En que cuadrante se ubica el punto que tiene la máxima distancia al origen de
coordenadas.
 Dibujar mediante caracteres el sistema de coordenadas y los puntos en sus
correspondientes coordenadas, siempre y cuando ninguna coordenada supere
los valores 50 en x tanto como en y. Dibujar en color rojo el punto que tiene la
máxima distancia al origen de coordenadas.
 */
package EjEstructuraNivelMedio;

import java.util.Scanner;

public class EjDoce {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double[][] puntos = new double[10][2];

	        for (int i = 0; i < 10; i++) {
	            System.out.println("Ingrese las coordenadas (x, y) del punto " + (i + 1) + ":");
	            puntos[i][0] = scanner.nextDouble();
	            puntos[i][1] = scanner.nextDouble(); 

	            while (puntos[i][0] == 0 || puntos[i][1] == 0) {
	                System.out.println("Las coordenadas deben ser distintas de 0. Ingrese nuevamente:");
	                puntos[i][0] = scanner.nextDouble();
	                puntos[i][1] = scanner.nextDouble();
	            }
	        }

	        int[] cuadrantes = new int[4];
	        double maxDistancia = 0;
	        int puntoMaxDistancia = -1;
	        for (int i = 0; i < 10; i++) {
	            double x = puntos[i][0];
	            double y = puntos[i][1];

	            int cuadrante = determinarCuadrante(x, y);
	            cuadrantes[cuadrante - 1]++;

	            double distancia = Math.sqrt(x * x + y * y);
	            if (distancia > maxDistancia) {
	                maxDistancia = distancia;
	                puntoMaxDistancia = i;
	            }
	        }

	        System.out.println("Resultados:");
	        for (int i = 0; i < 10; i++) {
	            double x = puntos[i][0];
	            double y = puntos[i][1];
	            System.out.println("Punto " + (i + 1) + ": Coordenadas (" + x + ", " + y + "), Cuadrante: " + determinarCuadrante(x, y));
	        }

	        System.out.print("Cuadrantes sin puntos: ");
	        for (int i = 0; i < 4; i++) {
	            if (cuadrantes[i] == 0) {
	                System.out.print((i + 1) + " ");
	            }
	        }
	        System.out.println();

	        System.out.println("El punto con la máxima distancia al origen está en el cuadrante: " + determinarCuadrante(puntos[puntoMaxDistancia][0], puntos[puntoMaxDistancia][1]));

	        dibujarCoordenadas(puntos, puntoMaxDistancia);

	        scanner.close();
	    }

	    public static int determinarCuadrante(double x, double y) {
	        if (x > 0 && y > 0) {
	            return 1;
	        } else if (x < 0 && y > 0) {
	            return 2;
	        } else if (x < 0 && y < 0) {
	            return 3;
	        } else if (x > 0 && y < 0) {
	            return 4;
	        } else {
	            return -1; 
	        }
	    }

	    public static void dibujarCoordenadas(double[][] puntos, int puntoMaxDistancia) {

	        boolean excedeLimites = false;
	        for (int i = 0; i < 10; i++) {
	            if (Math.abs(puntos[i][0]) > 50 || Math.abs(puntos[i][1]) > 50) {
	                excedeLimites = true;
	                break;
	            }
	        }

	        if (!excedeLimites) {
	            char[][] plano = new char[101][101];

	            for (int i = 0; i < 101; i++) {
	                for (int j = 0; j < 101; j++) {
	                    plano[i][j] = ' ';
	                }
	            }

	            for (int i = 0; i < 101; i++) {
	                plano[i][50] = '-';
	                plano[50][i] = '|';
	            }

	            for (int i = 0; i < 10; i++) {
	                int x = (int) puntos[i][0] + 50;
	                int y = (int) puntos[i][1] + 50;
	                if (i == puntoMaxDistancia) {
	                    plano[y][x] = 'X'; 
	                } else {
	                    plano[y][x] = 'o';
	                }
	            }

	            for (int i = 100; i >= 0; i--) {
	                for (int j = 0; j < 101; j++) {
	                    System.out.print(plano[i][j]);
	                }
	                System.out.println();
	            }
	        } else {
	            System.out.println("Algunas coordenadas exceden los valores límite de dibujo (50 en x y y). No se pudo dibujar el sistema de coordenadas y los puntos.");
	        }
	    }
	}

