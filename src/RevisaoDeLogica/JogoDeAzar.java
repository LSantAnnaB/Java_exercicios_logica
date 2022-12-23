package RevisaoDeLogica;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class JogoDeAzar {

    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);


        int options = 0;
        int saldo = 100;
        int idade;
        int retorno;
        String nome,continuar,resposta2;
        String local,resposta ;


        System.out.println("Bem vindo ao jogo dos números" +
                "\n" +
                "\n Digite seu nome para iniciarmos ");
        nome = receba.next();

        System.out.println("Olá, " + nome + ", a partir de agora você receberá as instruções para jogo !!!");
        System.out.println("Antes de começarmos, por favor, " + nome + ", confirme sua idade");
        idade = receba.nextInt();
        if (idade < 18) {
            System.out.println("Você não possui idade para jogar jogos de azar");
            System.out.println("É necessário ser maior de 18 anos para jogar ");
            retorno =18 - idade;
            System.out.println("Volte daqui a " + retorno + " anos");
            System.exit(0);
        }
        System.out.println("Informe seu país");
        local=receba.next();
        if (local.equals("Brasil") || local.equals("brasil") || local.equals("brazil")
                || local.equals("Brazil")) {
            System.out.println("Você está ciente que jogos de azar não são permitidos no Brasil ?" +
                    "\n Você deseja continuar, " + nome + "?");
            System.out.println("digite sim ou não");
            continuar = receba.next();
            if (continuar.equals("não")|| continuar.equals("nao")) {
                System.out.println("Tudo bem, " + nome + " sempre respeite as leis");
                System.exit(0);
            }else if (continuar.equals("sim")){
                System.out.println("Obrigado pelas informações, " + nome);
            }
        }
        System.out.println("Deseja saber as regras do jogo??");
        System.out.println("Digite sim ou não");
        resposta2= receba.next();
        if (resposta2.equals("sim")){
            System.out.println("" +
                    "" +
                    "                   Regulamento do jogo" +
                    "\n"+
                    "\n O jogador inicia com um saldo de 100 pontos"+
                    "" +
                    "\n Cada vez que a roleta  gira seu valor aumenta ou diminui" +
                    "" +
                    "\n A roleta vai de 1 a 100" +
                    "\n" +
                    "\n                       PONTUAÇÃO" +
                    "\n" +
                    "\n Caso dê igual a 50 : Não ganha nem perde " +
                    "" +
                    "\n Caso dê maior que 50 : Metade do valor da roleta é somado ao saldo" +
                    "" +
                    "\n Caso dê menor que 50 : Valor da roleta é retirado do seu saldo " +
                    "\n " +
                    "\n" +
                    "                     VITÓRIA OU DERROTA");
            System.out.println("\n" +
                    "Você vence se chegar a 200 de saldo");
            System.out.println("" +
                    "Você perde se chegar a 0 de saldo ou se passar de 200");
            System.out.println("" +
                    "Você pode parar a qualquer momento e retirar seu saldo");

            System.out.println("Concorda com as regras e deseja continuar ?");
            System.out.println("Digite sim ou não");

            resposta=receba.next();
            if (resposta.equals( "não") || resposta.equals("nao")){
                System.out.println("Então não podemos continuar! Até a proxima " + nome);
                System.exit(0);

            }
        }

        System.out.println("!!!!  QUE OS JOGOS COMECEM !!!!");

        while (options != 2) {

            System.out.println("" +
                    "\n Escolha a opção desejada" +
                    "" +
                    "\n 1:  Para ver saldo " +
                    "" +
                    "\n 2:  Parar de jogar  " +
                    "" +
                    "\n 3:  Girar a roleta" +
                    "" +
                    "\n " +
                    "" +
                    "\n Digite sua opção !! ");
            options = receba.nextInt();

            switch (options) {
                case 1:

                    System.out.println(" Seu saldo atual é  : " + saldo + "" +
                            "\n");
                    break;
                case 2:

                    System.out.println(" Obrigado por participar" +
                            "\n Seu saldo atual é  : " + saldo);
                    break;
                case 3:

                    Random random = new Random();
                    int dice = random.nextInt(99) + 1;
                    if (dice > 50) {

                        saldo = saldo + (dice / 2);
                        System.out.println("Número sorteado da roleta: "+ dice);

                    } else if (dice < 50) {

                        saldo = (saldo - dice);
                        System.out.println("Número sorteado da roleta: "+ dice);

                    }
                    break;
                default:
                    System.out.println("insira uma opção válida");
            }

            if (saldo == 200) {
                System.out.println("PARABÉNS VOCÊ VENCEU !!!!! :) ");
                System.out.println("Saldo atual " + saldo);
                System.exit(0);
            }
            if (saldo <= 0) {
                System.out.println(" VOCÊ PERDEU !!!!! :( ");
                System.out.println("Saldo atual " + saldo);
                System.exit(0);
            }

            if (saldo > 200) {
                System.out.println(" VOCÊ PERDEU ESTOROU O LIMITE !!!!! :( ");
                System.out.println("Número da roleta " + saldo);
                System.exit(0);
            }


        }

    }
}
