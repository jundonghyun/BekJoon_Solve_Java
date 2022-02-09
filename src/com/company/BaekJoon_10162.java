package com.company;

import java.util.Scanner;

public class BaekJoon_10162 {
    public static void main(String[] args){
        // A = 5분 == 300초
        // B = 1분 == 60초
        // c = 10초 == 10초
        int arr[][] = new int[3][2];
        arr[0][0] = 300;
        arr[1][0] = 60;
        arr[2][0] = 10;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;

        while(temp != 0){
            if(temp >= arr[0][0]){
                if(temp % arr[0][0] == 0){
                    arr[0][1] = temp / arr[0][0];
                    break;
                }
                else{
                    arr[0][1] = temp / arr[0][0];
                    temp = temp % arr[0][0];
                }
            }
            else if(temp >= arr[1][0]){
                if(temp % arr[1][0] == 0){ //나머지가 1일때 == 60으로 다 나뉘어짐
                    arr[1][1] = temp / arr[1][0];
                    break;
                }
                else{ //나머지가 1이 아니라면 == 60으로 안나뉘어짐
                    arr[1][1] = temp / arr[1][0];
                    temp = temp % arr[1][0];
                }
                continue;
            }
            else if(temp >= arr[2][0]){
                if(temp % arr[2][0] == 0){
                    arr[2][1] = temp / arr[2][0];
                    break;
                }
                else{
                    arr[2][1] = temp / arr[2][0];
                    temp = temp % arr[2][0];
                }
            }
            else{
                System.out.println(-1);
                return;
            }
        }

        System.out.println(arr[0][1]+" "+arr[1][1]+" "+arr[2][1]);
    }
}
