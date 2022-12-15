package LacosDeRepeticao;

import java.util.Scanner;

public class Exercios5 {
    /*
    * Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
        int num =0 ;
        int contador=0;
        do {
            System.out.println("Determine um valor para ser somado");
            num = receba.nextInt();
            contador+=num;
        }while (num != 0);
        System.out.println("A soma dos valores é : " + contador);
    }


}
