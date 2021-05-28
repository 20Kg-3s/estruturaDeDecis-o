package com.company;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[2];

        System.out.println("Digite as notas dos dois semestres:");
        notas[0] = sc.nextDouble();
        notas[1] = sc.nextDouble();

        double media = (notas[0]+notas[1])/ notas.length;
        System.out.println("Média alcançada: "+media);
        if (media <=10 && media >=9){
            System.out.println("Conceito alcançado: A");
            System.out.println("Aprovado!");
        }else if (media >=7.5){
            System.out.println("Conceito alcaçado: B");
            System.out.println("Aprovado!");
        }else if (media >=6){
            System.out.println("Conceito alcaçado: C");
            System.out.println("Aprovado!");
        }else if(media >= 4){
            System.out.println("Conceito alcaçado: D");
            System.out.println("Reprovado!");
        }else if (media <=4 && media >=0){
            System.out.println("Conceito alcaçado: E");
            System.out.println("Reprovado!");
        }else{
            System.out.println("Valor Inválido");
        }

    }
}
