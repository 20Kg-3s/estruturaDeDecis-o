package com.company;

import java.util.Scanner;

public class exercicio3 {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra F - feminino M - masculino");

        String genero = sc.next();

        if ("f".equalsIgnoreCase(genero)) {
            System.out.println("genero Feminino!");
        }else if ("m".equalsIgnoreCase(genero)){
            System.out.println("genero Masculino!");
        }else{
            System.out.println("genero Inválido!");
        }
    }
}
