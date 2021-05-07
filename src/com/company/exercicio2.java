package com.company;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        int num1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o  número:");
        num1 = sc.nextInt();

        if (num1 > 0) {
            System.out.println("Numero Positivo");
        }else {
            System.out.println("Numero Negativo");
        }
    }
}
