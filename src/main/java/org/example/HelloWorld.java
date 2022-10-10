package org.example;

public class HelloWorld {

    public static void main(String[] args) {
        //boolean flag = true;
        //byte aByte; // 8 бит
        //short aShort; // 16 бит
        //int aInt; // 32 бит
        //long aLong; //64 бит
        // float aFloat;
        // double aDouble = 1.5;
        // char aChar = '0'
        // Операторы математические + - * / %
        // Операторы условные > < >= <= == != !
        //Арифметические операторы
        int a = 20;
        int b = 10;
        int c = 5;
        int d = 2;
        double aDouble = 9.5;
        int max = Integer.MAX_VALUE;
        if (a>b && d<1) {
            System.out.println("a>b и d<1");
        }
        else if (a>b || d<1) {
            System.out.println("a>b или d<1");
        }
        System.out.println("max+max: " + (max+max));
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++ = " +  (a++));
        System.out.println("--b = " +  (--b));
        System.out.println("++d = " +  (++d));
        System.out.println("aDouble-d = " + (aDouble - d));


}}