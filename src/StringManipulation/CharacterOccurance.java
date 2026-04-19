package StringManipulation;

public class CharacterOccurance {
    public static void main(String[] args) {
        String str = "my name is Rahul";

        char ch1 = 'm';
        char ch2 = 'y';

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch1) {
                count1++;
            }
            if (str.charAt(i) == ch2) {
                count2++;
            }
        }

        System.out.println(ch1 + " : " + count1);
        System.out.println(ch2 + " : " + count2);
    }
}
