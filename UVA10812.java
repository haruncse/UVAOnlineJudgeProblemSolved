package com.company.mbstu;

import java.util.Scanner;

public class UVA10812 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int sum,diff;
        int value1,value2;
        for(int i=0;i<n;i++){

            sum=input.nextInt();
            diff=input.nextInt();

            if(sum < diff || (sum+diff)%2!=0){
                System.out.println("impossible");
            }else{
                value1=(sum+diff)/2;
                value2=(sum-diff)/2;
                System.out.println(Math.max(value1,value2)+" "+Math.min(value1,value2));
            }
        }
    }
}
