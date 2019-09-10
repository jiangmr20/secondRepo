package com.suguowen.test;

public class OfferT10 {

    public static void reOrderArray(int [] array) {
        if(array == null||array.length==0){
            return;
        }
        for(int i = 1 ; i < array.length ; i++){
            for(int j = i ; j >= 1 ; j--){
                if(array[j] % 2 == 1 && array[j - 1] % 2 == 0){
                    swap(array, j, j - 1);
                }
            }
        }
    }

    public static void swap(int[] array,int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
