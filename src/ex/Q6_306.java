package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q6_306 {
    public static void main(String[] args) throws IOException {



        System.out.println("숫자를 입력하세요: ");
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String a = br.readLine();
        System.out.println(a);

    }
}
