import java.util.Arrays;

public class TasksArraysN {
    public static void main(String[] args) {
        System.out.println("Array 8x8: ");
        A();
        System.out.println("Array 8x5: ");
        B();
        System.out.println("Array 8x5: ");
        C();
        System.out.println("Array 10x7: ");
        D();
    }
    static void A (){
        int k1=1;
        int k2=49;
        int n=8;
        int sum1=0;
        int sum2=0;
        double com1=1;
        double com2=1;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j=0; j < n; j++){
                res[i][j] = (int) (Math.random() * ++k2) + k1;
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++){
            sum1=sum1+res[i][i];
            com1=com1*res[i][i];
        }
        for (int i = 0; i < n; i++) {
                int k=n-1-i;
                sum2 = sum2 + res[i][k];
                com2 = com2 * res[i][k];

        }
        System.out.println();
        System.out.println("On the main diagonal an amount and a composition: " + sum1 + ", "+ com1
                + " on the side diagonal an amount and a composition: " + sum2 + ", "+ com2);
    }

    static void B (){
        int k1=-99;
        int k2=99;
        int n1=8;
        int n2=5;
        int max=-99;
        int min=99;
        int imax=0;
        int imin=0;
        int jmax=0;
        int jmin=0;
        int[][] res = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j=0; j < n2; j++){
                res[i][j] = (int) (Math.random() * ++k2) + k1;
                System.out.print(res[i][j] + " ");
                if (res[i][j]>max){
                    max=res[i][j];
                    imax=i;
                    jmax=j;
                }
                if (res[i][j]<min){
                    min=res[i][j];
                    imin=i;
                    jmin=j;
                }
            }
            System.out.println();
        }
        //System.out.println();
        System.out.println("Maximum: " + max + ", [" + imax + "] [" + jmax + "]"
                + ", minimum: " + min + ", [" + imin + "] [" + jmin + "]");
    }

    static void C (){
        int k1=-10;
        int k2=10;
        int n1=8;
        int n2=5;
        int [] ar = {1,1,1,1,1,1,1,1};
        int max=0;
        int imax=0;
        int[][] res = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j=0; j < n2; j++){
                res[i][j] = (int) (Math.random() * ++k2) + k1;
                System.out.print(res[i][j] + " ");
                ar[i]=Math.abs(ar[i] * res[i][j]);
            }
            if(ar[i]>max){
                max=ar[i];
                imax=i;
            }
            System.out.println();
        }
        //System.out.println();
        System.out.println("Maximum composition a string is: " + max + ", index of the string:" + imax );
    }

    static void D (){
        int k1=1;
        int k2=100;
        int n1=10;
        int n2=7;
        int[][] st = new int[n1][n2];
        //int[] res = new int[n1*n2];
        int min;
        int buf;
        for (int i = 0; i < n1; i++) {
            for (int j=0; j < n2; j++){
                st[i][j] = (int) (Math.random() * k2) + k1;
                //System.out.print(st[i][j] + " ");
            }
            //System.out.println();
            System.out.println(Arrays.toString(st[i]));
        }

        System.out.println("Sorted array: ");
        System.out.println();
        for (int i = 0; i < n1; i++) {
            for (int k = 0; k < n2 - 1; k++) {
                int max_idx = k;
                for (int l = k + 1; l < n2; l++) {
                    if (st[i][l] > st[i][max_idx]) {
                        max_idx = l;
                    }
                }
                // if (max_idx != k) {
                buf = st[i][k];
                st[i][k] = st[i][max_idx];
                st[i][max_idx] = buf;
                //    max_idx = k;
                //}
            }
            System.out.println(Arrays.toString(st[i]));
        }


    }
}
