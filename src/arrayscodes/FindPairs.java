package arrayscodes;

public class FindPairs {

    public static void main(String[] args) {
        int[] a = {2, 4, -5, 10, 8, 1,-6,3,7};
        int target = 9;

        for (int i=0; i<a.length; i++)
        {
            for (int j=i+1; j<a.length; j++)
            {
                if (a[i] + a[j] == target)
                {
                    System.out.println("Pair is : " + a[i] + " and " + a[j]);
                }
            }
        }
    }
}
