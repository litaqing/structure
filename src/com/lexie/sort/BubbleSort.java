package com.lexie.sort;

public class BubbleSort {
	public static void sort(long[] arr){
		long temp=0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = arr.length-1; j >i; j--) {
				temp =arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}
	}
}
