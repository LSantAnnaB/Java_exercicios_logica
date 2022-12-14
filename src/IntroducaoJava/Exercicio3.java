package IntroducaoJava;

import java.util.Scanner;

/*

        4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
           calcule a seguinte expressão:
         */
public class Exercicio3 {
    public static void main(String[] args) {

        Scanner receba = new Scanner(System.in);

        double r, a, c, b, s, d;

        System.out.println("digite os valores de a,b e c ");
        a = receba.nextInt();
        b = receba.nextInt();
        c = receba.nextInt();

        if (a < 0 || b < 0 || c < 0) {
            System.out.println(" Os valores devem ser positivos");

        } else {

            r = Math.pow((a + b), 2);
            s = Math.pow((b + c), 2);
            d = (r + s) / 2;
            System.out.println("Valor de r  " + r);
            System.out.println("Valor de s  " + s);
            System.out.println("Valor de d  " + d);

        }
    }

}
