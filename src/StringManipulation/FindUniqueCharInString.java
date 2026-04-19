package StringManipulation;

public class FindUniqueCharInString {
    public static void main(String[] args) {
        String s = "AAABBBCDF WA";
        char[] chars = s.toCharArray();

        for (char c : chars)
        {
            if (s.indexOf(c) == s.lastIndexOf(c))
            {
                System.out.println("Unique character is : " + c);
            }
        }
    }
}
