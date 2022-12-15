package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio1 {

    /*
    Faça um programa que receba três inteiros e diga qual deles é o maior.
     */

    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Determine o valor de três números inteiros");
        System.out.println("Primeiro número");
        num1 = receba.nextInt();
        System.out.println("Segundo número");
        num2 = receba.nextInt();
        System.out.println("Terceiro número");
        num3 = receba.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("Esse é o maior número: " + num1);

        } else if (num2>num1 && num2>num3) {
            System.out.println("Esse é o maior número: " + num2);
        }else {
            System.out.println("Esse é o maior número: " + num3);
        }
    }
}
