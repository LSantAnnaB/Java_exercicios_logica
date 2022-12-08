package PrimeiraAula;

import java.util.Scanner;

/*
O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
 */
public class Exercicios7 {

    public static void main(String[] args) {

        Scanner receba = new Scanner(System.in);


        double valorDistribuidorPorc = (28 / 100), valorImpostosPorc = (45 / 100),
                custoFabrica, custoConsumidor, valorDistribuidor, valorImpostos;

        System.out.println("digite o valor de custo de fábrica");
        custoFabrica= receba.nextDouble();


        valorDistribuidor = (custoFabrica + (custoFabrica * valorDistribuidorPorc));

        valorImpostos = (custoFabrica + (custoFabrica * valorImpostosPorc));

        custoConsumidor = (custoFabrica + valorDistribuidor + valorImpostos);

        System.out.println("O custo ao consumidor é: " + custoConsumidor);

    }
}