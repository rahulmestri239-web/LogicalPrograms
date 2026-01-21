package arrayscodes;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 4, 5};

        int [] unitary = Arrays.stream(a).distinct().toArray();

        System.out.println(Arrays.toString(unitary));




    }
}
