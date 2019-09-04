package com.unama;

import java.util.Scanner;

public class Aula03Programaçãoquestão03
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("informe a idade ");
        int idade = sc.nextInt();
        if (idade<=10) {
            System.out.print("infantil");
        }
            else if(idade > 10 && idade <= 17){
                    System.out.println("juvenil");
                }else{
                System.out.println("senior");

        }
    }
}
