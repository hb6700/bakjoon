package com.baekjoon.numbase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10250 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String e = "";

            int b = Integer.parseInt(st.nextToken());       //높이
            int c = Integer.parseInt(st.nextToken());       //한층의 방 개수
            int d = Integer.parseInt(st.nextToken());       //손님수(?


            if (d % b == 0) {
                e = e + b;
            } else {
                e = e + (d % b);
            }
            double f =  Math.ceil((double)d / (double)b);
            if (f < 10)
                e = e + "0";

            bw.write(e + (int)f + "\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }


}