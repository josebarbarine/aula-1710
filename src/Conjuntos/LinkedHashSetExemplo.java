package Conjuntos;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExemplo {
    public static void main(String[] args){
        Set<String> inscritos = new LinkedHashSet<>();

        inscritos.add("Kobe");
        inscritos.add("Jordan");
        inscritos.add("LeBron");
        inscritos.add("Durant");
        inscritos.add("Magic");
        inscritos.add("Bird");
        inscritos.add("Shaq");

        inscritos.add("Kobe");


        System.out.println("=== Lista de Inscritos ===");
        inscritos.forEach(System.out::println);

    }

}
