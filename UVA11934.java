package com.company.mbstu;

import java.util.Scanner;

public class UVA11934 {
   public static void main(String args[]){
       int a,b,c,d,L;
       int function,x,i,divisibleCount=0;
       Scanner input =new Scanner(System.in);
       while(input .hasNext()) {

           divisibleCount=0;
           a = input .nextInt();
           b = input .nextInt();
           c = input .nextInt();
           d = input .nextInt();
           L = input .nextInt();
           if(a==0 && b==0 && c==0 && d==0 && L==0){
               break;
           }
           for(i=0;i<=L;i++) {
               x=i;
               function = (a * x * x) + (b * x) + c;
               if(function%d==0){
                   divisibleCount++;
               }
           }
           System.out.println(divisibleCount);
       }
   }
}

