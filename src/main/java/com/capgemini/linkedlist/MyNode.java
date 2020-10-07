package com.capgemini.linkedlist;

public class MyNode<T> {
	private T key;
	private MyNode<T> next;
	
	public MyNode<T> getNext() {
		return next;
	}
	
	public void setNext(MyNode<T> next) {
		this.next = next;
	}
	
	public MyNode(T key) {
	this.setKey(key);
	this.next=null;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

}
