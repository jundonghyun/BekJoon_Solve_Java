package com.company;

import java.util.Scanner;

public class BaekJoon_1439 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int count1 = 0; //1일때 ++
        int count2 = 0; //0일때 ++

        if(s.charAt(0) == '0'){
            count2++;
        }
        else{
            count1++;
        }

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) != s.charAt(i)){
                if(s.charAt(i) == '1'){
                    count1++;
                }
                else{
                    count2++;
                }
            }
        }

        System.out.println(Math.min(count1, count2));
    }
}
