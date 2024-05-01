package com.example.lamda.book;

@FunctionalInterface //코드의 안전성?
interface Calculator {
    int sum(int a, int b);
}

public class Sample {
    public static void main(String[] args) {
//        Calculator mc = (a, b) -> a + b;
        // 메서드 참조 ::을 사용하여 이 메서드는 'Calculator'라는 인터페이스의 'sum'메서드에 연결됨.
        Calculator mc = Integer::sum;
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
