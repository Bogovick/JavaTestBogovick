package com.company;

import java.math.BigInteger;

public class Example3 {
    protected static int Ex3(){
    int n = 100;
    BigInteger result = BigInteger.valueOf(1);//Ordinary data types are not enough to describe 100!

     for (int i = 1; i <=n; i ++){
//            result = result*i;
            result = result.multiply(BigInteger.valueOf(i));//Factorial calculation, multiply method
     }
//        System.out.println(result);
    String resultString = result.toString(); //Convert BigInteger to String
//        System.out.println(resultString);
    char element [] = resultString.toCharArray(); //Breaking a string into an array of elements
    int num = element.length;
    int sum = 0;
    for (int i = 0; i < num; i++) {
        sum = sum + Character.getNumericValue(element[i]); //Convert from ascii to int and calculate the sum of 100 digits!
    }
//        System.out.println(sum);
        return sum;
    }

  /////////////////////////////////////////////Test
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
