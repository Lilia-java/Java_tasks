import java.util.Arrays;
import java.util.Scanner;

public class Sorts {
    public static void main(String[] args) {
        int n1= writeNumber();
        int [] arr = new int [n1];
        int [] arrb = new int [n1];
        int [] arrs = new int [n1];
        arr=sortableArray(n1);
        int [] arra = arr;
        System.out.println("Array: ");
        for (int i=0; i<n1;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Bubble sort: ");
        long startTime = System.nanoTime();
        arrb=bubbleSort(arr);
        for (int i=0; i<n1;i++) {
            System.out.print(arrb[i]+" ");
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(" ");
        System.out.println("Bubble sort time: "+estimatedTime);

        System.out.println("Selection sort: ");
        long startTime1 = System.nanoTime();
        arrs=selectionSort(arr);
        for (int i=0; i<n1;i++) {
            System.out.print(arrs[i]+" ");
        }
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println(" ");
        System.out.println("Selection sort time: "+estimatedTime1);

        System.out.println("Array`s metod sort: ");
        long startTime2 = System.nanoTime();
        Arrays.sort(arra);
        for (int i=0; i<n1;i++) {
            System.out.print(arra[i]+" ");
        }
        long estimatedTime2 = System.nanoTime() - startTime1;
        System.out.println(" ");
        System.out.println("Array`s metod sort time: "+estimatedTime2);
    }

    //function for Random-array
    static int[] sortableArray(int k){
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = (int) Math.round((Math.random() * 2 * k) + k);
            //System.out.println(res[i]);
        }
        return res;
    }

    static int[] bubbleSort(int[] array){
        int[] result = new int[array.length];
        int n=array.length;
        for (int j = n-1; j>=1; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    int buff = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buff;
                }
            }
        }
        result=array;
        return result;
    }

    static int[] selectionSort(int[] array){
        int[] result = new int[array.length];
        int n=array.length;
        int min;
        int buf;
        for (int j = 0; j < n-1; j++) {
            min=j;
            for (int i = j+1; i < n; i++) {
                if (array[i] < array[min]) {
                    min=i;
                }
            }
            buf = array[j];
            array[j]=array[min];
            array[min] = buf;
        }
        result=array;
        return result;
    }

    //function to enter the size of the array from the keyboard
    static int writeNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input size array: ");
        int n = in.nextInt();
        return n;
    }
}
