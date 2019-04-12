package com.lexie.stackOrQueue;

public class MyQueue {
	// 底层是数组
	private long[] arr;
	// 有效数据
	private int elements;
	// 队头
	private int front;
	// 队尾
	private int end;

	public MyQueue() {
		arr = new long[10];
		elements = 0;
		front = 0;
		end = -1;
	}

	public MyQueue(int maxsize) {
		arr = new long[maxsize];
		elements = 0;
		front = 0;
		end = -1;
	}

	public void insert(long value) {
		if (end == arr.length - 1) {
			end = -1;
		}
		arr[++end] = value;
		elements++;
	}

	public long remove() {
		long value = arr[front++];
		if (front == arr.length - 1) {
			front = 0;
		}
		elements--;
		return value;
	}

	// 查看，从队头查看
	public long peek() {
		return arr[front];
	}

	public boolean isEmpty() {
		return elements == 0;
	}

	public boolean isFull() {
		return elements == arr.length;
	}
}
