package com.example.modifier;
import java.util.Date;
import java.text.SimpleDateFormat;

// 1) 멤버변수를 static으로 선언하면 여러 객체가 공유하는 변수가 됨.
// 객체를 생성하지 않고 클래스이름.static변수명으로 선언 가능.
class Count {
    int a = 0; // (변수 공유하지 않음)
    static int b = 0; // 공유하는 변수
}

public class StaticMain {

    public static void main(String[] args) {
        Count c1 = new Count();
        c1.a++; // c1의 a 따로 
        c1.b++; // b = 1
        System.out.println("c1.a = " + c1.a);
        System.out.println("c1.b = " + c1.b);

        Count c2 = new Count();
        c2.a++; // c2의 a 따로
        c2.b++; // b = 2
        Count.b++; // 클래스이름.static변수명 b=3
        System.out.println("c2.a = " + c2.a);
        System.out.println("c2.b = " + c2.b); //결과값 2 나옴. b는 static으로 선언되었기때문! b는 공유되는중.

        // method()가 static으로 선언된 경우. Math.random()
        // 빈번하게 호출될때 객체생성 없이 사용가능.
        Math.random(); //random()은 매개변수가 없는 경우

        //String을 int 변환
        int c = Integer.parseInt("123"); // 매개변수가 있는 경우.
        System.out.println(c+100);

        // java.util.Date
        // Util 클래스에 있는 static method() => getcurrentDate()
        System.out.println(Util.getCurrentDate("yyyyMMdd"));


    } // main
}
