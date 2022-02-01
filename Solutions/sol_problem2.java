//Problem statement-2.
//Rearrange an array with alternate high and low elements<br/>
//Given an integer array, rearrange it such that every second element becomes greater than its left and right elements. Assume no duplicate elements are present in the array.
import java.util.Arrays;
 
public class sol_problem2
{
    public static void swap(int[] X, int i, int j)
    {
        int temp = X[i];
        X[i] = X[j];
        X[j] = temp;
    }
    public static void main (String[] args)
    {
        int[] X = {1, 2, 3, 4, 5, 6, 7}; //given input
 
        solution2(X);
        System.out.println(Arrays.toString(X));
    }

       public static void solution2(int[] X)
    {
        for (int i=1;i<X.length;i+=2)
        {
            if (X[i-1]>X[i]) {
                swap(X,i-1,i);
            }
 
            if (i+1<X.length&&X[i+1]>X[i]) {
                swap(X,i+1,i);
            }
        }
    }
}
 
 
   