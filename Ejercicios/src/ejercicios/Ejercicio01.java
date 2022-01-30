/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author reroes
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            double calificacion;
            double promedio;
            double suma = 0;
            int numeroCalificaciones = 4;
            for (int i = 0; i < numeroCalificaciones; i++) {
                System.out.println("Ingrese calificación: ");
                calificacion = entrada.nextDouble();
                suma = suma + calificacion;
            }

            promedio = suma / numeroCalificaciones;

            System.out.printf("%.2f\n", promedio);
        } catch (InputMismatchException inputMismatchException) {

            System.out.printf("Existe un error de tipo %s\n",
                    inputMismatchException);
        }
        System.out.println("Fin del programa");
    }
}


