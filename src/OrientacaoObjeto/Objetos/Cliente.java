package OrientacaoObjeto.Objetos;

import lombok.Data;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private int numeroCliente;

    public Cliente(String nome, String cpf, int idade, int numeroCliente) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public void print() {
        System.out.println("nome: " + getNome());
        System.out.println("cpf: " + getCpf());
        System.out.println("idade: " + getIdade());
        System.out.println("Numero do cliente" + getNumeroCliente());
    }
}

