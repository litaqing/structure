package com.lexie.sort;

public class TestSort {
	public static void main(String[] args) {
		long[] arr = new long[5];
		arr[0] = 34;
		arr[1] = 23;
		arr[2] = 2;
		arr[3] = 1;
		arr[4] = -4;

		System.out.print("{");
		for (long num : arr) {
			System.out.print(num + " ");
		}
		System.out.print("}");
		System.out.println();

		/*
		 * BubbleSort.sort(arr);
		 * 
		 * System.out.println("冒泡排序后：");
		 * 
		 * System.out.print("{"); for (long num : arr) {
		 * System.out.print(num+" "); } System.out.print("}");
		 * System.out.println();
		 */

		/*
		 * SelectionSort.sort(arr);
		 * 
		 * System.out.println("选择排序后：");
		 * 
		 * System.out.print("{"); for (long num : arr) {
		 * System.out.print(num+" "); } System.out.print("}");
		 * System.out.println();
		 * 
		 * BubbleSort.sort(arr);
		 */
		InsertSort.sort(arr);
		System.out.println("插入排序后：");

		System.out.print("{");
		for (long num : arr) {
			System.out.print(num + " ");
		}
		System.out.print("}");
		System.out.println();

		BubbleSort.sort(arr);
	}
}
