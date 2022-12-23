package OrientacaoObjeto.Objetos;

public class Paciente {
    private String nome;
    private String doenca;
    private int prontuario;
    private int idade;

    public Paciente(String nome, String doenca, int prontuario, int idade) {
        this.nome = nome;
        this.doenca = doenca;
        this.prontuario = prontuario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void print() {
        System.out.println("Nome :"+ getNome());
        System.out.println("Idade :"+ getIdade());
        System.out.println("Doença :" + getDoenca());
        System.out.println("Prontuário :"+ getProntuario());
    }
}
