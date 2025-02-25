/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        // Definición de variables
        String nombreCliente = "John David Garcia";
        String producto = "Iphone 12 Pro";
        int cantidad = 3;
        double precioUnitario = 12000.0;
        boolean esEstudiante = true;
        char tipoCliente = 'B';
        
        // Operación del subtotal de la compra
        double subtotal = cantidad * precioUnitario;
        
        // Operación del impuesto de la compra
        double tasaImpuesto = esEstudiante ? 0.05 : 0.13;
        double impuesto = subtotal * tasaImpuesto;
        
        // Operación del total de la compra
        double total = subtotal + impuesto;
        
        // Impresión de la factura de compra
        System.out.println("============================== FACTURA DE COMPRA ==============================");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Tipo de Cliente: " + tipoCliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: $" + precioUnitario);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto (" + (tasaImpuesto * 100) + "%): $" + impuesto);
        System.out.println("Total a Pagar: $" + total);
    }
}
