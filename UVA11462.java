package com.company.mbstu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class UVA11462 {

    public static void main(String[] args)  throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s=br.readLine())!=null) {
            int N=Integer.parseInt(s);
            if (N==0) {
                break;
            }
            int [] ints=new int [N];
            StringTokenizer st=new StringTokenizer(br.readLine());
            for (int i=0;i<ints.length;i++) {
                ints[i]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(ints);
            StringBuilder sb=new StringBuilder();
            for (int i=0;i<ints.length;i++) {
                sb.append(ints[i]);
                if (i<ints.length-1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}