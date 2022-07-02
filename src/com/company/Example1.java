package com.company;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Example1 {
    protected static void Ex1(){
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int n;
        int l;

        do {
            System.out.println("N = ");
            n = in.nextInt();
        } while (n<=0);

        System.out.println("Line = ");
        l = in.nextInt();

        char symbol [] = new char[n*2];
        ArrayList<String> Item = new ArrayList<String>();
        boolean IsFalse = false;
        int quality = 0;
        int check = 0;
        for (int j = 0; j < l; j++) {
            check = 0;
            IsFalse = false;
            for (int i = 0; i < n*2; i++) {
                int a = random.nextInt(2);
                if (a == 1) {
                     symbol[i] = '(';
                     check = check + 1;
                }else {
                        if (i == 0){
                            IsFalse = true;
                        }

                        symbol[i] = ')';
                        check = check - 1;
                }
                if (check < 0){
                    IsFalse = true;
                }
            }
            if (check == 0 && IsFalse == false){
              quality = quality + 1;
//               System.out.println(symbol);
            }
            System.out.println(symbol);
//            Item.add(Arrays.toString(symbol));
//
//            short b1 = (short) 1023;
//            String s1 = String.format("%8s", Integer.toBinaryString(b1 & 0xFF)).replace(' ', '0');
//            System.out.println(s1);
//            System.out.println(Integer.toBinaryString(15));

            //Item.size();
        //System.out.println(symbol);
        }
        System.out.println("quality = " + quality);
    }



}
