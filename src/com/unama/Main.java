package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a quantidade de cópias");
        int copias = sc.nextInt();
        double total_pago;
        if (copias <= 100)
        {
            total_pago = copias * 0.25;
        }else{
            total_pago = copias * 0.20;
        }
        System.out.println("O valor pago é R$ "+ total_pago);
    }
}
