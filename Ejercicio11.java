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
public class Ejercicio11 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            double total = 0;
            String opcion;
            
            System.out.println(" MENÚ DEL RESTAURANTE ");
            
            while (true) {
                mostrarMenu();
                System.out.print(" Seleccione un número de opción o 'salir' para terminar: ");
                opcion = scanner.next().toLowerCase();
                
                if (opcion.equals("salir")) {
                    break;
                }
                
                double precio = procesarPedido(opcion);
                if (precio > 0) {
                    System.out.println("Opción seleccionada: " + obtenerNombrePlato(opcion) + " - $" + precio);
                    total += precio;
                }
            }
            
            total = aplicarDescuento(scanner, total);
            
            System.out.println("================================");
            System.out.println("Total a pagar: $" + total);
        }
    }
    
    public static void mostrarMenu() {
        System.out.println("1. Hamburguesa - $8.50");
        System.out.println("2. Pizza - $12.00");
        System.out.println("3. Ensalada - $7.00");
        System.out.println("4. Refresco - $2.50");
        System.out.println("5. Café - $3.00");
    }
    
    public static double procesarPedido(String opcion) {
        switch (opcion) {
            case "1" -> {
                return 8.50;
            }
            case "2" -> {
                return 12.00;
            }
            case "3" -> {
                return 7.00;
            }
            case "4" -> {
                return 2.50;
            }
            case "5" -> {
                return 3.00;
            }
            default -> {
                System.out.println("Opción no válida, intente de nuevo.");
                return 0;
            }
        }
    }
    
    public static String obtenerNombrePlato(String opcion) {
        return switch (opcion) {
            case "1" -> "Hamburguesa";
            case "2" -> "Pizza";
            case "3" -> "Ensalada";
            case "4" -> "Refresco";
            case "5" -> "Café";
            default -> "Desconocido";
        };
    }
    
    public static double aplicarDescuento(Scanner scanner, double total) {
        System.out.print("Seleccione método de pago (efectivo, tarjeta, cheque): ");
        String metodoPago = scanner.next().toLowerCase();
        
        switch (metodoPago) {
            case "efectivo" -> {
                return total * 0.90; // 10% de descuento
            }
            case "tarjeta" -> {
                return total * 0.95; // 5% de descuento
            }
            case "cheque" -> {
                return total; // No hay descuento
            }
            default -> {
                System.out.println("Método de pago no válido, no se aplica descuento.");
                return total;
            }
        }
    }
}
