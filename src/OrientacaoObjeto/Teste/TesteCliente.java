package OrientacaoObjeto.Teste;

import OrientacaoObjeto.Objetos.Cliente;

public class TesteCliente {
    public static void main(String[] args) {


        Cliente cliente = new Cliente("Agnaldo jr", "113.666.543-42", 24, 0013);
        cliente.print();
    }
}