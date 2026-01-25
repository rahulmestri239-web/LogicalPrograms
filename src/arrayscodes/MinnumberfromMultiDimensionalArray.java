package arrayscodes;

public class MinnumberfromMultiDimensionalArray {

    public static void main(String[] args) {

       // 8 5 6
       // 2 9 3
       // 4 7 1

        int [] [] a = {{8,5,6},{2,9,3},{4,7,1}};
        int min =a[0][0];

        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
               // System.out.println(a[i][j]);  to print array elements
                if (a[i][j]<min)   //for max change < to >
                {
                    min = a[i][j];

                }


            }

        }


       System.out.println(min);



    }
}
