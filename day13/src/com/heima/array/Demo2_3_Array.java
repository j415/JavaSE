/*
        * public static String toString(int[] a)
        * public static void sort(int[] a)
        * public static int binarySearch(int[] a,int key)
        *
		*  public static String toString(int[] a) {
		        if (a == null)								//如果传入的数组是null
		            return "null";							//返回null
		        int iMax = a.length - 1;					//iMax最大索引
		        if (iMax == -1)								//如果数组中没有元素
		            return "[]";							//返回[]

		        StringBuilder b = new StringBuilder();		//线程不安全,效率高
		        b.append('[');								//将[添加到字符串缓冲区中
		        for (int i = 0; ; i++) {					//遍历数组,判断语句没有写默认是true
		            b.append(a[i]);							//把第一个元素添加进字符串缓冲区
		            if (i == iMax)							//如果索引等于了最大索引值
		                return b.append(']').toString();	//将]添加到字符串缓冲区,在转换成字符串并返回
		            b.append(", ");							//如果不等于最大索引就将, 添加到缓冲区
		        }
    		}

    	* private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
		        int low = fromIndex;				//最小索引0
		        int high = toIndex - 1;				//最大索引数组长度-1

		        while (low <= high) {				//最小索引小于等于最大索引可以循环判断
		            int mid = (low + high) >>> 1;	//求出中间索引值,(最小+最大)/2
		            int midVal = a[mid];			//通过中间索引获取中间值

		            if (midVal < key)				//中间索引对应的值小于查找的值
		                low = mid + 1;				//最小索引变化
		            else if (midVal > key)			//中间索引对应的值大于查找的值
		                high = mid - 1;				//最大索引变化
		            else
		                return mid; // key found	//找到了
		        }
		        return -(low + 1);  // key not found.//-插入点 - 1
		    }
        */
package com.heima.array;

import java.util.Arrays;

public class Demo2_3_Array {
    public static void main(String[] args) {
        int[] arr = {23, 45, 12, 56, 34, 67, 78};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 45));
        System.out.println(Arrays.binarySearch(arr, 89));
        System.out.println(Arrays.binarySearch(arr, 33));

    }
}
