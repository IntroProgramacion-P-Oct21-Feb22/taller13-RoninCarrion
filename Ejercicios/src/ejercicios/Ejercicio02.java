/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continua;
        double suma = 0;
        int i = 1;
        do {
            try {
                continua = false;
                double calificacion;
                double promedio;
                
                int numeroCalificaciones = 4;
                while (i <= 4) {
                    System.out.println("Ingrese calificación: ");
                    calificacion = entrada.nextDouble();
                    if (calificacion > 10 || calificacion < 0) {
                        throw new Exception("Valor fuera de rango\n");
                    }
                    suma = suma + calificacion;
                    i = i + 1;
                }
                promedio = suma / numeroCalificaciones;

                System.out.printf("El promedio es de: %.2f\n", promedio);
            } catch (InputMismatchException inputMismatchException) {
                System.out.printf("Existe un error de tipo %s\n",
                        inputMismatchException);
                continua = true;
            } catch (Exception e) {
                System.out.printf("Algo va mal. %s\n", e);
                continua = true;
            }
        } while (continua);
    }
}
