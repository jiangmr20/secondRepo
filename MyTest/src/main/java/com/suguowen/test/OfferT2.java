package com.suguowen.test;

public class OfferT2 {
    public static String replaceSpace1(StringBuffer str) {
        if(str == null){
            System.out.println("没有输入字符串");
            return null;
        }
        //判断空格数量
        if(str.length()==0||str.indexOf(" ")==-1){
            return str.toString();
        }
        //转化成char字符数组
        char[] source = str.toString().toCharArray();
        //空格计数
        int blankCount = 0;
        for(int i=0;i<source.length-1;i++){
            if(source[i]==' '){
                blankCount++;
            }
        }
        //新建字符数组用以插入
        char[] out = new char[source.length+2*blankCount];

        for(int k = out.length - 1,l = source.length - 1;k>=0&&l>=0;k--,l--){
            if(source[l]==' '){
                out[k--]='0';
                out[k--]='2';
                out[k]='%';
            }else {
                out[k] = source[l];
            }
        }
        return new String(out);
    }

    public static void main(String[] args){
        StringBuffer str = new StringBuffer("we are happy");
        String result = replaceSpace1(str);
        System.out.println(result);
    }
}
