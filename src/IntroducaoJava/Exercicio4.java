package IntroducaoJava;

import java.util.Scanner;

/*
Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
        double nota1,nota2,nota3,soma,media;
        int p1=2,p2=3,p3=5,ponderada;
        System.out.println("lance no sistema as três notas do aluno");
        nota1= receba.nextDouble();
        nota2= receba.nextDouble();
        nota3= receba.nextDouble();

        soma = (nota1+nota2+nota3);
        ponderada = p1+p2+p3;

        media = (soma/ponderada);

        System.out.println("A média do aluno é :  " + media);
    }

}
