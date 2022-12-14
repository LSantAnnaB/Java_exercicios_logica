package LacosRepeticao;

import java.util.Scanner;

public class Exercicio4 {

    /*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

    public static void main(String[] args) {

        Scanner receba = new Scanner(System.in);
        int num;
        double raiz,potencia;

        System.out.println("Determine o número");
        num = receba.nextInt();

        if (num%2==0){
         raiz = Math.sqrt(num);
            System.out.println("O número é par e sua raíz quadrada é  " + raiz);

        }else {
            potencia = Math.pow(num,2);
            System.out.println("O número é ímpar e sua potência  é  " + potencia);
        }


    }
}
