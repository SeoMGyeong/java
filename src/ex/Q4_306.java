package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4_306 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("값을 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int data=sc.nextInt(); // 문자열로 받고 형변환을 해줘도 상관없을듯요.?
        sc.close();

        list.add(0);
        list.add(1);
        for (int i = 2; i < data; i++) {
            list.add((list.get(i-2) + list.get(i-1)));
        }
        System.out.println(list);
    }
}
