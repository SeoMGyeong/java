package ex;

public class Q1_305 {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String[] result = a.split(":");
        String result1 = String.join("#", result);
        System.out.println(result1);
    }
}
