package Conjuntos;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExemplo {
    public static void main(String[] args) {
        Set<String> inscritos = new HashSet<>();

        inscritos.add("Kobe");
        inscritos.add("Jordan");
        inscritos.add("LeBron");
        inscritos.add("Durant");
        inscritos.add("Magic");
        inscritos.add("Bird");
        inscritos.add("Shaq");

        inscritos.add("Kobe");


        System.out.println("=== Inserção rápida com HashSet ===");
        inscritos.forEach(System.out::println);

        Set<String> aprovados = new TreeSet<>(inscritos);

        System.out.println("\n=== Lista Ordenada (TreeSet) ===");
        aprovados.forEach(System.out::println);
    }
}
