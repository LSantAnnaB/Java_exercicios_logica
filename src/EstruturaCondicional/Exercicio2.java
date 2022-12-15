package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {

    /*
     *
     *Faça um programa que entre com três números e coloque em ordem crescente.
     * */

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

        if ((num1 > num2 && num1 > num3) && (num2 > num3)) {
            System.out.println("Então a ordem crescente é : " + num1 + " " + num2 + " " + num3);

        } else if ((num2 > num1 && num2 > num3) && (num1 > num3)) {
            System.out.println("Então a ordem crescente é : " + num2 + " " + num1 + " " + num3);

        } else if ((num3 > num2 && num3 > num1) && (num2 > num1)) {
            System.out.println("Então a ordem crescente é : " + num3 + " " + num2 + " " + num1);

        } else if ((num2 > num3 && num2 > num1) && (num3 > num1)){
            System.out.println("Então a ordem crescente é : " + num2 + " " + num3 + " " + num1);

        }else if ((num1 > num2 && num1 > num3) && (num3 > num2)) {
            System.out.println("Então a ordem crescente é : " + num1 + " " + num3 + " " + num2);

        }else {
            System.out.println("Então a ordem crescente é : " + num3 + " " + num1 + " " + num2);
        }
    }
}

