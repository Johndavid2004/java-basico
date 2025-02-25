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
public class Ejercicio24 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    //Atributos
    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            StringBuilder listaVentas = new StringBuilder();
            double totalVentas = 0;
            int contador = 1;
            String respuesta;
            
            System.out.println(" REGISTRO DE VENTAS ");
            
            do {
                // Tomar datos de la venta
                Object[] datosVenta = tomarDatos(scanner);
                
                // Procesar y acumular datos
                totalVentas = procesarDatos(listaVentas, datosVenta, contador, totalVentas);
                contador++;
                
                // Preguntar si desea registrar otra venta
                System.out.print("¿Desea registrar otra venta? (s/n): ");
                respuesta = scanner.next().toLowerCase();
                scanner.nextLine(); // Limpiar buffer
            } while (respuesta.equals("s"));
            
            // Mostrar resultados
            mostrarResultados(listaVentas, totalVentas);
        }
    }
    
    //Crear metodos
    public static Object[] tomarDatos(Scanner scanner) {
        System.out.print(" Ingresar el nombre del producto vendido: ");
        String producto = scanner.nextLine();

        System.out.print(" Ingresar el precio del producto: ");
        double precio = scanner.nextDouble();

        return new Object[]{producto, precio};
    }

    public static double procesarDatos(StringBuilder listaVentas, Object[] datosVenta, int contador, double totalVentas) {
        String producto = (String) datosVenta[0];
        double precio = (double) datosVenta[1];

        listaVentas.append(contador).append(". Producto: ").append(producto)
                  .append(" - Precio: $").append(String.format("%.2f", precio))
                  .append("\n");

        return totalVentas + precio;
    }

    public static void mostrarResultados(StringBuilder listaVentas, double totalVentas) {
        System.out.println("\n=================================");
        System.out.println("📌 RESUMEN DE VENTAS");
        System.out.println("=================================");
        if (listaVentas.length() > 0) {
            System.out.println(listaVentas);
            System.out.printf("💰 Total de ventas: $%.2f\n", totalVentas);
        } else {
            System.out.println("No se registraron ventas.");
        }
    }
}
