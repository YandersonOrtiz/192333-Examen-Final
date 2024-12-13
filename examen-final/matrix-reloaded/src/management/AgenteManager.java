package management;

import entities.Agente;
import utils.ConsoleUtils;

import java.util.ArrayList;

public class AgenteManager {
    private ArrayList<Agente> agentes;

    public AgenteManager() {
        this.agentes = new ArrayList<>();
    }

    public void registrarAgente() {
        int id = ConsoleUtils.leerEntero("Ingrese el ID del agente: ");
        ConsoleUtils.limpiarBuffer(); // Consumir cualquier salto de línea residual

        String nombre = ConsoleUtils.leerTexto("Ingrese el nombre del agente: ");
        String habilidad = ConsoleUtils.leerTexto("Ingrese la habilidad especial del agente: ");

        Agente nuevoAgente = new Agente(id, nombre, habilidad);
        agentes.add(nuevoAgente);
        System.out.println("Agente registrado con éxito.");
    }

    // Método para asignar un equipo a un agente
    public void asignarEquipo() {
        int id = ConsoleUtils.leerEntero("Ingrese el ID del agente al que se le asignará un equipo: ");
        ConsoleUtils.limpiarBuffer(); // Consumir cualquier salto de línea residual

        Agente agente = buscarAgentePorId(id);
        if (agente != null) {
            String equipo = ConsoleUtils.leerTexto("Ingrese el nombre del equipo: ");
            agente.asignarEquipo(equipo);
            System.out.println("Equipo asignado al agente " + agente.getNombre());
        } else {
            System.out.println("No se encontró un agente con ese ID.");
        }
    }

    // Método auxiliar para buscar un agente por ID
    private Agente buscarAgentePorId(int id) {
        for (Agente agente : agentes) {
            if (agente.getId() == id) {
                return agente;
            }
        }
        return null; // Si no se encuentra el agente, devolver null
    }

    public void mostrarAgentes() {
        if (agentes.isEmpty()) {
            System.out.println("No hay agentes registrados.");
            return;
        }
        System.out.println("=== Lista de Agentes ===");
        for (Agente agente : agentes) {
            // Este print usará el toString() de Agente, que incluye el equipo
            System.out.println(agente);
        }
    }

    public void mostrarMenu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== Menú Agentes ===");
            System.out.println("1. Registrar Agente");
            System.out.println("2. Mostrar Agentes");
            System.out.println("3. Asignar Equipo a Agente");
            System.out.println("4. Salir");
            int opcion = ConsoleUtils.leerEntero("Seleccione una opción: ");
            ConsoleUtils.limpiarBuffer(); // Consumir cualquier salto de línea residual

            switch (opcion) {
                case 1 -> registrarAgente();
                case 2 -> mostrarAgentes();
                case 3 -> asignarEquipo();  // Llamar al método de asignar equipo
                case 4 -> continuar = false;
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}
