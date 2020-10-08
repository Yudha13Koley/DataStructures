package com.capgemini.linkedlist;

import com.capgemini.interfaces.Inode;

public class MyLinkedList<K extends Comparable<K>> {
	private Inode<K> head;
	private Inode<K> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public Inode<K> getHead() {
		return head;
	}

	public void setHead(Inode<K> head) {
		this.head = head;
	}

	public Inode<K> getTail() {
		return tail;
	}

	public void setTail(Inode<K> tail) {
		this.tail = tail;
	}

	public void add(Inode<K> node) {
		if (this.tail == null)
			this.tail = node;
		if (this.head == null)
			this.head = node;
		else {
			Inode<K> temp = this.head;
			this.head = node;
			this.head.setNext(temp);
		}
	}

	public void printList() {
		if (this.head == null)
			System.out.println("Empty !");
		else {
			StringBuffer myNodes = new StringBuffer("My Nodes : ");
			Inode<K> temp = head;
			while (temp.getNext() != null) {
				myNodes.append(temp.getKey());
				if (!temp.equals(tail))
					myNodes.append("->");
				temp = temp.getNext();
			}
			myNodes.append(temp.getKey());
			System.out.println(myNodes);
		}
	}

	public void append(Inode<K> node) {
		if (this.tail == null)
			this.tail = node;
		if (this.head == null)
			this.head = node;
		else {
			this.tail.setNext(node);
			this.tail = node;
		}

	}

	public void insert(Inode<K> node, Inode<K> newnode) {
		Inode<K> temp = node.getNext();
		node.setNext(newnode);
		newnode.setNext(temp);
	}

	public Inode<K> pop() {
		Inode<K> temp = this.head;
		this.head = temp.getNext();
		return temp;
	}

	public Inode<K> popLast() {
		Inode<K> temp = this.head;
		Inode<K> temp2 = null;
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

	public Inode<K> search(K i) {
		Inode<K> temp = this.head;
		if (temp == null)
			return null;
		while (temp.getNext() != null) {
			if (temp.getKey().equals(i))
				return temp;
			temp = temp.getNext();
		}
		if (i.equals(this.tail.getKey()))
			return this.tail;
		else
			return null;
	}

	public void insertBySearch(K i, Inode<K> newNode) {
		insert(search(i), newNode);

	}

	public void deleteBySearch(K i) {
		Inode<K> searchRes = search(i);
		Inode<K> temp = this.head;
		if (temp.getNext() == null || searchRes.equals(temp))
			pop();
		else if (searchRes.equals(tail))
			popLast();
		else {
			while (temp.getNext() != null) {
				if (temp.getNext().equals(searchRes)) {
					temp.setNext(searchRes.getNext());
					break;
				}
				temp = temp.getNext();
			}
		}
	}

	public int size() {
		Inode<K> temp = this.head;
		int count = 1;
		if (this.head == null)
			return 0;
		else if (this.head.equals(this.tail))
			return 1;
		else {
			while (temp.getNext() != null) {
				count++;
				temp = temp.getNext();
			}
			return count;
		}
	}

	public void addInDescendingOrder(Inode<K> node) {
		if (this.head == null || node.getKey().compareTo(this.head.getKey()) > 0)
			add(node);
		else {
			Inode<K> temp = this.head;
			while (temp.getNext() != null) {
				if (node.getKey().compareTo(temp.getNext().getKey()) > 0) {
					insert(temp, node);
					break;
				}
				temp = temp.getNext();
			}
			if (temp.getNext() == null)
				append(node);
		}
	}

	public void addInAscendingOrder(Inode<K> node) {
		if (this.head == null || node.getKey().compareTo(this.head.getKey()) < 0)
			add(node);
		else {
			Inode<K> temp = this.head;
			while (temp.getNext() != null) {
				if (node.getKey().compareTo(temp.getNext().getKey()) < 0) {
					insert(temp, node);
					break;
				}
				temp = temp.getNext();
			}
			if (temp.getNext() == null)
				append(node);
		}
	}

	@Override
	public String toString() {
		return "My Linked List Nodes {" + head + "}";
	}

}
