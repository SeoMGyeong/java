package com.example.lamda.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class SampleStream {
    public static void main(String[] args) {

        int[] data = {5, 6, 4, 2, 1, 3, 2, 3, 2, 9, 8};

        // 짝수만 포함하는 ArrayList 생성
        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {

            if (data[i] % 2 == 0) {
                dataList.add(data[i]);
            }
        }

        // 2. Set을 사용하여 중복을 제거
        HashSet<Integer> dataSet = new HashSet<>(dataList);
        //List로 분경
        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);
        // 3. 역순정렬
        distinctList.sort(Comparator.reverseOrder());
        // Integer 리스트를 정수 배열로 반환
        int[]result = new int[distinctList.size()];
        for (int i = 0; i< distinctList.size(); i++) {
            result[i] = distinctList.get(i);
        }


        System.out.println(Arrays.toString(result));

    }// main
}
