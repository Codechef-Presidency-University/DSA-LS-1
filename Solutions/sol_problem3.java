//Problem statement-3.
//Determine whether an array can be divided into pairs with a sum divisible by `k`.<br/>
//Given an integer array, determine whether it can be divided into pairs such that the sum of elements in each pair is divisible by a given positive integer k
public class sol_problem3 
    {
        public static void main(String[] args)
        {
            int[] A = { 3, 1, 2, 6, 9, 4 }; //given Input
            int k = 6;
     
            if (solution3(A, k) != 0) {
                System.out.println("Pairs formed");
            }
            else {
                System.out.println("Pairs not formed");
            }
        }
        public static int solution3(int[] A, int k)
        {
            if (A.length % 2 == 1) {
                return 0;
            }
            int[] visited = new int[A.length];
     
            for (int i = 0; i < A.length; i++) {
                visited[i] = 0;
            }
            for (int i=0; i<A.length-1;i++)
            {
                if (visited[i] != 0) {
                    continue;
                }
     
                int j = i+1;
                while (j < A.length)
                {
                    if (visited[j]==0 && (A[j]+A[i]) % k==0)
                    {
                        visited[j] = 1;
                        break;
                    }
                    j++;
                }
                if (j == A.length) {
                    return 0;
                }
            }
            return 1;
        }
    }
       
