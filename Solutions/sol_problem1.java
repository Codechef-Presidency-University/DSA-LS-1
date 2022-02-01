// Problem statement-1.
//Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
public class sol_problem1 {
    public static void main(String[] args) {
        int[] number = new int[] {0,0,1,1,1,2,2,3,3,4}; //given array input
        int newLen = solution1(number);
        System.out.println("New Length = " + newLen);//printing the new length after removing the duplictes
        System.out.print("Array = ");
        for (int i=0;i<newLen;i++) {
          System.out.print(number[i] + " ");
        }
        System.out.println();
    }
    public static int solution1(int[] number) {
      int num = number.length;
      int arr = 0;
      for (int i=0;i<num;i++) {  
        if (i<num-1&&number[i]==number[i + 1]) {
          continue; 
        }
        number[arr++]=number[i];
      }
      return arr;
}
}
