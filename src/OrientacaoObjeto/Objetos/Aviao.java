package OrientacaoObjeto.Objetos;

public class Aviao {
    private  String modelo;
    private  int capacidadeMaxPassageiros;
    private  int velocidadeMax;

    public Aviao(String modelo, int capacidadeMaxPassageiros, int velocidadeMax) {
        this.modelo = modelo;
        this.capacidadeMaxPassageiros = capacidadeMaxPassageiros;
        this.velocidadeMax = velocidadeMax;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeMaxPassageiros() {
        return capacidadeMaxPassageiros;
    }

    public void setCapacidadeMaxPassageiros(int capacidadeMaxPassageiros) {
        this.capacidadeMaxPassageiros = capacidadeMaxPassageiros;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public void print(){
        System.out.println("Modelo: "+ getModelo());
        System.out.println("Capacidade de passageiros"+ getCapacidadeMaxPassageiros());
        System.out.println("Velocidade Máxima:" + getVelocidadeMax());
    }
}
