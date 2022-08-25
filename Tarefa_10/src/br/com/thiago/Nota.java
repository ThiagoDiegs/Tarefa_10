package br.com.thiago;

import java.util.Scanner;

/**
 * @author thiago.araujo
 */
public class Nota {

    static double mediaBimestre = 0;
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Qual é seu nome? ");
        String nome1 = s.next();
        System.out.println("Prazer " +nome1 + " Vamos Começar? ");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("Sim")) {

            getBimestre();
            getNota();
        }
        System.out.println("Obrigado. ");

    }
    public  static void getBimestre(){
        Scanner s = new Scanner(System.in);

        System.out.println("Entre com a nota Primeiro Bimestre ");
        double primeiroBimestre = s.nextDouble();
        System.out.println("Entre com a nota Segundo Bimestre ");
        double segundoBimestre = s.nextDouble();
        System.out.println("Entre com a nota Terceiro Bimestre ");
        double terceiroBimestre = s.nextDouble();
        System.out.println("Entre com a nota Quarto Bimestre ");
        double quartoBimestre = s.nextDouble();

        mediaBimestre = (primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre )/4;
        System.out.println("Media Final " + mediaBimestre);



    }
    public static void getNota() {

        if (mediaBimestre >= 7 && mediaBimestre <= 10) {
            System.out.println("Aprovado");
        } else if (mediaBimestre >= 5 && mediaBimestre < 7) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }

    }


}
