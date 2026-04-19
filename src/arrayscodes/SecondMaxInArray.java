package arrayscodes;

public class SecondMaxInArray {

    public static void main(String[] args) {
        int[] a = {5,5,5,5,5,5};
       // int[] a = {1,5,8,3,6,17,9};
        int max = a[0];
        int secondMax = Integer.MIN_VALUE;

        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }

        for(int i=0;i<a.length;i++)
        {
          if(a[i] > secondMax && a[i] < max)
          {
              secondMax = a[i];
          }
        }

        if(secondMax ==  Integer.MIN_VALUE)
        {
            System.out.println("NO Second Max");
        }
        else
        {
            System.out.println(secondMax);
        }

    }
}

