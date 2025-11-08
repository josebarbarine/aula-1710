package Filas;

import java.util.PriorityQueue;

public class FilaBanco {
    public static void main (String[] args) {
        PriorityQueue<Cliente> clientes = new PriorityQueue<>();

        clientes.add(new Cliente("José", 1));
        clientes.add(new Cliente("Marcos", 1));
        clientes.add(new Cliente("Maria Lucia", 0));
        clientes.add(new Cliente("Estefany", 1));
        clientes.add(new Cliente("Serjão", 0));

        System.out.println("=== Ordem de Atendimento ===");
        while (!clientes.isEmpty()) {
            System.out.println("Atendido: " + clientes.poll());
        }
    }
}
