package com.capgemini.stack;

import com.capgemini.interfaces.Inode;
import com.capgemini.linkedlist.MyLinkedList;

public class MyStack<K extends Comparable<K>> {
	private MyLinkedList<K> myLinkedList = new MyLinkedList<>();

	public void push(Inode<K> node) {
		myLinkedList.add(node);

	}

	public void printSatck() {
		myLinkedList.printList();
	}

	public Inode<K> peak() {
		return myLinkedList.getHead();
	}

	public Inode<K> pop() {
		return myLinkedList.pop();

	}

	public int size() {
		return myLinkedList.size();

	}
}
