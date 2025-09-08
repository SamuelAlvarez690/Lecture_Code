// Lecture: TypingPartII
// Summary: In this program we explore static typing through Java.

import java.util.ArrayList;
import java.util.List;

public class sample2 {
    public static void oops(List list) {
        list.add(1.0);
    }
    public static void main(String[] args) {
        // double value = 4.0;

        // value = "hello";
        // value = 3;

        // System.out.println(value);

        // List scores = new ArrayList();

        // scores.add(1);
        // scores.add(2);
        // scores.add(1.0);

        // int total = 0;
        // for(Object e : scores) {
        //     total += (Integer) e;
        // }

        // System.out.println("Total is " + total);

        List<Integer> scores = new ArrayList<Integer>();

        scores.add(1);
        scores.add(2);
        //scores.add;
        oops(scores);

        int total = 0;
        for(int e : scores) {
            total += (Integer) e;
        }

        System.out.println("Total is " + total);
    }
}