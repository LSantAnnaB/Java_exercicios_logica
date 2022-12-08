package PrimeiraAula;

import java.util.Scanner;

/*
Um sistema de equações lineares do tipo:

, pode ser resolvido segundo mostrado abaixo :
 */
public class Exercicio6 {

    public static void main(String[] args) {

        Scanner receba = new Scanner(System.in);

        double e, a, c, b, f, d,x,y,denominador;

        System.out.println("Determine os valores de a,b,c,d,e,f");
        a= receba.nextInt();
        b= receba.nextInt();
        c= receba.nextInt();
        d= receba.nextInt();
        e= receba.nextInt();
        f= receba.nextInt();
        denominador = (a*e - b*d);

        if (denominador>0) {
            x = (c * e - b * f) / denominador;
            y = (a * f - c * d) / denominador;

            System.out.println("O valor de x é : " + x);

            System.out.println("O valor de y é : " + y);

        }else {
            System.out.println("denominador deve ser diferente de zero");
        }

    }
}