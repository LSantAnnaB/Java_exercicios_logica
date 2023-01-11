package OrientacaoObjeto.Polimorfismo.Objeto;


public class Cliente {
    private String nome;
    private int numeroCliente;

    public Cliente(String nome, int numeroCliente) {
        this.nome = nome;
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public void print() {
        System.out.println("nome: " + getNome());
        System.out.println("Numero do cliente" + getNumeroCliente());
    }
}

