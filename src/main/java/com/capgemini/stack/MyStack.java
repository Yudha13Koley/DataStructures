package com.capgemini.stack;

import com.capgemini.interfaces.Inode;
import com.capgemini.linkedlist.MyLinkedList;
import com.capgemini.linkedlist.MyNode;

public class MyStack {
	private MyLinkedList myLinkedList = new MyLinkedList();

	public void push(Inode node) {
		myLinkedList.add(node);

	}

	public void printSatck() {
		myLinkedList.printList();
	}

	public Inode peak() {
		return myLinkedList.getHead();
	}
}
