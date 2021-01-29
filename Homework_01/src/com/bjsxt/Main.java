package com.bjsxt;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String[] arrs;
        System.out.println("请输入一串数字（以空格分隔）：");
        arrs=reader.nextLine().split(" ");
        int arr[]=new int[arrs.length];

        for (int i = 0;i<arr.length;i++){
            arr[i] = Integer.valueOf(arrs[i]);
        }

        new Sort().BubbleSort(arr);//进行冒泡排序并输出
        new Sort().show(arr);

        System.out.println("请输入另一串数字（以空格分隔）：");
        String[] new_arrs;
        new_arrs=reader.nextLine().split(" ");
        int new_arr[]=new int[new_arrs.length];

        for (int i = 0;i<new_arr.length;i++){
            new_arr[i] = Integer.valueOf(new_arrs[i]);
        }
        new Sort().insert(arr,new_arr);//插入并进行排序
    }
}