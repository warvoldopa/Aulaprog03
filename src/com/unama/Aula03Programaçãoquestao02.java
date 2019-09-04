package com.unama;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Aula03Programaçãoquestao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pecasproduzidas,pecasdefeituosas;
        System.out.println("informe a quantidade de peças produzidas: ");
        pecasproduzidas = sc.nextInt();
        System.out.println("informe a quantidade de peças defeituosas");
        pecasdefeituosas = sc.nextInt();
        if(pecasdefeituosas > (pecasproduzidas*0.1)){
            System.out.println("maquina precisa de manutenção");
        }else{
            System.out.println("maquina nao precisa de manutenção");
        }

    }
}
