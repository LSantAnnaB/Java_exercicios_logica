package OrientacaoObjeto.Teste;

import OrientacaoObjeto.Objetos.Conta;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta(1500,62134,100.0,"Corrente");
        conta.print();
    }
}
