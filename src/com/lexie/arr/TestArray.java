package com.lexie.arr;

public class TestArray {
	public static void main(String[] args) {
		MyArray arr =new MyArray();
		arr.insert(13);
		arr.insert(34);
		arr.insert(90);
		
		
		arr.display();
		System.out.println(arr.search(90));
		
		System.out.println(arr.get(1));
		
		arr.delete(2);
		arr.display();
		
		arr.changge(0, 12);
		arr.display();
		
		System.out.println("有序数组测试----------------------");
	
		MyOrderArray order = new MyOrderArray();
		order.insert(90);
		order.insert(30);
		order.insert(80);
		order.insert(10);
		order.display();
		
		System.out.println(order.binarySearch(90));
	
	}
}
