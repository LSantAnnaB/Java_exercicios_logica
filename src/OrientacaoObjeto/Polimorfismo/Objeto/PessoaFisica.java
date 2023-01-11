package OrientacaoObjeto.Polimorfismo.Objeto;

public class PessoaFisica extends Cliente{


    private String cpf;
    private String profissao;
    private String estadoCivil;

    public PessoaFisica(String nome, int numeroCliente) {
        super(nome, numeroCliente);
    }

    public PessoaFisica(String nome, int numeroCliente, String cpf, String profissao, String estadoCivil) {
        super(nome, numeroCliente);
        this.cpf = cpf;
        this.profissao = profissao;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Cpf: " + getCpf());
        System.out.println("Profissão: " + getProfissao());
        System.out.println("Estado Civil: " + getEstadoCivil());
    }
}
