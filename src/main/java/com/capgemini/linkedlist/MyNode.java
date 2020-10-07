package com.capgemini.linkedlist;

import com.capgemini.interfaces.Inode;

public class MyNode<T> implements Inode<T>{
	private T Key;
	private Inode<T> Next;
	
	public MyNode(T Key) {
		this.Key=Key;
	}
	public Inode<T> getNext() {
		return Next;
	}
	
	public void setNext(Inode<T> next) {
		this.Next = next;
	}
	
	public T getKey() {
		return Key;
	}

	public void setKey(T key) {
		this.Key = key;
	}

}
