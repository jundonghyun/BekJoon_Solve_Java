package com.company;

import java.util.Scanner;

public class BaekJoon_1789 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long count = 0;
        long temp = 0;

        for(long i = 1; i <= n; i++){
            temp += i;
            count++;
            if(temp > n){
                count--;
                break;
            }
            if(temp == n){
                break;
            }
        }
        System.out.println(count);
    }
}
