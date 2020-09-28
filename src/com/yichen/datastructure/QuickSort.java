package com.yichen.datastructure;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a= new int[] {1,3,5,7,9,2,4,6,8};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] a,int begin,int end) {
        if(begin>=end) return;
        int index = getCenterIndex(a,begin,end);
        quickSort(a,begin,index-1);
        quickSort(a,index+1,end);
    }

    private static int getCenterIndex(int[] a, int begin, int end) {
        int privot=a[begin];
        int mark =begin;
       for (int i=begin+1;i<end;i++){
           if(a[i]<privot){
               mark++;
               int temp = a[mark];
               a[mark]=a[i];
               a[i]=temp;
           }
       }
       return 0;
        //return left;
    }
}
