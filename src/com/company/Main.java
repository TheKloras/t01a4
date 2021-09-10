package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int u;
        Scanner S = new Scanner(System.in);
        System.out.println("Kiek skaičių vesite?");
        u = S.nextInt();
        int[] skaiciai = new int[u];
        for (int i = 0; i < u; i++) {
            System.out.println("Įveskite skaičių");
            skaiciai[i] = S.nextInt();
        }
        for (int i = 0;i < u;i++){
            if (skaiciai[i]>100){
                System.out.println(skaiciai[i]);
            }

        }
    }
}
