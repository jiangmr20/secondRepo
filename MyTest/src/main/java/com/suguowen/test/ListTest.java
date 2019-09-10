package com.suguowen.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    /**
     * 将参数中的偶数全部过滤掉，只留下奇数
     * @param list
     */
    public void foo (List<Integer> list) {
        if(list.size()==0||list==null){
            System.out.println("空数组");
        }

        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                list.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args){
        ListTest l =new ListTest();
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        l.foo(list);
        System.out.println(list);
    }

}
