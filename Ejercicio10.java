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
public class Ejercicio10 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;
        String resultado;
        
        System.out.println("================================ SISTEMA DE CLASIFICACIÓN DE CAMPEONATO ================================");
        
        while (true) {
            resultado = obtenerResultado(scanner);
            
            if (resultado.equals("salir")) {
                mostrarClasificacionFinal(puntos);
                scanner.close();
                return;
            }
            
            puntos = actualizarPuntos(resultado, puntos);
            mostrarPuntosActuales(puntos);
        }
    }
    
    public static String obtenerResultado(Scanner scanner) {
        String resultado;
        do {
            System.out.print("Ingrese el resultado del partido (ganado, perdido, empatado) o 'salir' para terminar: ");
            resultado = scanner.next().toLowerCase();
        } while (!resultado.equals("ganado") && !resultado.equals("perdido") && !resultado.equals("empatado") && !resultado.equals("salir"));
        return resultado;
    }
    
    public static int actualizarPuntos(String resultado, int puntos) {
        return switch (resultado) {
            case "ganado" -> puntos + 3;
            case "empatado" -> puntos + 1;
            default -> puntos;
        };
    }
    
    public static void mostrarPuntosActuales(int puntos) {
        System.out.println("Puntos totales acumulados: " + puntos);
    }
    
    public static void mostrarClasificacionFinal(int puntos) {
        System.out.println("================================");
        System.out.println("Clasificación final: " + puntos + " puntos.");
    }
}
