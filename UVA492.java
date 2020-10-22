package com.company.mbstu;

import java.util.Scanner;

public class UVA492 {
    public static void  main(String args[]){
        int idx = 0;
        String stackString = "";

        Scanner stdin = new Scanner(System.in);

        while (stdin.hasNextLine()) {
            String line = stdin.nextLine();

            for (int i=0; i<line.length(); i++){
                char s =line.charAt(i);
                if( (s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')){
                    stackString +=  s;
                    idx++;
                    if(idx > 0 && i==line.length()-1){
                        switch (stackString.charAt(0)){
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                            case 'A':
                            case 'E':
                            case 'I':
                            case 'O':
                            case 'U':
                                System.out.print(stackString+"ay");
                                break;
                            default:
                                System.out.print(stackString.substring(1)+""+stackString.charAt(0)+"ay");
                        }

                        idx=0;
                        stackString="";
                    }
                }
                else{
                    if(idx > 0){
                        switch (stackString.charAt(0)){
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                            case 'A':
                            case 'E':
                            case 'I':
                            case 'O':
                            case 'U':
                                System.out.print(stackString+"ay");
                                break;
                            default:
                                System.out.print(stackString.substring(1)+""+stackString.charAt(0)+"ay");
                        }
                        idx=0;
                        stackString="";
                    }
                    System.out.print(s);
                }
            }
            System.out.println();
        }
    }
}
