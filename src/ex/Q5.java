package ex;

import java.util.ArrayList;
import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = Arrays.stream(numbers)
                .boxed()
                .filter((a) -> a % 2 == 1)
                .mapToInt(Integer::intValue)
                .toArray();


        System.out.println(Arrays.toString(result));

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] * 2 + " ");
            }

        System.out.println(Arrays.toString(result)); //? 뭐지.


    } // main
}
