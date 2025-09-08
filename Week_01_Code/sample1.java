// Lecture: FunctionalStylePart I
// Summary: In this program we explore functional style through Java.

import java.util.ArrayList;
import java.util.List;

public class sample1 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();

        values.add(1);
        values.add(2);
        values.add(3);
 
        System.out.println(totalValues(values));
        System.out.println(totalValuesWithImmutability(values, values.size(), 0));
    }
    
    // 1, 2, 3, 4, 5, 6
    //totalValuesWithImmutability(list, 6, 0);
    //totalValuesWithImmutability(list, 5, 0 + 6);
    private static int totalValuesWithImmutability(List<Integer> values, int size, int currentTotal) {
        if (size == 0)
            return currentTotal;
        return totalValuesWithImmutability(values, size - 1, currentTotal + values.get(size -1));
    } 

    private static int totalValues(List<Integer> values) {
        int total = 0;
        //External iterator
        for(int value : values) {
            total += value;
        }
        return total;
    }
}