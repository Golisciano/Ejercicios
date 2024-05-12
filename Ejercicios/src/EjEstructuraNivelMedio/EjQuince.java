/*
 * Crear un programa en el cual se le pida al usuario datos correspondientes a la
aprobación de una materia universitaria. Los datos a ingresar son:
 Cantidad de días que se cursa la materia a la semana, y respecto a eso se debe
calcular cuantas clases se tendrán en un cuatrimestre.
 Por alumno, cantidad de clases presentes.
 Por alumno dos notas correspondientes a dos parciales.
Para no desaprobar una materia se debe contar con un 75% de asistencia y en el caso
de que las notas sean:
 Mayores a 7, el alumno promociona la materia
 Entre 4 y 6, el alumno aprueba la materia pero no la promociona
 Menor a 4, el alumno desaprueba la materia
Informar por cada alumno ingresado si promociona, aprueba o desaprueba la materia,
y la razón. Además mostrar la cantidad y el promedio de alumnos promocionados,
aprobados y desaprobados. En el caso de desaprobación de la materia la cantidad y
promedio de desaprobaciones por notas, y por asistencia, y cantidad y promedio que
desaprobaron la primera prueba, la segunda y las dos.
Finalmente realice con caracteres gráficos de barras correspondientes a los datos que
se deben informar.
 */
package EjEstructuraNivelMedio;

import java.util.Scanner;

public class EjQuince {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese la cantidad de días que se cursa la materia a la semana:");
	        int diasPorSemana = scanner.nextInt();

	        int clasesPorCuatrimestre = diasPorSemana * 15; 
	        System.out.println("Cantidad total de clases en el cuatrimestre: " + clasesPorCuatrimestre);

	        System.out.println("Ingrese la cantidad de alumnos:");
	        int cantidadAlumnos = scanner.nextInt();

	        int promocionados = 0, aprobados = 0, desaprobados = 0;
	        int desaprobadosPrimeraNota = 0, desaprobadosSegundaNota = 0, desaprobadosAmbasNotas = 0;
	        int desaprobadosPorAsistencia = 0;

	        for (int i = 0; i < cantidadAlumnos; i++) {
	            System.out.println("Alumno #" + (i + 1));

	            System.out.println("Ingrese la cantidad de clases presentes:");
	            int clasesPresentes = scanner.nextInt();

	            System.out.println("Ingrese la nota del primer parcial:");
	            double notaParcial1 = scanner.nextDouble();

	            System.out.println("Ingrese la nota del segundo parcial:");
	            double notaParcial2 = scanner.nextDouble();

	            double asistencia = (double) clasesPresentes / clasesPorCuatrimestre * 100;

	            String estado;
	            if (asistencia >= 75) {
	                if (notaParcial1 > 7 && notaParcial2 > 7) {
	                    estado = "Promociona";
	                    promocionados++;
	                } else if (notaParcial1 >= 4 && notaParcial2 >= 4) {
	                    estado = "Aprueba pero no promociona";
	                    aprobados++;
	                } else {
	                    estado = "Desaprueba";
	                    desaprobados++;
	                    if (notaParcial1 < 4) desaprobadosPrimeraNota++;
	                    if (notaParcial2 < 4) desaprobadosSegundaNota++;
	                    if (notaParcial1 < 4 && notaParcial2 < 4) desaprobadosAmbasNotas++;
	                    if (asistencia < 75) desaprobadosPorAsistencia++;
	                }
	            } else {
	                estado = "Desaprueba por asistencia";
	                desaprobados++;
	                desaprobadosPorAsistencia++;
	            }

	            System.out.println("Estado: " + estado);
	            System.out.println();
	        }

	        System.out.println("Resumen:");
	        System.out.println("Promocionados: " + promocionados);
	        System.out.println("Aprobados: " + aprobados);
	        System.out.println("Desaprobados: " + desaprobados);
	        System.out.println("Desaprobados por asistencia: " + desaprobadosPorAsistencia);
	        System.out.println("Desaprobados por notas (primera nota): " + desaprobadosPrimeraNota);
	        System.out.println("Desaprobados por notas (segunda nota): " + desaprobadosSegundaNota);
	        System.out.println("Desaprobados por notas (ambas notas): " + desaprobadosAmbasNotas);

	        System.out.println("Gráfico de barras:");
	        graficarBarras("Promocionados", promocionados);
	        graficarBarras("Aprobados", aprobados);
	        graficarBarras("Desaprobados", desaprobados);

	        scanner.close();
	    }

	    public static void graficarBarras(String etiqueta, int cantidad) {
	        System.out.print(etiqueta + ": ");
	        for (int i = 0; i < cantidad; i++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}

