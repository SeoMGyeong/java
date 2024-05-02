package ex;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -5, 8, -3};
        int[] result = Arrays.stream(numbers)
                .filter((a) -> a > 0) //음수제거 .
                .toArray()
                ;
        System.out.println("음수만 제외한 결과: " + Arrays.toString(result));
    }

}
