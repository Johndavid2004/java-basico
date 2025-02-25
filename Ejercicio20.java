/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author USUARIO
 */

//Importar scanner
import java.util.Scanner;
//Crear clase
public class Ejercicio20 {
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            double total = 0;
            String respuesta;
            StringBuilder detallesPedido = new StringBuilder(); // Acumulador de pedidos
            
            System.out.println("=================================");
            System.out.println("      MENÚ DE COMIDAS RÁPIDAS");
            System.out.println("=================================");
            
            do {
                mostrarMenu();
                int opcion = tomarOpcion(scanner);
                double precio = procesarPedido(opcion, detallesPedido);
                if (precio > 0) {
                    total += precio;
                }
                
                System.out.print("¿Desea pedir otra cosa? (s/n): ");
                respuesta = scanner.next().toLowerCase();
            } while (respuesta.equals("s"));
            
            mostrarTotal(detallesPedido, total);
        }
    }

    public static void mostrarMenu() {
        System.out.println("1. Hamburguesa - $5.00");
        System.out.println("2. Papas fritas - $3.00");
        System.out.println("3. Refresco - $2.00");
        System.out.println("4. Helado - $4.00");
        System.out.println("=================================");
    }

    public static int tomarOpcion(Scanner scanner) {
        System.out.print("Seleccione una opción del menú: ");
        return scanner.nextInt();
    }

    public static double procesarPedido(int opcion, StringBuilder detallesPedido) {
        switch (opcion) {
            case 1 -> {
                detallesPedido.append("- Hamburguesa ($5.00)\n");
                return 5.00;
            }
            case 2 -> {
                detallesPedido.append("- Papas fritas ($3.00)\n");
                return 3.00;
            }
            case 3 -> {
                detallesPedido.append("- Refresco ($2.00)\n");
                return 2.00;
            }
            case 4 -> {
                detallesPedido.append("- Helado ($4.00)\n");
                return 4.00;
            }
            default -> {
                System.out.println("❌ Opción inválida. Intente nuevamente.");
                return 0;
            }
        }
    }

    public static void mostrarTotal(StringBuilder detallesPedido, double total) {
        System.out.println("\n=================================");
        System.out.println("      RESUMEN DE PEDIDO");
        System.out.println("=================================");
        System.out.println(detallesPedido); // Muestra los pedidos seleccionados
        System.out.printf("Total a pagar: $%.2f%n", total);
        System.out.println("¡Gracias por su compra! 🎉");
    }
}