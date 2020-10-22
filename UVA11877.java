package com.company.mbstu;

import java.util.Scanner;

public class UVA11877 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        int count;
        int r;
        while(input.hasNext()) {
            n = input.nextInt();
            count=0;
            if(n==0)
                break;
            while((r=n/3)!=0){
                count+=r;
                n=(n%3)+r;
            }
            if(n%3==2){
                count++;
            }
            System.out.println(count);
        }
    }
}
