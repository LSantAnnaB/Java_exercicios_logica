package PrimeiraAula;


import java.util.Scanner;

/*
3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
        int duracao_evento, minutos, segundos;
        float dias, horas;

        System.out.println("Determine o tempo em segundos que dura o evento");
        duracao_evento = receba.nextInt();

        minutos = (duracao_evento/60);
        horas = (duracao_evento/3600);
        dias = (duracao_evento/86400);

        System.out.println("o evento dura " + horas + " horas");
        System.out.println("o evento dura " + minutos + " minutos");
        System.out.println("o evento dura " + dias + " dias");
    }
}
