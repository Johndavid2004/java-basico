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
public class Ejercicio13 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            double costoTotal = 0;
            
            System.out.println(" TIENDA EN LÍNEA ");
            
            while (true) {
                double precio = tomarPrecio(scanner);
                int cantidad = tomarCantidad(scanner);
                costoTotal += procesarCompra(precio, cantidad);
                
                System.out.print("¿Desea agregar otro producto? (s/n): ");
                String respuesta = scanner.next().toLowerCase();
                if (!respuesta.equals("s")) {
                    break;
                }
            }
            
            mostrarResultados(costoTotal);
        }
    }
    
    //Tomar datos
    public static double tomarPrecio(Scanner scanner) {
        System.out.print("Ingrese el precio del producto: ");
        return scanner.nextDouble();
    }
    
    //Tomar cantidad
    public static int tomarCantidad(Scanner scanner) {
        System.out.print("Ingrese la cantidad que desea comprar: ");
        return scanner.nextInt();
    }
    
    //Procesar datos
    public static double procesarCompra(double precio, int cantidad) {
        return precio * cantidad;
    }
    
    //Mostrar resultados
    public static void mostrarResultados(double costoTotal) {
        System.out.println("================================");
        System.out.println("El costo total de su compra es: $" + costoTotal);
        System.out.println("Gracias por comprar en nuestra tienda en línea.");
    }
}
