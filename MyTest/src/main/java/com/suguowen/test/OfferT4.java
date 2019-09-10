package com.suguowen.test;

public class OfferT4 {

     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
        TreeNode(int x) { val = x; }
     }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null||in==null||pre.length==0||in.length==0){
            return null;
        }
        return rebuild(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    public static TreeNode rebuild(int[] pre,int i,int j, int[] in, int m, int n){
         int rootVal = pre[i];
         int index = findIndex(pre[i],in,m,n);
        if(index<0){
            return null;
        }
        int leftNodes = index - m, rightNodes = n - index;
        TreeNode root = new TreeNode(rootVal);
        if(leftNodes == 0){
            root.left = null;
        }else{
            root.left = rebuild(pre, i + 1, i + leftNodes, in, m, m + leftNodes - 1);
        }
        if(rightNodes == 0){
            root.right = null;
        }else{
            root.right = rebuild(pre, i + leftNodes + 1, j, in, n - rightNodes + 1, n);
        }
        return root;
    }

     public static int findIndex(int p,int[] in,int m,int n){
         for(int i = m;m<=n;m++){
             if(p==in[i]){
                 return i;
             }
         }
         return -1;
     }

}
