package com.company;

import java.util.*;

public class BaekJoon_1026 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Integer> a = new PriorityQueue<>(Collections.reverseOrder());
        int b[] = new int[n];

        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);

        int result = 0;

        for(int i = 0; i < n; i++){
            result += a.poll() * b[i];
        }

        System.out.println(result);
    }
}
