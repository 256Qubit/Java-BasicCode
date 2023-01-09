package com.arraytest.mode;


public class lianxi {
    public static void main(String[] args) {
        //声明并且初始化数组
        int[][]arr=new int[10][];
        //给数组的元素赋值
        for(int i=0;i< arr.length;i++){
            arr[i]=new int[i+1];
            arr[i][0]=arr[i][i]=1;
            if(i>1){
                for(int k=1;k<arr[i].length-1;k++){
                    arr[i][k]=arr[i-1][k-1]+arr[i-1][k];
                }
            }
        }
        //遍历数组
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
