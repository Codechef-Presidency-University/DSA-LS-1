// actually i don't know it is correct or not i just went as ter the question but not getting the same output

public class _20211CBC0045_Sukarna_Jana_Solution2 {
    public static void main(String[] args) {
        // Given Datas...
        int ary1[] = {1, 2, 3, 4, 5, 6, 7};
        int ary2[] = {9, 6, 8, 3, 7};
        int ary3[] = {6, 9, 2, 5, 1, 4};

        int index_i_of_ary1 = 0;
        int index_i_of_ary2 = 0;
        int index_i_of_ary3 = 0;

        int index_j_of_ary1 = (ary1.length)-1;
        int index_j_of_ary2 = (ary2.length)-1;
        int index_j_of_ary3 = (ary3.length)-1;

        int k1 = 0;
        int k2 = 0;
        int k3 = 0;

        int A1[] = new int[index_j_of_ary1+1];
        int A2[] = new int[index_j_of_ary2+1];
        int A3[] = new int[index_j_of_ary3+1];

        do{
            A1[k1++]=ary1[index_i_of_ary1++];
            A1[k1++]=ary1[index_j_of_ary1--];
        }
        while(index_i_of_ary1<index_j_of_ary1);
        do{
            A2[k2++]=ary2[index_i_of_ary2++];
            A2[k2++]=ary2[index_j_of_ary2--];
        }
        while(index_i_of_ary2<index_j_of_ary2);
        do{
            A3[k3++]=ary3[index_i_of_ary3++];
            A3[k3++]=ary3[index_j_of_ary3--];
        }
        while(index_i_of_ary3<index_j_of_ary3);

        System.out.print("Input :");
        for(int i=0;i<(ary1.length);i++){
            System.out.print(ary1[i]+" ");
        }
        System.out.println();
        System.out.print("\nOutput :");
        for(int j=0;j<(A1.length);j++){
            System.out.print(A1[j]+" ");
        }
        System.out.println();
        System.out.print("Input :");
        for(int i=0;i<(ary2.length);i++){
            System.out.print(ary2[i]+" ");
        }
        System.out.println();
        System.out.print("\nOutput :");
        for(int j=0;j<(A2.length);j++){
            System.out.print(A2[j]+" ");
        }
        System.out.println();
        System.out.print("Input :");
        for(int i=0;i<(ary3.length);i++){
            System.out.print(ary3[i]+" ");
        }
        System.out.println();
        System.out.print("\nOutput :");
        for(int j=0;j<(A3.length);j++){
            System.out.print(A3[j]+" ");
        }
        System.out.println();
    }
    
}

/**
 * Name   : Sukarna Jana
 * Roll No: 20211CBC0045
 * Section: EC03 (LG06)
 */
