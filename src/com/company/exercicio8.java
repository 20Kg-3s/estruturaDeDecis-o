package com.company;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        double prod1, prod2, prod3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de três produtos");
        prod1 = sc.nextDouble();

        prod2 = sc.nextDouble();

        prod3 = sc.nextDouble();

        if(prod1 < prod2 && prod1 < prod3){
            System.out.println("O primeiro produto é o mais barato");
        }else if (prod2 < prod1 && prod2 < prod3){
            System.out.println("O segundo produto é o mais barato");
        }else if(prod3 < prod1 && prod3 < prod2){
            System.out.println("O terceiro produto é o mais barato");
        }else {
            System.out.println("Os produtos tem o mesmo valor");
        }
    }
}
