package com.capgemini.queue;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.interfaces.Inode;
import com.capgemini.linkedlist.MyNode;

public class MyQueueTest {

	@Test
	public void Given3Numbers_WhenEnqueue_AddsNodeAtLast() {
		MyQueue<Integer> myQueue = new MyQueue<>();
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		myQueue.enqueue(MyFirstNode);
		myQueue.enqueue(MySecondNode);
		myQueue.enqueue(MyThirdNode);
		myQueue.printQueue();
	}

	@Test
	public void Given3Numbers_WhenDequeue_DeletesNodeFromLast() {
		MyQueue<Integer> myQueue = new MyQueue<>();
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		myQueue.enqueue(MyFirstNode);
		myQueue.enqueue(MySecondNode);
		myQueue.enqueue(MyThirdNode);
		myQueue.printQueue();
		Inode<Integer> result = myQueue.dequeue();
		myQueue.printQueue();
		assertEquals(MyFirstNode, result);
	}

}
