package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicios3 {
    /*
    * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
      21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
      idade for =-99.
    * */

    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
        int idade = 0;
        int menor21 = 0;
        int maior50 = 0;
        int outrasIdades = 0;

        while (idade != -99) {
            System.out.println("Determine a idade da pessoa");
            idade = receba.nextInt();
            if (idade < 21) {
                menor21++;
            }else if(idade > 50){
                maior50++;
            }else {
                outrasIdades++;
            }
        }
        System.out.println("Quantidade de pessoas com idade menor que 21 " + menor21++);
        System.out.println("Quantidade de pessoas com idade maior que 50 " + maior50++);
        System.out.println("Quantidade de pessoas com outras idades  " + outrasIdades++);
    }
}
