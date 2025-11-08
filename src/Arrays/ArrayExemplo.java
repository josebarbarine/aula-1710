package Arrays;

public class ArrayExemplo {

    public static void main(String[] args){
        Integer[] array = new Integer[6];
        array[0] = 2;
        array[1] = 4;
        array[2] = 10;
        array[3] = 5;
        array[4] = 15;
        array[5] = 3;

        System.out.println("Elemento no indice 3: " + array[3]);

        System.out.println("\n --- Interação por índice ---");
        for (int i = 0; i < array.length; i++){
            System.out.print(" Índice " + i +": " + array[i]);
        }

        System.out.println("\n--- Iteração por elemento ---");
        for (Integer elemento : array){
            System.out.print(" Elemento: " + elemento);
        }
    }
}
