package com.company;

import java.util.*;

public class BaekJoon_1339 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[26]; //알파벳위치에 저장할 배열
        int result = 0;
        int count = 9;

        for(int i = 0; i < n; i++){
            String t = sc.next();
            int size = t.length()-1;

            for(int j = 0; j < t.length(); j++){
                int temp = (int) Math.pow(10, size); //입력된 문자열의 길이를 10의 제곱으로 변환
                int idx = t.charAt(j)-65; //대문자로만 들어오므로 대문자 시작인 65를 빼서 배열 인덱스로 사용
                arr[idx] += temp; //겹치는 알파벳이 있을 수 있으므로 += 해야함
                size--;
            }
        }

        Arrays.sort(arr); //배열 정렬 -> 오름차순

        for(int i = arr.length-1; i > 0; i--){ //배열의 가장뒷부분이 가장 큰값
            if(arr[i] == 0){
                break;
            }
            result += arr[i] * count; //가장뒤에서부터 차례대로 9,8,7...순서로 곱해줌
            count--;
        }

        System.out.println(result);
    }
}
