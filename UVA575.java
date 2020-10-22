package com.company.mbstu;

import java.util.Scanner;

public class UVA575 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String data;
        int i,decimalValue,datLength,c;
        while (input.hasNextLine()){
            data=input.nextLine();

            if(data.indexOf("0")==0&&data.length()==1){
                break;
            }
            decimalValue=0;
            datLength=data.length();
            for (i=data.length()-1;i>=0;i--){

                c= (int) (Math.pow(2, (datLength-i))-1);
                decimalValue+= (Character.getNumericValue(data.charAt(i))*c);
            }

            System.out.println(decimalValue);
        }
    }
}
