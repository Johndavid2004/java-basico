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
public class Ejercicio12 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldo = 1000.0; // Saldo inicial en la cuenta
            
            System.out.println(" CAJERO AUTOMÁTICO ");
            System.out.println("Bienvenido al cajero automático. Puede retirar dinero de su cuenta siempre que tenga saldo disponible.");
            System.out.println("Para salir, ingrese '0' como monto a retirar.");
            
            while (true) {
                double monto = tomarDatos(scanner);
                if (monto == 0) {
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
                    break;
                }
                saldo = procesarDatos(saldo, monto);
                mostrarResultados(saldo);
            }
        }
    }
    
    // Tomar datos
    public static double tomarDatos(Scanner scanner) {
        System.out.print("Ingrese el monto a retirar (o '0' para salir): ");
        return scanner.nextDouble();
    }
    
    //Procesar datos
    public static double procesarDatos(double saldo, double monto) {
        if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes. Intente un monto menor.");
        } else if (monto < 0) {
            System.out.println("Error: No se pueden retirar montos negativos.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso.");
        }
        return saldo;
    }
    
    //Mostrar datos
    public static void mostrarResultados(double saldo) {
        System.out.println("Saldo actual: $" + saldo);
    }
}
