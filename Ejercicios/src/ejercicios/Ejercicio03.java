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
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double calificacion;
        String nombre;
        String[] nombres = {"Mario", "Luis", "Ana", "Carolina", "Pedro"};
        boolean continua;
        int i = 1;
        do {
            try {
                continua = false;
                while (i <= 4) {
                    System.out.println("Ingrese calificación[0-10]: ");
                    calificacion = entrada.nextDouble();
                    if (calificacion > 10 || calificacion < 0) {
                        throw new Exception("Valor no reconocido en el rango "
                                + "especificado\n");
                    }
                    entrada.nextLine();
                    System.out.println("Ingrese nombre de el/la estudiante: ");
                    nombre = entrada.nextLine();
                    for (int j = 0; j < nombres.length; j++) {
                        if (nombres[j].equals(nombre)) {
                            throw new Exception("Nombre no aceptado, "
                                    + "intenta nuevamente por favor\n");
                        }
                    }
                    System.out.printf("Nombre: %s\n"
                            + "Calificación: %.1f\n",
                            nombre, calificacion);
                    i = i + 1;
                }
                System.out.printf("%s\n", "Gracias por usar el sistema");

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
