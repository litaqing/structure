package com.lexie.linked;

public class Node {
	// 数据域
	public long data;
	// 指针域
	public Node next;

	public Node(long value) {
		this.data = value;
	}

	// 显示
	public void display() {
		System.out.println(data + " ");
	}

}
