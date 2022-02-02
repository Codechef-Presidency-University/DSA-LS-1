public class _20211CBC0045_Sukarna_Jana_Solution1 {
    public static int rmDub(int inAry[],int lenOfAry){
        int out[] = new int[lenOfAry];
        int j=0;
        for(int i=0;i<lenOfAry-1;i++){
            if(inAry[i]!=inAry[i+1]){
                out[j++]=inAry[i];
            }
        }
        out[j++]=inAry[lenOfAry-1];

        for(int k=0;k<j;k++){
            inAry[k]=out[k];
        }
        return j;
    }
    public static void main(String[] arys){
        // Given Data 1
        int input1[] = {1,1,2};
        int len1 = input1.length;
        int newlen = rmDub(input1,len1);
        System.out.print("len: "+newlen+" | nums = ");
        for(int i=0;i<newlen;i++){
            System.out.print(" "+input1[i]);
        }
        System.out.println();
        // Given Data 2
        int input2[] = {0,0,1,1,1,2,2,3,3,4};
        int len2 = input2.length;
        int newlen2 = rmDub(input2,len2);
        System.out.print("len: "+newlen2+" | nums = ");
        for(int l=0;l<newlen2;l++){
            System.out.print(" "+input2[l]);
        }
        System.out.println();
    }
}

/**
 * Name   : Sukarna Jana
 * Roll No: 20211CBC0045
 * Section: EC03 (LG06)
 */
