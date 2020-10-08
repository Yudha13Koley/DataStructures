package com.capgemini.queue;

import com.capgemini.interfaces.Inode;
import com.capgemini.linkedlist.MyLinkedList;

public class MyQueue<K extends Comparable<K>> {
	MyLinkedList<K> myLinkedList = new MyLinkedList<>();

	public void enqueue(Inode<K> node) {
		myLinkedList.append(node);
	}

	public void printQueue() {
		myLinkedList.printList();

	}

	public Inode<K> dequeue() {
		return myLinkedList.pop();

	}

}
