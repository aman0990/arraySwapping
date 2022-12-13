package com.Aman;
public class SwapElementsExample {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        System.out.println("Array before Swap" + "\n");
        for (int element : arr) {
            System.out.println(element);
        }
        //Simple Swapping logic
        int temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
        System.out.println("Array after Swap");
        for (int element : arr) {
            System.out.println(element);
        }
    }
}