package ex;

import java.util.Scanner;

public class Q5_306 {
    public static void main(String[] args) {

        System.out.print("구구단을 출력할 숫자를 입력하세요(2~9): ");

        Scanner sc = new Scanner(System.in);
        int gu = sc.nextInt();
        sc.close();

        for (int i = 1; i <10 ; i++) {
            System.out.println(gu + "x" + i + " = " + gu*i );
        }







//        int[] result = gugu(gu);
//        for (int a : result) {
//            System.out.println(a);
//        }

    } // main
}
