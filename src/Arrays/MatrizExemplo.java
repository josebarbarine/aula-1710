package Arrays;

public class MatrizExemplo {
    public static void main(String[] args) {
        String[][] matrizCegonha = new String[2][2];

        matrizCegonha[0][0] = "Picape Amarela";
        matrizCegonha[0][1] = "Picape Vermelha";

        matrizCegonha[1][0] = "Hatch Azul";
        matrizCegonha[1][1] = "Hatch Verde";

        System.out.println("Veículo na primeira posição da parte superior: " + matrizCegonha[1][0]);
        System.out.println("Quantidade de veículos na parte inferior: " + matrizCegonha[0].length);

        System.out.println("\n--- Iteração por índice ---");
        for (int i = 0; i < matrizCegonha.length; i++){
            for (int j = 0; j < matrizCegonha[i].length; j++){
                System.out.print("Linha " + i + ", Coluna" + j + ": " + matrizCegonha[i][j]);
            }
        }

        System.out.println("\n --- Iteração por elemento ---");
        for (String[] vetor : matrizCegonha){
            for (String veiculo : vetor){
                System.out.println("Veículo: " + veiculo);
            }
        }
    }
}
