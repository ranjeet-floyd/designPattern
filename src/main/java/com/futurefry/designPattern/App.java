package com.futurefry.designPattern;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();

            }
            int swapCount = countSwap(arr, 0, arr.length-1);
            System.out.println(swapCount);
        }
    }
    private static int countSwap(int[] arr,  int start, int end){
        //set exit condition
        if(start >= end){
            return 0;
        }

        if(start - end ==2){
            return swapCount(arr, start, end);

        }

        int mid = (start + end)/2 ;
        int startCount =  countSwap(arr, start, mid);
        int endCount =  countSwap(arr, mid +1 ,end);
        int swapCount= merge(arr, start,mid, mid +1, end);
        return startCount + endCount + swapCount;

    }

    private static int swapCount(int[] arr, int start, int end){
        //swap if start index element is greater than end index.
        if(arr[start] > arr[end]){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            return 1; 
        }

        return 0;

    }

    private static int merge(int[] arr, int startLeft, int endLeft, int startRight, int endRight){
        int swapCount = 0 ;
        //already sorted
        if(arr[endLeft] <= arr[startRight]){
            return swapCount;
        }
        while(startLeft <= endLeft && startRight <= endRight){
            if(arr[startLeft] > arr[startRight]){
                swapCount += swapCount(arr, startLeft, startRight);
                startLeft++;

            }
            startRight++;
        }
        return swapCount;
    }
}
