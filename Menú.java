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
public class Menú {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("================================");
            System.out.println("        MENÚ PRINCIPAL");
            System.out.println("================================");
            System.out.println("1. Factura");
            System.out.println("2. Simulador de Ascensor");
            System.out.println("3. Sensor de Temperatura");
            System.out.println("4. Verificación de Temperatura y Ascensor");
            System.out.println("5. Compra de Productos con Descuento");
            System.out.println("6. Cálculo de IMC");
            System.out.println("7. Asistente Virtual de Cine");
            System.out.println("8. Clasificación Campeonato Deportivo");
            System.out.println("9. Menú de Restaurante");
            System.out.println("10. Cajero Automático");
            System.out.println("11. Simulación de Tienda Online");
            System.out.println("12. Simulación de Impresora");
            System.out.println("13. Simulación de Viaje en Coche");
            System.out.println("14. Cuenta Regresiva");
            System.out.println("15. Juego de Adivinanza");
            System.out.println("16. Registro de Biblioteca");
            System.out.println("17. Menú de Comidas Rápidas");
            System.out.println("18. Sensor de Temperatura con Bucle");
            System.out.println("19. Registro de Exámenes");
            System.out.println("20. Gestión de Tareas");
            System.out.println("21. Registro de Ventas");
            System.out.println("22. Registro de Vehículos en Parqueadero");
            System.out.println("23. Compras en Tienda Virtual");
            System.out.println("24. Agenda de Contactos");
            System.out.println("25. Suma de Lista de Números");
            System.out.println("26. Registro de Ventas con For");
            System.out.println("27. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    Factura.ejecutar();
                    break;
                case 2:
                    SimuladorAscensor.ejecutar();
                    break;
                case 3:
                    SensorTemperatura.ejecutar();
                    break;
                case 4:
                    VerificacionTemperaturaAscensor.ejecutar();
                    break;
                case 5:
                    CompraProductos.ejecutar();
                    break;
                case 6:
                    CalculoIMC.ejecutar();
                    break;
                case 7:
                    AsistenteCine.ejecutar();
                    break;
                case 8:
                    CampeonatoDeportivo.ejecutar();
                    break;
                case 9:
                    MenuRestaurante.ejecutar();
                    break;
                case 10:
                    CajeroAutomatico.ejecutar();
                    break;
                case 11:
                    TiendaOnline.ejecutar();
                    break;
                case 12:
                    SimulacionImpresora.ejecutar();
                    break;
                case 13:
                    SimuladorViajeCoche.ejecutar();
                    break;
                case 14:
                    CuentaRegresiva.ejecutar();
                    break;
                case 15:
                    JuegoAdivinanza.ejecutar();
                    break;
                case 16:
                    RegistroBiblioteca.ejecutar();
                    break;
                case 17:
                    MenuComidasRapidas.ejecutar();
                    break;
                case 18:
                    SensorTemperaturaBucle.ejecutar();
                    break;
                case 19:
                    RegistroExamenes.ejecutar();
                    break;
                case 20:
                    GestionTareas.ejecutar();
                    break;
                case 21:
                    RegistroVentas.ejecutar();
                    break;
                case 22:
                    RegistroVehiculos.ejecutar();
                    break;
                case 23:
                    ComprasTiendaVirtual.ejecutar();
                    break;
                case 24:
                    AgendaContactos.ejecutar();
                    break;
                case 25:
                    SumaListaNumeros.ejecutar();
                    break;
                case 26:
                    RegistroVentasFor.ejecutar();
                    break;
                case 27:
                    System.out.println("Gracias por usar el programa. Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 27);
        
        scanner.close();
    }

    private static class Factura {

        private static void ejecutar() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public Factura() {
        }
    }
}
