package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicios6 {

    /*
    *   Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
    * */

    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
        double num =0 ;
        double contador=0;
        double soma=0;
        double qntNum=0;
        double media;
        do {
            System.out.println("Determine um valor para ser somado");
            num = receba.nextInt();
            if (num%3==0){
               soma = contador+=num;
               qntNum++;
            }

        }while (num != 0);
        media = (soma / (qntNum - 1));
        System.out.println(soma);
        System.out.println(qntNum);
        System.out.println("A média dos valores é : " + media);
    }

}
