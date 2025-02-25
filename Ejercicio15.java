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
public class Ejercicio15 {
    public static void main(String[] args) {
        ejecutar();
    }
    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("================================ SIMULADOR DE VIAJE EN COCHE ================================");
            //Bucle while
            while (true) {
                //Crear atributos
                double distancia = tomarDistancia(scanner);
                double velocidad = tomarVelocidad(scanner);
                
                double tiempo = procesarTiempo(distancia, velocidad);
                mostrarResultados(tiempo);
                
                System.out.print("¿Desea realizar otro viaje? (s/n): ");
                String respuesta = scanner.next().toLowerCase();
                if (!respuesta.equals("s")) {
                    break;
                }
            }
            
            System.out.println("Gracias por usar el simulador de viaje en coche.");
        }
    }
    //Crear metodos
    //Tomar datos
    public static double tomarDistancia(Scanner scanner) {
        System.out.print(" Querido usuario. Ingrese la distancia total del viaje en kilometros: ");
        return scanner.nextDouble();
    }
    
    public static double tomarVelocidad(Scanner scanner) {
        System.out.print(" Querido usuario. Ingrese la velocidad promedio del coche en km/h: ");
        return scanner.nextDouble();
    }
    
    //Procesar datos
    public static double procesarTiempo(double distancia, double velocidad) {
        return distancia / velocidad;
    }
    
    //Mostrar resultados
    public static void mostrarResultados(double tiempo) {
        System.out.println("================================");
        System.out.printf(" Querido usuario. El tiempo estimado de viaje: %.2f horas\n", tiempo);
    }
}
