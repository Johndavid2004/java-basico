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
public class Ejercicio7 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("================================ TIENDA DE PRODUCTOS ================================");
            
            char tipoProducto = obtenerTipoProducto(scanner);
            int cantidad = obtenerCantidad(scanner);
            double precioBase = obtenerPrecioBase(tipoProducto);
            double costoSinDescuento = calcularCostoSinDescuento(precioBase, cantidad);
            double costoConDescuento = aplicarDescuento(tipoProducto, costoSinDescuento);
            
            mostrarResultados(costoSinDescuento, costoConDescuento);
        }
    }
    
    public static char obtenerTipoProducto(Scanner scanner) {
        char tipo;
        do {
            System.out.print("Ingresa el tipo de producto que quieres comprar (A - Alimentos, V - Vestimenta, E - Electrónicos): ");
            tipo = scanner.next().toUpperCase().charAt(0);
        } while (tipo != 'A' && tipo != 'V' && tipo != 'E');
        return tipo;
    }
    
    public static int obtenerCantidad(Scanner scanner) {
        int cantidad;
        do {
            System.out.print("Ingrese la cantidad de unidades: ");
            cantidad = scanner.nextInt();
        } while (cantidad <= 0);
        return cantidad;
    }
    
    public static double obtenerPrecioBase(char tipo) {
        return switch (tipo) {
            case 'A' -> 10.0;
            case 'V' -> 20.0;
            case 'E' -> 50.0;
            default -> 0.0;
        };
    }
    
    public static double calcularCostoSinDescuento(double precioBase, int cantidad) {
        return precioBase * cantidad;
    }
    
    public static double aplicarDescuento(char tipo, double costo) {
        return switch (tipo) {
            case 'A' -> costo * 0.90;
            case 'V' -> costo * 0.95;
            case 'E' -> costo;
            default -> costo;
        }; // 10% de descuento
        // 5% de descuento
        // No hay descuento
    }
    
    public static void mostrarResultados(double costoSinDescuento, double costoConDescuento) {
        System.out.println("================================");
        System.out.println("Costo sin descuento: $" + costoSinDescuento);
        System.out.println("Costo con descuento: $" + costoConDescuento);
    }
}
