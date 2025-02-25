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
public class Ejercicio14 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            int papelDisponible = 100; // Capacidad inicial de papel
            
            System.out.println("================================ SIMULADOR DE IMPRESORA ================================");
            
            while (papelDisponible > 0) {
                int paginas = tomarPaginas(scanner);
                
                if (paginas > papelDisponible) {
                    System.out.println("Error: No hay suficiente papel para imprimir " + paginas + " páginas.");
                } else {
                    papelDisponible = procesarImpresion(papelDisponible, paginas);
                    mostrarResultados(papelDisponible);
                }
                
                System.out.print("¿Desea imprimir más páginas? (s/n): ");
                String respuesta = scanner.next().toLowerCase();
                if (!respuesta.equals("s")) {
                    break;
                }
            }
            
            System.out.println(" Atento. La impresora se ha quedado sin papel.");
        } // Capacidad inicial de papel
    }
    
    //Tomar datos
    public static int tomarPaginas(Scanner scanner) {
        System.out.print("Querido usuario. Ingrese la cantidad de páginas a imprimir: ");
        return scanner.nextInt();
    }
    
    //Procesar datos
    public static int procesarImpresion(int papelDisponible, int paginas) {
        System.out.println("Imprimiendo " + paginas + " páginas...");
        return papelDisponible - paginas;
    }
    
    //Mostrar resultados
    public static void mostrarResultados(int papelDisponible) {
        System.out.println("================================");
        System.out.println(" El papel restante en la impresora es... " + papelDisponible);
    }
}
