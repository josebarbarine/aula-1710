package Conjuntos;

import java.util.HashSet;

public class HashSetExemplo {
    public static void main(String[] args) {
        HashSet<String> inscritos = new HashSet<>();

        inscritos.add("Kobe");
        inscritos.add("Jordan");
        inscritos.add("LeBron");
        inscritos.add("Durant");
        inscritos.add("Magic");
        inscritos.add("Bird");
        inscritos.add("Shaq");

        inscritos.add("Kobe");

        System.out.println("=== Lista de Inscritos ===");
        for (String nome : inscritos) {
            System.out.println(nome);
        }
    }
}
