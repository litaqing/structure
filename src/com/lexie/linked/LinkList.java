package com.lexie.linked;

public class LinkList {
	// 头结点
	private Node first;

	public LinkList() {
		first = null;
	}

	// 插入一个结点，在头节点之后插入
	public void insertFirst(long value) {
		Node node = new Node(value);
		if (first == null) {
			first = node;
		}
		node.next = first.next;
		first.next = node;
	}

	// 删除一个结点，在头节点后删除
	public Node deleteFirst() {
		Node temp = first.next;
		first.next = temp.next;
		return temp;
	}

	// 显示
	public void display() {
		Node current = first;
		while (current.next != null) {
			current.display();
			current = current.next;
		}
	}
}
