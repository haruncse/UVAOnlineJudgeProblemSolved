package com.company.mbstu;

import java.math.BigInteger;
import java.util.Scanner;

public class UVA495 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger fib[] = new BigInteger[5001];
        BigInteger a = fib[0] = BigInteger.valueOf(0);
        BigInteger b = fib[1] = BigInteger.valueOf(1);

        int n = 2;
        while(n <= 5000) {
            fib[n] = a.add(b);
            a = b;
            b = fib[n];

            n++;
        }

        while(sc .hasNext()) {
            n = sc .nextInt();
            System.out.printf("The Fibonacci number for %d is %s\n", n, fib[n].toString());
        }
    }

}