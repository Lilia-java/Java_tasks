import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        int n1= writeNumber();
        if (n1 > 0) {
            int c;
            int r;
            long startTime = System.nanoTime();
            c = cycleFactorial(n1);
            long estimatedTime = System.nanoTime() - startTime;
            System.out.println("Output cycle factorial: " + c);
            System.out.println("Output cycle factorial time: " + estimatedTime);

            long startTime1 = System.nanoTime();
            r = recursionFactorial(n1);
            long estimatedTime1 = System.nanoTime() - startTime1;
            System.out.println("Output recursion factorial: " + r);
            System.out.println("Output recursion factorial time: " + estimatedTime1);
        }
        else {
            System.out.println("Number is not more than zero!!!");
        }
    }
    static int cycleFactorial (int n) {
        int res=1;
        for (int i = 1; i <= n; i++) {
            res=res*i;
            //System.out.println(res[i]);
        }
        return res;
    }

    static int recursionFactorial (int n) {
        int res;

        if(n==1) return 1;
        res=recursionFactorial(n-1)*n;
        return res;
    }

    //function to input number from the keyboard
    static int writeNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = in.nextInt();
        return n;
    }
}
