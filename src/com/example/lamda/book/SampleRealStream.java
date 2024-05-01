package com.example.lamda.book;

import java.util.Arrays;
import java.util.Comparator;

public class SampleRealStream {
    public static void main(String[] args) {
        int[] data = {5, 6, 7, 8, 9, 1, 2, 3, 4, 3, 2};
        int[] result = Arrays.stream(data) // IntStream 생성
                .boxed() // IntStream을 Stream<Integer>로 변경
                .filter((a) -> a % 2 == 0) // 짝수만 뽑아낸다.
                .distinct() // 중복을 제거한다.
                // Compparator 인터페이스에 compare메서드는 두 개의 객체를 인자로 받아 비교하여
                // 첫번째 객체가 작으면 음수, 작으면 0, 크면 양수를 반환함.
                .sorted(Comparator.reverseOrder()) // 역순으로 정렬한다.
                .mapToInt(Integer::intValue) // Stream<Integer>를 IntStream으로 변경한다. (스트림의 요소를 정수값으로 변환하는 메서드)
                .toArray() // int[] 배열로 반환한다.
                ;

        System.out.println(Arrays.toString(result));
       
    } // main
}
