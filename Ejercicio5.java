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
public class Ejercicio5 {
     public static void main(String[] args) {
        ejecutar();
    }
    
    public static void ejecutar() {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.println("================================ SENSOR DE TEMPERATURA ================================");
             
             double temperatura = tomarTemperatura(scanner);
             double umbralAlerta = tomarUmbralAlerta(scanner);
             verificarTemperatura(temperatura, umbralAlerta);
         }
    }
    
    public static double tomarTemperatura(Scanner scanner) {
        System.out.print(" Atención usuario. Ingrese la temperatura actual en °C: " );
        return scanner.nextDouble();
    }
    
    public static double tomarUmbralAlerta(Scanner scanner) {
        System.out.print(" Atención usuario. Ingrese el umbral de alerta en °C: " );
        return scanner.nextDouble();
    }
    
    public static void verificarTemperatura(double temperatura, double umbralAlerta) {
        if (temperatura > umbralAlerta) {
            System.out.println(" !ALERTA ROJA¡: La temperatura del ambiente ha superado el umbral de alerta." );
        } else {
            System.out.println(" La temperatura del ambiente es normal.");
        }
    }
}
