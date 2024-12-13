import management.*;
import utils.ConsoleUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Matrix Reloaded: Salvando la Humanidad");
        System.out.println("Elige una píldora para continuar:");
        System.out.println("1. Píldora Roja: Agentes de la Resistencia");
        System.out.println("2. Píldora Azul: Control de Anomalías");

        int opcion = ConsoleUtils.leerEntero("Selecciona una opción (1 o 2): ");

        if (opcion == 1) {
            // Inicia la gestión de agentes
            AgenteManager agenteManager = new AgenteManager();
            agenteManager.mostrarMenu();  // Llamamos al menú de Agentes
        } else if (opcion == 2) {
            // Inicia la gestión de anomalías (este código puede ser modificado según lo necesites)
            AnomaliaManager anomaliaManager = new AnomaliaManager();
            anomaliaManager.mostrarMenu();  // Llamamos al menú de Anomalías
        } else {
            // Si la opción es inválida
            System.out.println("Opción no válida. Adiós.");
        }
    }
}
