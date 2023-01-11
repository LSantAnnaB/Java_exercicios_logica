package OrientacaoObjeto.Polimorfismo.Objeto;

public class PessoaJuridica extends Cliente{

    private String cnpj;
    private String tipoPessoaJuridica;
    private String formatoJuridico;
    private String porte;

    public PessoaJuridica(String nome, int numeroCliente) {
        super(nome, numeroCliente);
    }

    public PessoaJuridica(String nome, int numeroCliente, String cnpj, String tipoPessoaJuridica, String formatoJuridico, String porte) {
        super(nome, numeroCliente);
        this.cnpj = cnpj;
        this.tipoPessoaJuridica = tipoPessoaJuridica;
        this.formatoJuridico = formatoJuridico;
        this.porte = porte;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoPessoaJuridica() {
        return tipoPessoaJuridica;
    }

    public void setTipoPessoaJuridica(String tipoPessoaJuridica) {
        this.tipoPessoaJuridica = tipoPessoaJuridica;
    }

    public String getFormatoJuridico() {
        return formatoJuridico;
    }

    public void setFormatoJuridico(String formatoJuridico) {
        this.formatoJuridico = formatoJuridico;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Tipo pessoa jurídica :" + getTipoPessoaJuridica());
        System.out.println("Formato jurídico :" + getFormatoJuridico());
        System.out.println("Porte :"+ getPorte());
    }
}
