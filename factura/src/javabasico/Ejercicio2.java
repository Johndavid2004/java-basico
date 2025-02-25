/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pisoActual = 1;
        int pisoMinimo = 1;
        int pisoMaximo = 20;
        
        System.out.println("============================== SIMULADOR DE ASCENSOR ==============================");
        System.out.println(" El ascensor está en el piso: " + pisoActual);
        System.out.print(" Ingrese el piso al que desea ir (" + pisoMinimo + " - " + pisoMaximo + "): ");
        
        int pisoDestino = scanner.nextInt();
        
        if (pisoDestino >= pisoMinimo && pisoDestino <= pisoMaximo) {
            System.out.println(" Piso válido. El ascensor se está moviendo al piso... " + pisoDestino);
            pisoActual = pisoDestino;
            System.out.println(" !Atención¡. El ascensor ha llegado al piso... " + pisoActual);
        } else {
            System.out.println(" !Error¡ Piso inválido. Por favor, ingrese un número entre " + pisoMinimo + " y " + pisoMaximo + ".");
        }
        
        scanner.close();
    }
}
