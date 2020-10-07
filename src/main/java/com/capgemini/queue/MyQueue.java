package com.capgemini.queue;

import com.capgemini.interfaces.Inode;
import com.capgemini.linkedlist.MyLinkedList;

public class MyQueue {
	MyLinkedList myLinkedList = new MyLinkedList();

	public void enqueue(Inode node) {
		myLinkedList.append(node);
	}

	public void printQueue() {
		myLinkedList.printList();

	}

	public Inode dequeue() {
		return myLinkedList.pop();

	}

}
