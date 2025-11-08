package Filas;

public class Cliente implements Comparable<Cliente> {
    private String nome;
    private Integer prioridade;

    public Cliente(String nome, Integer prioridade){
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Cliente o) {
        return prioridade.compareTo(o.prioridade);
    }

    @Override
    public String toString() {
        return "Cliente{nome=" + nome + ", prioridade=" + prioridade + "}";
    }

}
