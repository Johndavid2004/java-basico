/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author USUARIO
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.println("================================ ASCENSOR INTELIGENTE ================================");
            
            double pesoUsuario = tomarPeso(scanner);
            if (validarPeso(pesoUsuario)) {
                int pisoDestino = tomarPiso(scanner);
                if (validarPiso(pisoDestino)) {
                    moverAscensor(pisoDestino);
                } else {
                    System.out.println(" !Error¡: Piso fuera de rango. Intente de nuevo. ");
                }
            } else {
                System.out.println(" !Error¡: El ascensor está sobrecargado. No puede moverse. ");
            }
        }
    }
    
    public static double tomarPeso(java.util.Scanner scanner) {
        System.out.print(" Por favor. Ingrese su peso en kilogramos: ");
        return scanner.nextDouble();
    }
    
    public static boolean validarPeso(double peso) {
        double pesoMaximo = 120.0;
        return peso <= pesoMaximo;
    }
    
    public static int tomarPiso(java.util.Scanner scanner) {
        System.out.print(" Por favor. Ingrese el piso al que desea ir (1 - 20): ");
        return scanner.nextInt();
    }
    
    public static boolean validarPiso(int piso) {
        return piso >= 1 && piso <= 10;
    }
    
    public static void moverAscensor(int pisoDestino) {
        System.out.println(" El ascensor está en movimiento " + pisoDestino + "...");
        System.out.println(" El ascensor ha llegado al piso indicado " + pisoDestino);
    }
}
