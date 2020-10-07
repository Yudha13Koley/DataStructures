package com.capgemini.stack;

import com.capgemini.interfaces.Inode;
import com.capgemini.linkedlist.MyLinkedList;

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

	public void pop() {
		myLinkedList.pop();
		
	}

	public int size() {
		return myLinkedList.size();
		
	}
}
