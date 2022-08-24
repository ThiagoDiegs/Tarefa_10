package br.com.thiago;

import java.util.Scanner;

/**
 * @author thiago.araujo
 */
public class Nota {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Qual é seu nome? ");
        String nome1 = s.next();
        System.out.println("Prazer " +nome1);
        System.out.println("Vamos Começar? digite 1 para começar ");
        int nome = s.nextInt();

        String nomeBim = getBimestre(nome);
        String nome2 = getNota(nome);
        System.out.println(nome2);


    }
    public  static String getBimestre(int nome){
        Scanner s = new Scanner(System.in);

        System.out.println("Entre com a nota Primeiro Bimestre ");
        double primeiroBimestre = s.nextDouble();
        System.out.println("Entre com a nota Segundo Bimestre ");
        double segundoBimestre = s.nextDouble();
        System.out.println("Entre com a nota Terceiro Bimestre ");
        double terceiroBimestre = s.nextDouble();
        System.out.println("Entre com a nota Quarto Bimestre ");
        double quartoBimestre = s.nextDouble();

        double getBimestre = (primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre )/4;
        System.out.println("Media Final " + getBimestre);
        return "";

    }
    public static  String getNota(int nome){
        if(nome >=7 && nome <=10){
            return "Aprovado";
        } else if (nome >= 5 && nome <= 6) {
            return "Recuperacao";
        }else{
            return "Reprovado";
        }

    }
}
