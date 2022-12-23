package OrientacaoObjeto.Teste;

import OrientacaoObjeto.Objetos.Paciente;
import OrientacaoObjeto.Objetos.Patinete;

public class TestePaciente {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Lucas","Gripe",1123,22);
        paciente.print();
    }
}
