package com.company;

import java.util.Scanner;

class BaekJoon_11047{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp[] = new int[n];
        int min = Integer.MAX_VALUE;
        int idx = 0;
        int result = 0;

        int coin[] = new int[n];

        for(int i = 0; i < coin.length; i++){
            coin[i] = sc.nextInt();
        }

        while(k != 0){
            for(int i = 0; i < coin.length; i++){
                if(k / coin[i] >= 1){
                    temp[i] = k / coin[i];
                    min = temp[i];
                    idx = i;
                }
            }
            result += min;
            k = k % coin[idx];
        }

        System.out.println(result);
    }
}