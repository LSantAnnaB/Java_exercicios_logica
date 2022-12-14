package IntroducaoJava;


import java.util.Scanner;
public class Exercicio1 {

    /*
    1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
    dias e mostre-a expressa apenas em dias.

    2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
    expressa em anos, meses e dias.
     */

    public static void main(String[] args) {
        Scanner receba = new Scanner(System.in);
        int idade_ano,idade_meses,idade_dias,data_dia,data_mes,data_ano,dia_nasc,mes_nasc,ano_nasc;

        System.out.println("Digite a data de hoje");
        data_dia = receba.nextInt();
        data_mes = receba.nextInt();
        data_ano = receba.nextInt();

        System.out.println("Digite a data do seu nascimento");
            dia_nasc = receba.nextInt();
            mes_nasc = receba.nextInt();
            ano_nasc = receba.nextInt();

            if (mes_nasc > 12 || data_mes >12 ){
                System.out.println("Não existe mais de doze meses no calendario comum");
            }else {


                idade_ano = (data_ano - ano_nasc);
                idade_meses = ((idade_ano * 12) + (data_mes - mes_nasc));
                idade_dias = ((idade_ano * 365) + ((mes_nasc * 31) + dia_nasc));

                if (dia_nasc > data_dia && mes_nasc >= data_mes){
                    idade_ano = (idade_ano - 1);
                }

                System.out.println("Sua Data de nascimento é :" + dia_nasc + " / " + mes_nasc + " / " + ano_nasc);
                System.out.println("Sua idade em anos é " + idade_ano);
                System.out.println("Sua idade em meses é " + idade_meses);
                System.out.println("Sua idade em dias é " + idade_dias);

            }
    }
}
