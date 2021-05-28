package com.company;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args){
        System.out.println("SALÁRIO BRUTO:");
        System.out.println("Insira o ganho por hora e as horas trabalhadas.");
        Scanner sc = new Scanner(System.in);
        float ganhoPorHora = sc.nextFloat();
        float horasTrabalhadas = sc.nextFloat();

        double salBruto =ganhoPorHora*horasTrabalhadas;
        double percentualIR = 0;
        double valorIR = 0;
        double percentualInss = 10;
        double valorInss;
        double percentualFgts = 11;
        double valorFgts = 0;
        double totalDescontos = 0;
        double salarioLiquido = 0;

        if (salBruto <= 900){
            percentualIR = 0;
        }else if (salBruto <= 1500){
            percentualIR = 5;
        }else if (salBruto <= 2500){
            percentualIR = 10;
        }else if (salBruto > 2500){
            percentualIR = 20;
        }
        valorIR = salBruto*(percentualIR/100);
        valorFgts = salBruto*(percentualFgts/100);
        valorInss = salBruto*(percentualInss/100);
        totalDescontos = valorFgts + valorInss + valorIR;
        salarioLiquido = salBruto - totalDescontos;

        System.out.println("Salário bruto:               R$" +salBruto);
        System.out.println("(-) IR (" +percentualIR+ "%):              R$"+valorIR);
        System.out.println("(-) INSS (" +percentualInss+ "%):            R$"+valorInss);
        System.out.println("(-) FGTS (" +percentualFgts+ "%):            R$"+valorFgts);
        System.out.println("Total de Descontos:          R$"+totalDescontos);
        System.out.println("Salário líquido:             R$"+salarioLiquido);
    }
}
