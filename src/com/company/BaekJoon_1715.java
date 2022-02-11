package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BaekJoon_1715 {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int n = Integer.parseInt(br.readLine());
         PriorityQueue<Integer> pq = new PriorityQueue<>();

         for(int i = 0; i < n; i++){
             pq.add(Integer.parseInt(br.readLine()));
         }
         int result = 0;

         while(pq.size() > 1){
             int a = 0;
             int b = 0;

             a = pq.poll();
             b = pq.poll();

             result += a+b;
             pq.add(a+b);
         }

         System.out.println(result);
     }
}
