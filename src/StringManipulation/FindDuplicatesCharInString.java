import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesCharInString {

    public static void main(String[] args) {

        String input = "hello world";
        char[] chars = input.toCharArray();

        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char c : chars) {
            if (!seen.add(c)) {
                duplicates.add(c);
            }
        }

        System.out.println("Duplicate characters:");
        for (char c : duplicates) {
            System.out.println(c);
        }
    }
}