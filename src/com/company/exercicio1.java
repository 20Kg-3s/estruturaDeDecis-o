package com.company;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
	    int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1 = sc.nextInt();

        System.out.println ("Digite o segundo número");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O maior  entre eles é: " + num1);

        }else if (num2 > num1) {
            System.out.println("O maior  entre eles é: " + num2);
        }
        else {
            System.out.println("os valores são iguais.");
        }
    }
}
