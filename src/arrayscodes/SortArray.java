package arrayscodes;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};  //Asending

        Arrays.stream(arr)
                .sorted()
                .forEach(num -> System.out.print(num + " "));

      System.out.println();
        int[] a = {5, 2, 8, 1, 3};   //desending

        Arrays.stream(a)
                .boxed()
                .sorted(Collections.reverseOrder())
                .forEach(num -> System.out.print(num + " "));
    }
}
