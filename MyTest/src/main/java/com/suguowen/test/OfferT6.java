package com.suguowen.test;

public class OfferT6 {
    public static int minNumberInRotateArray(int [] array) {
        if(array==null||array.length==0){
            return 0;
        }
        if(array.length == 1 || array[0] < array[array.length - 1]){
            return array[0];
        }
        int l=0, r=array.length-1, mid;
        while(r>l&&r-l!=1){
            mid = 1+((r-l)>>1);
            if(array[l+1]>array[l]&&array[mid]>=array[l]){
                l=mid;
            }else{
                r=mid;
            }
        }
        return array[r];
    }
}
