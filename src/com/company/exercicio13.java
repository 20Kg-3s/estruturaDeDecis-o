package com.company;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args){

        System.out.println("Digite um número para representar o dia da semana:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num > 7) {
            System.err.println("VALOR INVÁLIDO! DIGITE NOVAMENTE");
            num = sc.nextInt();
        }
        switch(num){
            case 1:{
                System.out.println("Domingo");
                break;
            }
            case 2:{
                System.out.println("Segunda");
                break;
            }
            case 3:{
                System.out.println("Terça");
                break;
            }
            case 4:{
                System.out.println("Quarta");
                break;
            }
            case 5:{
                System.out.println("Quinta");
                break;
            }
            case 6:{
                System.out.println("Sexta");
                break;
            }
            case 7:{
                System.out.println("Sábado");
                break;
            }
        }
    }
}
