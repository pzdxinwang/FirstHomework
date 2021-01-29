package com.bjsxt;

public class Sort {
    void BubbleSort(int[] arr) {
    int temp;//定义一个临时变量
    for(int i=0;i<arr.length-1;i++){//外循环
        for(int j=0;j<arr.length-i-1;j++){//内循环
            if(arr[j+1]<arr[j]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
    void show(int[] arr){
        System.out.println("冒泡排序后的结果：");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }
    void insert(int[] arr,int[] arr2){
        int[] NewArr =new int[arr.length+ arr2.length];//新数组的长度为两个数组长度之和
        for (int i = 0;i< arr.length;i++){
            NewArr[i]=arr[i];//数组复制
        }
        for (int i = 0;i< arr2.length;i++){
            NewArr[arr.length+i] = arr2[i];//数组复制
        }

        BubbleSort(NewArr);
        System.out.print("插入数字");
        for (int i=0;i< NewArr.length;i++){
            System.out.print(NewArr[i] + " ");
        }
        System.out.print("后排序的结果为");
    }
}



