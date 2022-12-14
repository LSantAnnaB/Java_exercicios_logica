package IntroducaoJava;

import java.util.Scanner;

/*
6. Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);

        double x1, y1, x2, y2, P1, P2,distancia;

        System.out.println("escreva os valores dos pontos de coordenadas x e y de P1");
        x1=receba.nextInt();
        x2=receba.nextInt();

        System.out.println("escreva os valores dos pontos de coordenadas x e y de P2");
        y1=receba.nextInt();
        y2=receba.nextInt();

        P1 = Math.pow((x2-x1),2);
        System.out.println(P1);
        P2 = Math.pow((y2-y1),2);
        System.out.println(P1);
        distancia = Math.sqrt((P1 + P2));

        if (P1 +P2 >= 0) {
            System.out.println("O valor da distância entre os pontos P1 e P2 é :" + distancia);
        }else {
            System.out.println("Não há raiz real de número negativo");
        }
    }

}
