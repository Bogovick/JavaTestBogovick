package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.math.BigInteger;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
        System.out.println("Select example (1, 2, 3) = ");
        int сhoice = in.nextInt();
        switch (сhoice){//Selecting an example
            case 1:
                Example1.Ex1();
                break;
            case 2:
                Example2plus.Ex2();
                break;
            case 3:
                System.out.println(Example3.Ex3());
                break;

        }
        }
        while (true);

            //        Random random = new Random();
//
//
//        int n;
//        int l;
//        System.out.println("N = ");
//        n = in.nextInt();
//        System.out.println("Line = ");
//        l = in.nextInt();
//        char symbol [] = new char[n*2];
//        ArrayList<String> Item = new ArrayList<String>();
//        boolean IsFalse = false;
//        int quality = 0;
//        int check = 0;
//        for (int j = 0; j < l; j++) {
//            check = 0;
//            IsFalse = false;
//            for (int i = 0; i < n*2; i++) {
//                int a = random.nextInt(2);
//                if (a == 1) {
//                     symbol[i] = '(';
//                     check = check + 1;
//                }else {
//                        if (i == 0){
//                            IsFalse = true;
//                        }
//
//                        symbol[i] = ')';
//                        check = check - 1;
//                }
//                if (check < 0){
//                    IsFalse = true;
//                }
//            }
//            if (check == 0 && IsFalse == false){
//              quality = quality + 1;
////                System.out.println(symbol);
//            }
//            Item.add(Arrays.toString(symbol));
//
//            short b1 = (short) 1023;
//            String s1 = String.format("%8s", Integer.toBinaryString(b1 & 0xFF)).replace(' ', '0');
//            System.out.println(s1);
//            System.out.println(Integer.toBinaryString(15));
//
//            //Item.size();
//        //System.out.println(symbol);
//        }
//        System.out.println("quality = " + quality);


        //////////////////////////////// 3


//        int n = 100;
//        BigInteger result = BigInteger.valueOf(1);
//
//        for (int i = 1; i <=n; i ++){
////            result = result*i;
//            result = result.multiply(BigInteger.valueOf(i));
//        }
//        System.out.println(result);
//        String resultString = result.toString();
//        System.out.println(resultString);
//        char element [] = resultString.toCharArray();
//        int num = element.length;
//        int sum = 0;
//        for (int i = 0; i < num; i++) {
//            sum = sum + Character.getNumericValue(element[i]);
//        }
//        System.out.println(sum);

        //       int n = 100;

//        double result = 1;
//        for (int i = 1; i <=n; i ++){
//            result = result*i;
//        }
//        System.out.println(result);
//        double a = result;
//        int length = (int) (Math.log10(result) + 1);
//        double[] b = new double[length];
//
//        double sum = 0;
//        for (int i = 0; i < length; i++) {
//            b[i] = a % 10;
////            System.out.println(b[i]);
//            sum = sum + b[i];
//            a = a / 10;
//        }
//        int sumint = (int) (sum);
//        System.out.println(sumint);
//        System.out.println(sum);



//        double a = result;
//        int length = (int) (Math.log10(result) + 1);
//        double[] b = new double[length];
//
//        double sum = 0;
//        for (int i = 0; i < length; i++) {
//            b[i] = a % 10;
////            System.out.println(b[i]);
//            sum = sum + b[i];
//            a = a / 10;
//        }
//        int sumint = (int) (sum);
//        System.out.println(sumint);
//        System.out.println(sum);

    }
}
