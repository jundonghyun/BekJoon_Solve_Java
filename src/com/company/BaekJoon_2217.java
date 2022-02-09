package com.company;

import java.util.*;

public class BaekJoon_2217 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); //오름차순 정렬
        int max = arr[n-1]; //무게 초기값 설정
        int count = 1;
        int idx = n-2;
        count++;

        while(idx >= 0){
            max = Math.max(arr[idx] * count, max);
            idx--;
            count++;
        }
        System.out.println(max);
    }
}
