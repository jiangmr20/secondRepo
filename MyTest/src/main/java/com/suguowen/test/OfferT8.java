package com.suguowen.test;

public class OfferT8 {

    public int JumpFloorII(int target) {
        if(target<=0){
            return 0;
        }
        if(target==0){
            return 1;
        }
        int res = 0;
        for(int i=1;i<=target;i++){
            res += JumpFloorII(target-i);
        }
        return res;
    }

}
