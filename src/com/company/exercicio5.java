package com.company;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        double nota1, nota2, media;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota");
        nota2 = sc.nextInt();
        media = (nota1 + nota2) / 2;

        if (media == 10){
            System.out.println("Aprovado com Distinção!");
        }else if (media < 7){
            System.out.println("Reprovado!");
        }else if (media >= 7){
            System.out.println("Aprovado!");
        }
    }
}
