package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        List<reserve> list = new ArrayList<>();
        int count = 0;
        int use = 0;
        int result = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            list.add(new reserve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        int idx = 0;
        Collections.sort(list, new Comparator<reserve>() {
            @Override
            public int compare(reserve o1, reserve o2) {
                if(o1.end == o2.end){
                    return o1.start - o2.start;
                }
                return o1.end - o2.end;
            }
        });

        for(int i = idx; i < list.size(); i++){
            if(use <= list.get(i).start){
                use = list.get(i).end;
                count++;
            }
        }

        System.out.println(count);
    }
}

class reserve{
    int start;
    int end;

    reserve(int i, int j){
        this.start = i;
        this.end = j;
    }
}
