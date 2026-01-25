package arrayscodes;

public class FindMaxNumberwhereminnumberis {

    public static void main(String[] args) {

        // 8 5 6
        // 2 9 3
        // 4 7 1

        int [] [] a = {{8,5,6},{2,9,3},{4,7,1}};
        int min =a[0][0];
        int mincolumn= 0;

        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                // System.out.println(a[i][j]);  to print array elements
                if (a[i][j]<min)   //for max change < to >
                {
                    min = a[i][j];
                    mincolumn = j;
                }
            }
        }
        //System.out.println(min);

        int max = a[0][mincolumn];
            int k =0;
            while (k<3)
            {
                if (a[k][mincolumn]>max)
                {
                    max = a[k][mincolumn];
                }
                k++;
            }

            System.out.println(max);








    }



}
