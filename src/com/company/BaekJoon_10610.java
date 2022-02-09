package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon_10610 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        String[] arr = n.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String t = "";
        int sum = 0;

        if(!arr[arr.length-1].contains("0")){
            System.out.println(-1);
            return;
        }

        for(int i = 0; i < arr.length; i++){
            sum += Integer.parseInt(arr[i]);
            t += arr[i];
        }

        if(sum % 3 == 0){
            System.out.println(t);
        }
        else{
            System.out.println(-1);
        }
    }
}
