package ex;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Q7_306 {
    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("c:/java/abc.txt"));

        while (true) {
            String line = br.readLine();
            if (line == null)
                break;
            list.add(line);
        }
        br.close();
        list.sort(Comparator.reverseOrder());
        PrintWriter pw = new PrintWriter("c:/java/result.txt");

        for (String line : list) {
            pw.println(line);
        }
        pw.close();
    } // main
}
