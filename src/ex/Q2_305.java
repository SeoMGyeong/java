package ex;

import java.util.HashMap;

public class Q2_305 {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("A", 90);
        a.put("B", 80);

        if (a.get("C") == null ){
            System.out.println("70");
        }
    }
}
