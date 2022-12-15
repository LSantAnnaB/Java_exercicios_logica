package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicios2 {
    /*
     *   Ler 10 números e imprimir quantos são pares e quantos são ímpares.
     * */

    public static void main(String[] args) {
        Scanner recebe = new Scanner(System.in);
        int num;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Determinte o valor do número");
            i = recebe.nextInt();
            if (i % 2 == 0) {
                System.out.println("Esse número é par" );
            } else {
                System.out.println("Esse número é impar" );
            }
        }
    }
}
