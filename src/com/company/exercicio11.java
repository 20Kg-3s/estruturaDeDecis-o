package com.company;

import java.util.Scanner;

public class exercicio11 {
    public static void main (String[] args){
        System.out.println("Salário do funcionário:");
        Scanner scanner = new Scanner(System.in);
        double salarioAtual = scanner.nextDouble();
        double salarioajustado = 0;
        double aumentoPercentual = 0;
        double valordoAumento = 0;

        if (salarioAtual >= 1500){
            aumentoPercentual = 5;
            valordoAumento = salarioAtual*(aumentoPercentual/100);
            salarioajustado = salarioAtual=valordoAumento;
        }else if (salarioAtual >= 700){
            aumentoPercentual = 10;

        }


    }
}
