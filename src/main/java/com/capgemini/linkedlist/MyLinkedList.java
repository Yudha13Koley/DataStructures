package com.capgemini.linkedlist;

import com.capgemini.interfaces.Inode;

public class MyLinkedList {
	private Inode head;
	private Inode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public Inode getHead() {
		return head;
	}

	public void setHead(Inode head) {
		this.head = head;
	}

	public Inode getTail() {
		return tail;
	}

	public void setTail(Inode tail) {
		this.tail = tail;
	}

	public void add(Inode node) {
		if (this.tail == null)
			this.tail = node;
		if (this.head == null)
			this.head = node;
		else {
			Inode temp = this.head;
			this.head = node;
			this.head.setNext(temp);
		}
	}

	public void printList() {
		StringBuffer myNodes = new StringBuffer("My Nodes : ");
		Inode temp = head;
		while (temp.getNext() != null) {
			myNodes.append(temp.getKey());
			if (!temp.equals(tail))
				myNodes.append("->");
			temp = temp.getNext();
		}
		myNodes.append(temp.getKey());
		System.out.println(myNodes);
	}

	public void append(Inode node) {
		if (this.tail == null)
			this.tail = node;
		if (this.head == null)
			this.head = node;
		else {
			this.tail.setNext(node);
			this.tail = node;
		}

	}

	public void insert(Inode node, Inode newnode) {
		Inode temp = node.getNext();
		node.setNext(newnode);
		newnode.setNext(temp);
	}

	public Inode pop() {
		Inode temp = this.head;
		this.head = temp.getNext();
		return temp;
	}

	public Inode popLast() {
		Inode temp = this.head;
		Inode temp2 = null;
		while (temp.getNext() != null) {
			if (temp.getNext().equals(this.tail)) {
				temp2 = temp.getNext();
				this.tail = temp;
				temp.setNext(null);
				break;
			}
			temp = temp.getNext();
		}
		return temp2;
	}

	public Inode search(Integer i) {
		Inode temp = this.head;
		while (temp.getNext() != null) {
			if (temp.getKey().equals(i))
				break;
			temp = temp.getNext();
		}
		if (!temp.equals(this.tail))
			return temp;
		else
			return null;
	}

	public void insertBySearch(Integer i, Inode newNode) {
		insert(search(i), newNode);

	}

}
