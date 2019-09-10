package com.suguowen.test;

public class JiangTest {

    String str = new String("good");
    char[] ch = {'a','b','c'};



    public void change(String str,char ch[ ]){
        str = "test ok";
        ch[0] = 'g';
    }


    public static boolean find1(int target, int [][] array) {
        boolean result = false;
        if (array == null) {
            return result;
        }
        int i = array[0].length;
        int j = array.length;
        int a = 0;
        int b = 0;
        while(b<j){
            while(a<i&&target>=array[b][a]){
                if(target==array[b][a]){
                    result = true;
                    break;
                }else{
                    a++;
                }
            }
            if(target==array[b][a]){
                break;
            }else{
                b++;
                a=0;
            }
        }
        return result;
    }

    public static boolean find2(int target,int[][] array){
        //boolean result = false;
        //鲁棒性，判断输入的数据是否合法
        if(array==null||array[0]==null||array.length==0||array[0].length==0){
            return false;
        }
        int i = 0;
        int j = array[0].length - 1;
        while(i!=array.length-1&&j!=0){
            if(target<array[i][j]){
                j--;
            }else if(target>array[i][j]){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};//定义二维数组用来测试
        int target = 7;
        System.out.println(find2(target,array));
    }

}
