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
public class Ejercicio19 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    //crear atributos
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        String respuesta;

        System.out.println("=================================");
        System.out.println("=================================");
        System.out.println("      MENÚ DE COMIDAS RÁPIDAS");
        System.out.println("=================================");
        System.out.println("=================================");
        
        //Bucle do - while
        do {
            mostrarMenu();
            int opcion = tomarOpcion(scanner);
            double precio = procesarPedido(opcion);
            if (precio > 0) {
                total += precio;
            }

            System.out.print("¿Desea pedir otra cosa? (s/n): ");
            respuesta = scanner.next().toLowerCase();
        } while (respuesta.equals("s"));

        mostrarTotal(total);
        scanner.close();
    }
    
    //Crear metodos
    //Mostrar menu
    public static void mostrarMenu() {
        System.out.println("1. Hamburguesa - $5.00");
        System.out.println("2. Papas fritas - $3.00");
        System.out.println("3. Refresco - $2.00");
        System.out.println("4. Helado - $4.00");
        System.out.println("=================================");
    }
    
    //Tomar datos
    public static int tomarOpcion(Scanner scanner) {
        System.out.print(" Escriba una opción del menú: ");
        return scanner.nextInt();
    }
    
    //procesar datos
    public static double procesarPedido(int opcion) {
        switch (opcion) {
            case 1: return 5.00; // Hamburguesa
            case 2: return 3.00; // Papas fritas
            case 3: return 2.00; // Refresco
            case 4: return 4.00; // Helado
            default:
                System.out.println("La opción ingresada es inválida. !Intente nuevamente¡.");
                return 0;
        }
    }
    
    //Mostrar resultados
    public static void mostrarTotal(double total) {
        System.out.println("\n=================================");
        System.out.println("\n=================================");
        System.out.println("      RESUMEN DE PEDIDO");
        System.out.println("=================================");
        System.out.println("\n=================================");
        System.out.printf(" Información. Total a pagar: $%.2f%n", total);
        System.out.println("¡Gracias por su compra!");
    }
}
