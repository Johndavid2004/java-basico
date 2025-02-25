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
public class Ejercicio6 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("================================ SIMULADOR DE ASCENSOR ================================");
        
        double temperatura = tomarTemperatura(scanner);
        if (verificarTemperatura(temperatura)) {
            int piso = tomarPiso(scanner);
            moverAscensor(piso);
        } else {
            System.out.println(" El ascensor no se moverá debido a la temperatura inadecuada." );
        }
        
        scanner.close();
    }
    
    public static double tomarTemperatura(Scanner scanner) {
        System.out.print(" Ingrese la temperatura actual en °C: " );
        return scanner.nextDouble();
    }
    
    public static boolean verificarTemperatura(double temperatura) {
        if (temperatura >= 18 && temperatura <= 25) {
            System.out.println(" Temperatura adecuada. El ascensor puede moverse. ");
            return true;
        } else {
            System.out.println(" !ALERTA ROJA¡: Temperatura fuera del rango aceptable. ");
            return false;
        }
    }
    
    public static int tomarPiso(Scanner scanner) {
        System.out.print(" Ingrese el piso al que desea ir (1-10):  ");
        return scanner.nextInt();
    }
    
    public static void moverAscensor(int piso) {
        if (piso >= 1 && piso <= 10) {
            System.out.println(" El ascensor está en movimiento " + piso + "...");
        } else {
            System.out.println(" !ERROR¡: Piso fuera del rango válido.");
        }
    }
}
