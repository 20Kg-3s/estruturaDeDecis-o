package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
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
            salarioajustado = salarioAtual+valordoAumento;
        }else if (salarioAtual >= 700){
            aumentoPercentual = 10;
            valordoAumento = salarioAtual*(aumentoPercentual/100);
            salarioajustado = salarioAtual+valordoAumento;
        }else if (salarioAtual >= 250){
            aumentoPercentual = 15;
            valordoAumento = salarioAtual*(aumentoPercentual/100);
            salarioajustado = salarioAtual+valordoAumento;
        }else if (salarioAtual > 0){
            aumentoPercentual = 20;
            valordoAumento = salarioAtual*(aumentoPercentual/100);
            salarioajustado = salarioAtual+valordoAumento;
        }else if (salarioAtual < 0){
            System.err.println("VALOR INVÁLIDO! DIGITE NOVAMENTE");
            salarioAtual = scanner.nextDouble();
        }
        System.out.println("Salário inicial: R$" +salarioAtual);
        System.out.println("Valor percentual acrescido: " +aumentoPercentual +"%");
        System.out.println("Valor acrescido: R$" +valordoAumento);
        System.out.println("Salário pós aumento: R$" +salarioajustado);
    }
}
