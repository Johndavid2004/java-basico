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
public class Ejercicio21 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    //Crear atributos
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        double temperatura;

        System.out.println("=================================");
        System.out.println("=================================");
        System.out.println("        SENSOR DE TEMPERATURA");
        System.out.println("=================================");
        System.out.println("=================================");
        
        //Bucle do - while
        do {
            temperatura = tomarTemperatura(scanner);
            if (!esTemperaturaAceptable(temperatura)) {
                System.out.println("⚠ ALERTA: la temperatura ingresada está fuera del rango permitido (18°C - 25°C). Intente de nuevo.");
            }
        } while (!esTemperaturaAceptable(temperatura));

        mostrarResultado(temperatura);
        scanner.close();
    }
    
    //Crear metodos
    //Tomar datos
    public static double tomarTemperatura(Scanner scanner) {
        System.out.print(" Escriba la temperatura actual en °C: ");
        return scanner.nextDouble();
    }
    
    //procesar datos
    public static boolean esTemperaturaAceptable(double temperatura) {
        return temperatura >= 18 && temperatura <= 25;
    }
    
    //Mostrar resultados
    public static void mostrarResultado(double temperatura) {
        System.out.println("✅ La temperatura es adecuada: " + temperatura + "°C");
        System.out.println("✅ Sistema estable. Temperatura dentro del rango permitido.");
    }
}
