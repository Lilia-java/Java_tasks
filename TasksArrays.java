public class TasksArrays {
    public static void main(String[] args) {
        //int [] a = new int [49];
        //a=A();
        System.out.println("Odd numbers: ");
        A();
        System.out.println();
        System.out.println("Array 20 random-numbers: ");
        B();
        System.out.println();
        System.out.println("Start array and array with 0: " );
        C();
        System.out.println();
        System.out.println("Array: " );
        D();
        System.out.println();
        System.out.println("First array: " );
        E();
        System.out.println();
        System.out.println("Array: " );
        F();
    }
    static void A (){
        int n=50;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = (2*i+1);
            System.out.print(res[i] +" ");
        }
        //return res;
    }
    static void B (){
        int k=10;
        int n=2*k;
        int countOdd=0;
        int countEven=0;
        int[] res = new int[n];
        for (int i = 0; i < 2*k; i++) {
            res[i] = (int) Math.round((Math.random() * k) + k);
            System.out.print(res[i] + " ");
        }
        for (int j:res) {
            if (j%2==0){
                countEven=countEven+1;
            }
            else{
                countOdd=countOdd+1;
            }
        }
        System.out.println();
        System.out.println("Count Odd numbers:" + countOdd + " and count Even numbers: " + countEven);
    }
    //return res;
    static void C (){
        int k=10;
        int n=50;
        int[] st = new int[k];
        int[] res = new int[k];
        //System.out.println("Start array: ");
        for (int i = 0; i < 10; i++) {
            st[i] = (int) Math.round((Math.random() * n) + n);
            System.out.print(st[i] + " ");
            if (i%2==0){
                res[i]=st[i];
            }
            else{
                res[i]=0;
            }
            System.out.println(res[i]+" ");
        }


    }
    static void D (){
        int k=15;
        int n=50;
        int max=-50;
        int min=50;
        int imax=0;
        int imin=0;
        int[] res = new int[k];
        //System.out.println("Start array: ");
        for (int i = 0; i < 10; i++) {
            res[i] = (int) Math.round((Math.random() * 2 * n) - n);
            System.out.print(res[i] + " ");
            if (res[i]>max){
                max=res[i];
                imax=i;
            }
            if (res[i]<min){
                min=res[i];
                imin=i;
            }
        }

        System.out.println("Maximum: " + max + ", index of maximum: " + imax
                + "; Minimum: "+ min + ", index of minimum: " + imin);
    }
    static void E (){
        int k=10;
        int[] res = new int[k];
        int[] res1 = new int[k];
        int avr=0;
        int avr1=0;
        //System.out.println("Start array: ");
        for (int i = 0; i < 10; i++) {
            res[i] = (int) Math.round((Math.random() *  k) + k);
            System.out.print(res[i] + " ");
            avr=avr+res[i];
        }
        avr=avr/10;
        System.out.println();
        System.out.println("Second array: ");
        for (int j = 0; j < 10; j++) {
            res1[j] = (int) Math.round((Math.random() *  k) + k);
            System.out.print(res1[j] + " ");
            avr1=avr1+res1[j];
        }
        avr1=avr1/10;
        System.out.println();
        System.out.println("Average of the first array: " + avr + "; average of the second array: " + avr1);
        if (avr>avr1){
            System.out.println("The larger is the average of the first array.");
        }
        else if (avr1>avr){
            System.out.println("The larger is the average of the second array.");
        }
        else{
            System.out.println("Means are equal.");
        }
    }
    static void F (){
        int m=20;
        int n=1;
        int c1=0;
        int c2=0;
        int c3=0;
        int[] st = new int[m];
        //System.out.println("Start array: ");
        for (int i = 0; i < 20; i++) {
            st[i] = (int) Math.round((Math.random() * 2 * n) - n);
            System.out.print(st[i] + " ");
        }
        /*for (int i=0;i<count.length;i++){
            count[i][0]=i;
        }*/
        for (int i =0; i<st.length;i++){
            if(st[i]==-1){
                c1=c1+1;
            }
            else if (st[i]==1){
                c2=c2+1;
            }
            else if (st[i]==0){
                c3=c3+1;
            }
            }
        if (c1>c2 && c1>c3){
            System.out.println("Most frequent item is:-1, times:" + c1);
        }
        else if (c1<c2 && c2>c3){
            System.out.println("Most frequent item is:1, times:" + c2);
        }
        else if (c3>c1 && c3>c2){
            System.out.println("Most frequent item is:0, times:" + c3);
        }
        else if (c1==c2 && c3<c1){
            System.out.println("Most frequent items are:1 & -1, times:" + c1);
        }
        else if (c3==c2 && c3>c1){
            System.out.println("Most frequent items are:1 & 0, times:" + c2);
        }
        else if (c1==c3 && c2<c1){
            System.out.println("Most frequent items are:0 & -1, times:" + c3);
        }
    }
}
