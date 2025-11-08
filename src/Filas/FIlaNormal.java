package Filas;

import java.util.LinkedList;
import java.util.Queue;

public class FIlaNormal {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Marcos");
        fila.add("Lucas");
        fila.add("Mirela");
        fila.add("Alerrando");

        System.out.println("=== Estado Inicial da Fila ===");
        System.out.println(fila);

        System.out.println("\nPróximo Cliente: " + fila.peek());

        System.out.println("Atendido: " + fila.poll());
        System.out.println("Atendido: " + fila.poll());

        fila.add("Felipe");

        System.out.println("\nFila após novos atendimentos: ");
        System.out.println(fila);

        System.out.println("\nPróximo Cliente: " + fila.peek());

    }
}
