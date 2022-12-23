package OrientacaoObjeto.Objetos;

public class Funcionario {
    private String nome;
    private int funcional;
    private String setor;
    private double salario;
    private String senoridade;

    public Funcionario(String nome, int funcional, String setor, double salario, String senoridade) {
        this.nome = nome;
        this.funcional = funcional;
        this.setor = setor;
        this.salario = salario;
        this.senoridade = senoridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFuncional() {
        return funcional;
    }

    public void setFuncional(int funcional) {
        this.funcional = funcional;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSenoridade() {
        return senoridade;
    }

    public void setSenoridade(String senoridade) {
        this.senoridade = senoridade;
    }

    public void print() {
        System.out.println("Nome: " + getNome());
        System.out.println("funional: " + getFuncional());
        System.out.println("salario: " + getSalario());
        System.out.println("Senoridade: "+ getSenoridade());
        System.out.println("Setor: "+ getSetor());
    }
}
