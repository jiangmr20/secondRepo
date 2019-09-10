package com.suguowen.test;

public class OfferT7 {

    public static int Fibonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

    public static int Fibonacci2(int n) {
        int count = 1;
        int fiTotal0 = 0;
        int fiTotal1 = 1;
        int fiTotal2 = 0;
        while(count<n){
            fiTotal2 = fiTotal1 + fiTotal0;
            fiTotal1 = fiTotal2;
            fiTotal0 = fiTotal1;
            count++;
        }
        return fiTotal2;
    }

}
