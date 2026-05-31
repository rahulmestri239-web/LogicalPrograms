package StringManipulation;

import java.util.Scanner;

public class CharacterOccuracneUsingScanner
{



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter String: ");
            String str = sc.nextLine();

            System.out.print("Enter first character: ");
            char ch1 = sc.next().charAt(0);

            System.out.print("Enter second character: ");
            char ch2 = sc.next().charAt(0);

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

            sc.close();
        }
    }

