package StringManipulation;

public class ReverseStringBywWord {

    public static void main(String[] args) {
        String input = "my name is Ram";
        String[] words = input.split(" ");
        String result = "";

        for (int i=words.length-1; i>=0; i--)
        {
            result = result +  words[i] + " ";
        }

        System.out.println(result.trim());
    }
}
