package com.company;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra:");

        String letra = sc.next();

        switch (letra) {
            case "a", "A":
            case "e", "E":
            case "i", "I":
            case "o", "O":
            case "u", "U":
                System.out.println("A letra " + letra +  " é uma vogal");
                break;
            default:
                System.out.println("A letra " + letra + " é uma consoante");
        }
    }
}
