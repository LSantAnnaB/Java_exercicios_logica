package LacosDeRepeticao;

import java.util.Scanner;

public class Exercicios4 {
    /*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/


    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);

        int pessoas = 0, contadorPessoas = 0;
        int sexo, contadorFem = 0, contadorMasc = 0, contadorOutros = 0;
        int temperamento = 0, contadorCalmo = 0, contadorNervoso = 0, contadorAgressivo = 0;
        int idade = 0;
        int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0, contador6 = 0;


        while (pessoas != 150) {

            System.out.println("Determine em ordem sequencial o numero do entrevistado");
            pessoas = receba.nextInt();

            System.out.println("Determine a idade");
            idade = receba.nextInt();

            System.out.println("Determine o sexo (1 = feminino , 2 = masculino , 3 = outros ) ");
            sexo = receba.nextInt();

            System.out.println("Determine o temperamento 1 = calma, 2 = nervosa e 3 = agressiva");
            temperamento=receba.nextInt();

            switch (sexo) {

                case 1:
                    contadorFem++;
                    break;

                case 2:
                    contadorMasc++;
                    break;

                case 3:
                    contadorOutros++;
                    break;

            }

            switch (temperamento) {

                case 1:
                    contadorCalmo++;
                    break;

                case 2:
                    contadorNervoso++;
                    break;

                case 3:
                    contadorAgressivo++;
                    break;

            }

            if (sexo == 1 && temperamento == 2) {
                contador1++;
            } else if (sexo == 2 && temperamento == 3) {
                contador2++;
            } else if (sexo == 3 && temperamento == 1) {
                contador3++;
            }

            if (temperamento == 2 && idade > 40) {
                contador4++;
            } else if (temperamento == 1 && idade < 18) {
                contador5++;
            } else if (temperamento == 1) {
                contador6++;
            }

        }
        System.out.println("o número de pessoas calmas : " + contador6++);
        System.out.println("o número de mulheres nervosas " + contador1++);
        System.out.println("o número de homens agressivos  " + contador2++);
        System.out.println("o número de outros calmos : " + contador3++);
        System.out.println("o número de pessoas nervosas com mais de 40 anos " + contador4++);
        System.out.println("o número de pessoas calmas com menos de 18 anos  " + contador5++);
    }
}
