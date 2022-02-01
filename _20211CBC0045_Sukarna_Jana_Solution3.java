import java.util.Scanner;

class seePair{
    int see() {
        Scanner scan = new Scanner(System.in);
        int looptime = 0;
        System.out.println("Input :");
        int ary[] = new int[6];
        while (looptime<6){
            ary[looptime] = scan.nextInt();
            looptime++;
        }
        System.out.println("Enter K :");
        int k = scan.nextInt();
 
        int[] temp = new int[6];
        for(int i = 0; i < 6; i++) {
            temp[i] = 0;
        }
        for (int i = 0; i < 5; i++){
            if (temp[i] != 0) {
                continue;
            }
            int j = i + 1;
            while (j < 6)
            {
                if (temp[j] == 0 && (ary[j] + ary[i]) % k == 0)
                {
                    temp[j] = 1;
                    break;
                }
                j++;
            }
            if (j == ary.length) {
                return 0;
            }
        }
        return 1;
   }
}

public class _20211CBC0045_Sukarna_Jana_Solution3 {
     public static void main(String[] args) {
         seePair seeing = new seePair();
         int gotOrNot = seeing.see();
         
        if (gotOrNot != 0) {
            System.out.println("Pairs can be formed");
        }
        else {
            System.out.println("Pairs cannot be formed");
        }
     }
}

/**
 * Name   : Sukarna Jana
 * Roll No: 20211CBC0045
 * Section: EC03 (LG06)
 */