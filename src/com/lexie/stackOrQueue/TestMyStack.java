package com.lexie.stackOrQueue;

public class TestMyStack {
	public static void main(String[] args) {
		/*
		 * MyStack ms =new MyStack(4); ms.push(23); ms.push(12); ms.push(1);
		 * ms.push(90); System.out.println(ms.isEmpty());
		 * System.out.println(ms.isFull());
		 * 
		 * System.out.println(ms.peek()); System.out.println("弹出");
		 * while(!ms.isEmpty()){ System.out.print(ms.pop()+" "); }
		 * 
		 * System.out.println(ms.isEmpty()); System.out.println(ms.isFull());
		 */
		MyQueue mq = new MyQueue();
		mq.insert(23);
		mq.insert(41);
		mq.insert(53);
		mq.insert(2);

		System.out.println(mq.isEmpty());
		System.out.println(mq.isFull());

		System.out.println(mq.peek());

		while (!mq.isEmpty()) {
			System.out.print(mq.remove() + " ");
		}
		mq.insert(45);
		mq.insert(53);
		mq.insert(76);
		System.out.println();
		System.out.println("------------");
		while (!mq.isEmpty()) {
			System.out.print(mq.remove() + " ");
		}

	}
}
