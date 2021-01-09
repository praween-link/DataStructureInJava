package mypack;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {23,24,78,3,90,57,18};
        int p = 0;
        int r = arr.length - 1;

        // Unsorted Data
        for(int t=0; t<arr.length; t++){
            System.out.print(arr[t]+" ");
        }
        System.out.println();

        // System.out.println(r);
        
        QuickSort qs = new QuickSort();
        qs.quickSort(arr, p, r);

        // Sorted Data
        for(int t=0; t<arr.length; t++){
            System.out.print(arr[t]+" ");
        }
        System.out.println();
    }

    public int partition(int[] arr, int p, int r){
        int i = p-1;
        int x = arr[r];
        // System.out.println(x);

        for(int j=p; j<=r-1; j++){
            if(arr[j] <= x){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
    
        return i+1;
    }

    public void quickSort(int[] arr, int p, int r){
        if(p<r){
        //     QuickSort qs = new QuickSort();
            int q = partition(arr, p, r);
            quickSort(arr, p, q-1);
            quickSort(arr, q+1, r);
        }
    }
}
