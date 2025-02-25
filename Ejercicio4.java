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
public class Ejercicio4 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("================================ SENSOR DE TEMPERATURA ================================");
            
            double temperatura = tomarTemperatura(scanner);
            verificarTemperatura(temperatura);
        }
    }
    
    public static double tomarTemperatura(Scanner scanner) {
        System.out.print(" Atención usuario. Ingrese la temperatura actual en grados celsius (°C): ");
        return scanner.nextDouble();
    }
    
    public static void verificarTemperatura(double temperatura) {
        if (temperatura >= 18 && temperatura <= 25) {
            System.out.println("La temperatura ingresada es adecuada.");
        } else {
            System.out.println(" !Alerta¡: La temperatura ingresada está fuera del rango deseado.");
        }
    }
}
