package StringManipulation;

public class ReverseEachWord {

    public static void main(String[] args) {
        String input = "ym eman si luhaR";
        String[] words = input.split(" ");
        String output = "";
        for (String word : words)
        {
            String reverse = "";
            for(int i=word.length()-1; i>=0; i--)
            {
                reverse = reverse + word.charAt(i);
            }

            output = output + reverse + " ";
        }
        System.out.println(output);
    }
}
