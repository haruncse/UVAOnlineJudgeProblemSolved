package com.company.mbstu;

import java.util.Scanner;

public class UVA11854 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a,b,c;
        while(input.hasNextLine()){
            a=input.nextInt();
            b=input.nextInt();
            c=input.nextInt();
            if(a==0&&b==0&&c==0){
                break;
            }
            if((a*a)+(b*b)==(c*c) || (a*a)+(c*c)==(b*b) || (b*b)+(c*c)==(a*a)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
}
