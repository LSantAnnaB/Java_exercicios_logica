package OrientacaoObjeto.Polimorfismo.Teste;

import OrientacaoObjeto.Polimorfismo.Objeto.Cliente;
import OrientacaoObjeto.Polimorfismo.Objeto.PessoaFisica;
import OrientacaoObjeto.Polimorfismo.Objeto.PessoaJuridica;

public class TesteCliente {

    public static void main(String[] args) {


        Cliente empresa = new PessoaJuridica("Padoca", 778,
                "7897894564540001/9", "Ong", "mei", "Pequeno Porte");

        empresa.print();

        System.out.println("--------------------------------");

        Cliente pessoa =new PessoaFisica("Lucas",332,
                "113666536-66","Analista de Sistemas", "Casado");

        pessoa.print();
    }
}
