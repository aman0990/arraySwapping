package com.Aman;
public class arraySwapping{
    public static void main(String...args){
        int[] a = {3,6,9,7,8,5};
        int large = a[0];
        int small = a[0]; int x=0,ax= 0;
        for(int i=0 ; i<=0; i++){
            if (a[i] >large){
                large =a[i];
                x=i;
            }
        }
        for (int j=1;j<=a.length-1; j++){
            if (a[j] >small){
                small =a[j];
                x=j;
            }
        }
        int temp= x;
        x= ax;
        ax= temp;
        for(x=0;x<=a.length-1;x++ ){
            System.out.print(a[x]);
        }
    }
}