package ex;


import java.util.Random;

class OddException extends Exception {
}

public class Q10_308 {

    static void execute(int n) throws OddException {
        System.out.printf("입력숫자: %d\n", n);
        if (n % 2 == 1) {
            throw new OddException();
        }
        System.out.println("짝수입니다.");
    }

    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            try {
                execute(r.nextInt(10));
            } catch (OddException e) {
                e.printStackTrace();
            }
        }
        System.out.println("10번 반복했습니다.");
    }
} // 때론 간단하게 풀릴수도...
