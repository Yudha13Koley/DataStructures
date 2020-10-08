package com.capgemini.hashmap;

import com.capgemini.linkedlist.MyLinkedList;

public class MyHashMap<T1 extends Comparable<T1>, T2> {

	MyLinkedList<T1> mylinkedlist;

	public MyHashMap() {
		this.mylinkedlist = new MyLinkedList<>();
	}

	public T2 get(T1 key) {
		MyHashMapNode<T1, T2> myHashMapNode = (MyHashMapNode<T1, T2>) mylinkedlist.search(key);
		return (myHashMapNode == null) ? null : myHashMapNode.getValue();
	}

	public void add(T1 word, T2 value) {
		MyHashMapNode<T1, T2> myHashMapNode = (MyHashMapNode<T1, T2>) mylinkedlist.search(word);
		if (myHashMapNode == null) {
			myHashMapNode = new MyHashMapNode<T1, T2>(word, value);
			this.mylinkedlist.append(myHashMapNode);
		} else {
			myHashMapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "My Hash Map Nodes { " + mylinkedlist + "}";
	}

}
