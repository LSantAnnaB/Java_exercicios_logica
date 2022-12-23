package OrientacaoObjeto.Objetos;

public class Conta {
    private int agencia;
    private int conta;
    private double saldo;
    private String tipoDeConta;

    public Conta(int agencia, int conta, double saldo, String tipoDeConta) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.tipoDeConta = tipoDeConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public void print() {
        System.out.println("Agencia: " + getAgencia());
        System.out.println("conta : " + getConta());
        System.out.println("Saldo : " + getSaldo());
        System.out.println("Tipo de conta :" + getTipoDeConta());
    }
}
