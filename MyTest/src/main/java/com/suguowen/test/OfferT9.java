package com.suguowen.test;

public class OfferT9 {

    public static double Power(double base, int exponent) {
        double res = 1;
        //指数为0，底数不能为0
        if(exponent==0){
            if(base!=0){
                return 1;
            }else{
                throw new ArithmeticException("0*0 is undefined.");
            }
        }
        //指数为负数，底数不能为0
        if(exponent<0){
            if(base==0){
                throw new ArithmeticException("base can't be zero.");
            }else{
                exponent = -exponent;
                for(int i=1;i<=exponent;i++){
                    res*=base;
                }
                return 1/res;
            }
        }
        //指数大于0时
        for(int i=1;i<=exponent;i++){
            res*=base;
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(Power(-1,5));
    }

}
