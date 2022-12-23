package OrientacaoObjeto.Objetos;

import lombok.Data;


public class Patinete {
    private String modelo;
    private int qntRodas;
    private int velocidadeMax;


    public Patinete(String modelo, int qntRodas, int velocidadeMax) {
        this.modelo = modelo;
        this.qntRodas = qntRodas;
        this.velocidadeMax = velocidadeMax;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQntRodas() {
        return qntRodas;
    }

    public void setQntRodas(int qntRodas) {
        this.qntRodas = qntRodas;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public void print() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Qauntidade de rodas: " + getQntRodas());
        System.out.println("Velocidade Máxima: " + getVelocidadeMax());
    }
}
