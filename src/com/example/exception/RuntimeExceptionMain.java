package com.example.exception;

public class RuntimeExceptionMain {
    public static void main(String[] args) { // 예외를 메인에 던지겠다!
        try {
            makeExceptions();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    } // main

    public static void makeExceptions(){
//        makeException1(10);
//        makeException2();
//        makeException3();
//        makeException4();
//        makeException5();
//        makeException6();
//        makeException7();
//        makeException8();
    }

    public static int makeException1(int input) {
        int div = input / 0; // ArithmeticException: / by zero
        return div;
    }

    public static void makeException2() {
        String a = "a";
        System.out.println(a.charAt(1)); // StringIndexOutOfBoundsException: String index out of range: 1
    }

    public static void makeException3() {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(a[5]); // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }

    public static void makeException4() {
        String nothing = null;
        System.out.println(nothing.split("")); // split 분리 / NullPointerException: Cannot invoke "String.split(String)" because "nothing" is null
    }

    public static void makeException5() {
        String str = "abc";
        int a = Integer.parseInt(str); // NumberFormatException: For input string: "abc"
    }

    public static void makeException6() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            makeException6(); // runtimeException 발생
        }
    }

    public static void makeException7() {
        Object[] objArr = new String[2];
        objArr[0] = 0; // ArrayStoreException
    }

    public static void makeException8() {
        Object[] objArr = new String[2];
        objArr[0] = "abc";
        Integer i = (Integer) objArr[0]; // ClassCastException
    }

}


