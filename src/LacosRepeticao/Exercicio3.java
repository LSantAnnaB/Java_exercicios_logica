package LacosRepeticao;

import java.util.Scanner;

/*
    * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
    * */
public class Exercicio3 {
    public static void main(String[] args) {

        Scanner receba = new Scanner(System.in);
        int idade;

        System.out.println("Determine a idade da pessoa");
        idade = receba.nextInt();

        if (idade<10){
            System.out.println("Não é permitidio menores de 10 anos se cadastrarem no sistema");

        } else if (idade > 25) {
            System.out.println("Não é permitidio maiores de 25 anos se cadastrarem no sistema");

        } else if (idade >= 10 && idade <= 14 ){
            System.out.println("Categoria intantil");

        }else if (idade >= 15 && idade <= 17 ){
            System.out.println("Categoria juvenil");
        }else {
            System.out.println("Categoria Adulto");
        }
    }
}