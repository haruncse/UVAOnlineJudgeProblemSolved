package com.company.mbstu;

import java.util.Scanner;

public class UVA11172 {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        long n,i=0,a,b;

        n = input.nextInt();
        while(i<n) {
            i++;
            a = input.nextLong();
            b = input.nextLong();
            if(a>b){
                System.out.println(">");
            }
            else if (a<b){
                System.out.println("<");
            }
            else{
                System.out.println("=");
            }
        }
    }
}
