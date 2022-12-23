package OrientacaoObjeto.Teste;

import OrientacaoObjeto.Objetos.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Joao Da Silva", 001,
                "Contabilidade", 4333.0, "Junior");
        funcionario.print();
    }
}
