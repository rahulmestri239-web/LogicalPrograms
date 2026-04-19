package StringManipulation;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesCharInString2 {

    public static void main(String[] args) {
        String s = "AAABBBCDF";
        char[] chars = s.toCharArray();

        Set<Character> seen  = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char c : chars)
        {
            if (!seen.add(c))
            {
                duplicates.add(c);

            }
        }

        System.out.println("Duplicates characters are :");
        for (char c : duplicates)
        {
            System.out.println(c);
        }
     }
}
