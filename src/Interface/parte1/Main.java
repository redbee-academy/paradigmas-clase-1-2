package Interface.parte1;

import Herencia.bien.SeleccionFutbol;

import java.util.ArrayList;

public class Main {
    // ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
    public static ArrayList<SeleccionFutbol2> integrantes = new ArrayList<SeleccionFutbol2>();

    public static void main(String[] args) {

        SeleccionFutbol2 delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
        SeleccionFutbol2 iniesta = new Futbolista2(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol2 raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        // CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol2 integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.concentrarse();
        }

        // VIAJE
        System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol2 integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.viajar();
        }

        // ENTRENAMIENTO
        System.out.println("\nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
        for (SeleccionFutbol2 integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.entrenar();
        }

        // PARTIDO DE FUTBOL
        System.out.println("\nPartido de Fútbol: Todos los integrantes tienen su función en un partido (Especialización)");
        for (SeleccionFutbol2 integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.jugarPartido();
        }

        // PLANIFICAR ENTRENAMIENTO
        System.out.println("\nPlanificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
        System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
        ((Entrenador) delBosque).planificarEntrenamiento();

        // ENTREVISTA
        System.out.println("\nEntrevista: Solo el futbolista tiene el método para dar una entrevista:");
        System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
        ((Futbolista2) iniesta).entrevista();

        // MASAJE
        System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
        System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
        ((Masajista) raulMartinez).darMasaje();

    }
}
