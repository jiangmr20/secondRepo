package com.suguowen.test;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public int search (List<Integer> list, int key) {
        if(list.size()==0||list==null){
            return -1;//代表数组输入有误
        }

        int x = 0,y = list.size()-1; //设置左右指针
        while(x<=y){
            int mid = (x+y)/2;
            if(key==list.get(mid)){
                return mid;
            }else if(key>list.get(mid)){
                x = mid+1;
            }else{
                y = mid-1;
            }
        }

        return -2;//代表未找到
    }

    public static void main(String[] args){
        BinarySearch b = new BinarySearch();
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println(b.search(list,5));
    }
}
