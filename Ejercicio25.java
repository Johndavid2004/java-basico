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
public class Ejercicio25 {
    public static void main(String[] args) {
        ejecutar();
    }
    
    //Crear atributos
    public static void ejecutar() {
        try (Scanner scanner = new Scanner(System.in)) {
            StringBuilder listaVehiculos = new StringBuilder();
            
            System.out.println("=================================");
            System.out.println("🚗 REGISTRO DE VEHÍCULOS");
            System.out.println("=================================");
            
            // Solicitar cantidad de vehículos
            System.out.print("Ingrese el número de vehículos a registrar: ");
            int cantidadVehiculos = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            // Bucle FOR para registrar vehículos
            for (int i = 1; i <= cantidadVehiculos; i++) {
                System.out.println("\n📌 Registro del vehículo #" + i);
                Object[] datosVehiculo = tomarDatos(scanner);
                procesarDatos(listaVehiculos, datosVehiculo, i);
            }
            
            // Mostrar resultados
            mostrarResultados(listaVehiculos);
        }
    }
    
    //Crear metodos
    public static Object[] tomarDatos(Scanner scanner) {
        System.out.print(" Ingresar la placa del vehículo: ");
        String placa = scanner.nextLine();

        System.out.print(" Ingresar la hora de ingreso (HH:MM): ");
        String horaIngreso = scanner.nextLine();

        return new Object[]{placa, horaIngreso};
    }

    public static void procesarDatos(StringBuilder listaVehiculos, Object[] datosVehiculo, int numero) {
        String placa = (String) datosVehiculo[0];
        String horaIngreso = (String) datosVehiculo[1];

        listaVehiculos.append(numero).append(". Placa: ").append(placa)
                      .append(" - Hora de ingreso: ").append(horaIngreso)
                      .append("\n");
    }

    public static void mostrarResultados(StringBuilder listaVehiculos) {
        System.out.println("\n=================================");
        System.out.println("📌 RESUMEN DE VEHÍCULOS REGISTRADOS");
        System.out.println("=================================");
        if (listaVehiculos.length() > 0) {
            System.out.println(listaVehiculos);
        } else {
            System.out.println("No se registraron vehículos.");
        }
    }
}