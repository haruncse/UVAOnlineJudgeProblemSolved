package com.company.mbstu;

import java.util.Scanner;

public class UVA12577 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String data;
        int caseCount=0;
        while (input.hasNextLine()){
            data=input.nextLine();
            if(data.indexOf("*")>=0){
                break;
            }

            switch (data){
                case "Hajj":
                    caseCount++;
                    System.out.println("Case "+caseCount+": Hajj-e-Akbar");
                    break;
                case "Umrah":
                    caseCount++;
                    System.out.println("Case "+caseCount+": Hajj-e-Asghar");
                    break;
                default:
                    break;
            }
        }
    }
}
