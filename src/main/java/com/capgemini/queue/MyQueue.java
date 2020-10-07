package com.capgemini.queue;

import com.capgemini.interfaces.Inode;
import com.capgemini.linkedlist.MyLinkedList;
import com.capgemini.linkedlist.MyNode;

public class MyQueue {
	MyLinkedList myLinkedList = new MyLinkedList();

	public void enqueue(Inode node) {
		myLinkedList.append(node);
	}

	public void printQueue() {
		myLinkedList.printList();

	}


}
