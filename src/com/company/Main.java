package com.company;

import java.util.Scanner;

public class Main {
    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n;i++){
            ar[i] = in.nextInt();
        }
        System.out.print("\n");
        bubbleSort(ar);
        for (int j : ar) {
            System.out.print(j + "  ");
        }
    }
}
