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
public class Ejercicio26 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            StringBuilder carrito = new StringBuilder();
            double totalCompra = 0;
            
            System.out.println("=================================");
            System.out.println("🛒 BIENVENIDO A LA TIENDA VIRTUAL");
            System.out.println("=================================");
            
            // Pedir cantidad de productos
            System.out.print("Ingrese la cantidad de productos que desea comprar: ");
            int cantidadProductos = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            // Bucle for para agregar productos
            for (int i = 1; i <= cantidadProductos; i++) {
                Object[] producto = tomarDatos(scanner, i);
                totalCompra += (double) producto[1];
                procesarDatos(carrito, producto);
            }
            
            // Mostrar resultados
            mostrarResultados(carrito, totalCompra);
        }
    }

    public static Object[] tomarDatos(Scanner scanner, int numProducto) {
        System.out.printf("\nProducto #%d\n", numProducto);
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer

        return new Object[]{nombre, precio};
    }

    public static void procesarDatos(StringBuilder carrito, Object[] producto) {
        String nombre = (String) producto[0];
        double precio = (double) producto[1];

        carrito.append("- ").append(nombre).append(" - $").append(String.format("%.2f", precio)).append("\n");
    }

    public static void mostrarResultados(StringBuilder carrito, double totalCompra) {
        System.out.println("\n=================================");
        System.out.println("🛍️ RESUMEN DE SU COMPRA");
        System.out.println("=================================");
        System.out.println(carrito);
        System.out.printf("💰 Total a pagar: $%.2f\n", totalCompra);
        System.out.println("✅ ¡Gracias por su compra!");
    }
}