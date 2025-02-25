/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author USUARIO
 */

//Importar
import java.util.Scanner;
//Crear clase
public class Ejercicio29 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    //Atributos
    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" 🛒 REGISTRO DE VENTAS ");
            
            System.out.print("Ingrese la cantidad de productos a registrar: ");
            int cantidadProductos = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            double totalVentas = procesarVentas(scanner, cantidadProductos);
            
            mostrarResultados(totalVentas);
        }
    }
    
    //Crear metodos
    //Procesar datos
    public static double procesarVentas(Scanner scanner, int cantidadProductos) {
        double total = 0;
        String resumenVentas = "\n📋 Productos Vendidos:\n";

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.println("\nProducto #" + i);
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

            double precio = tomarPrecio(scanner);
            int cantidad = tomarCantidad(scanner);

            double subtotal = precio * cantidad;
            total += subtotal;

            resumenVentas += String.format("- %s | Precio: $%.2f | Cantidad: %d | Subtotal: $%.2f\n",
                    nombre, precio, cantidad, subtotal);
        }

        System.out.println(resumenVentas); // Mostrar lista de productos vendidos
        return total;
    }
    
    //Tomar datos
    public static double tomarPrecio(Scanner scanner) {
        double precio;
        while (true) {
            System.out.print("Ingrese el precio del producto: ");
            if (scanner.hasNextDouble()) {
                precio = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea
                break;
            } else {
                System.out.println("⚠ Error: Ingrese un precio válido.");
                scanner.next(); // Limpiar entrada incorrecta
            }
        }
        return precio;
    }
    
    //Tomar datos
    public static int tomarCantidad(Scanner scanner) {
        int cantidad;
        while (true) {
            System.out.print("Ingrese la cantidad vendida: ");
            if (scanner.hasNextInt()) {
                cantidad = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                break;
            } else {
                System.out.println("⚠ Error: Ingrese una cantidad válida.");
                scanner.next(); // Limpiar entrada incorrecta
            }
        }
        return cantidad;
    }
    
    //Mostrar resultados
    public static void mostrarResultados(double totalVentas) {
        System.out.printf("💰 Total de Ventas: $%.2f\n", totalVentas);
    }
}