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
        ejecutar();
    }
    
    public static void ejecutar() {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.println("================================ ASCENSOR SIMULADO ================================");
             
             int pisoDestino = tomarPiso(scanner);
             if (validarPiso(pisoDestino)) {
                 moverAscensor(pisoDestino);
             } else {
                 System.out.println(" !Error¡: Piso fuera de rango. Intente de nuevo.");
             }}
    }
    
    public static int tomarPiso(Scanner scanner) {
        System.out.print(" Por favor. Ingrese el piso al que desea ir (1 - 20): ");
        return scanner.nextInt();
    }
    
    public static boolean validarPiso(int piso) {
        return piso >= 1 && piso <= 10;
    }
    
    public static void moverAscensor(int pisoDestino) {
        System.out.println(" El ascensor está en camino " + pisoDestino + "...");
        System.out.println(" El ascensor ha llegado a su destino " + pisoDestino);
    }
}
