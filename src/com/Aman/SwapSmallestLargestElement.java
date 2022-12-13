package com.Aman;
import java.util.Scanner;

public class SwapSmallestLargestElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i, n;

        System.out.println("Enter the size of array : ");
        n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements to be entered : ");
        for(i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        //Call a function Find maximum element of array
        int maxElementPos = findMaxElement(arr,n);
        System.out.println("The maximum element : "+ arr[maxElementPos]);

        //Call a function Find minimum element of array
        int minElementPos = findMinElement(arr,n);
        System.out.println("The minimum element : "+ arr[minElementPos]);

        //Call a function swap maximum and minimum element
        swapMaxMinElement(arr, maxElementPos, minElementPos);

        // Finally print array after swap
        System.out.println("The array after swap is : ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    //Find maximum element of array
    public static int findMaxElement(int[] arr, int n){
        int i, pos=0;
        int maxVal = arr[0];
        for(i=0;i<n;i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
                pos=i;
            }
        }
        return pos;
    }

    //Find minimum element of array
    public static int findMinElement(int[] arr, int n){
        int i, pos=0;
        int minVal = arr[0];
        for(i=0;i<n;i++){
            if(arr[i] < minVal){
                minVal = arr[i];
                pos=i;
            }
        }
        return pos;
    }

    //Swap maximum and minimum element
    public static void swapMaxMinElement(int[] arr, int maxElementPos, int minElementPos){

        /*To swap max and min numbers, take a temporary variable, and follow the below step,
          1) assign maximum number to temporary vaiable.
          2) assign minimum number to maximum number.
          3) asign temporary vaiable to minimum number*/

        int temp;
        temp = arr[maxElementPos];
        arr[maxElementPos] = arr[minElementPos];
        arr[minElementPos] = temp;
    }
}