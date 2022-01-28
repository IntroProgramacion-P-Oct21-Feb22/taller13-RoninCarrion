/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calificacion;
        String nombre;
        
        int i = 1;
        while(i<=4){
            System.out.println("Ingrese calificación: \n");
            calificacion = entrada.nextDouble();
            System.out.println("Ingrese nombre: \n");
            nombre = entrada.nextLine();
            System.out.printf("Nombre: %s\n"
                    + "Calificación: %.1f\n", 
                    nombre, calificacion);
            i = i + 1;
        }

        System.out.printf("%s\n", "Gracias por usar el sistema");
    }
}
