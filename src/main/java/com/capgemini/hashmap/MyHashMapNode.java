package com.capgemini.hashmap;

import com.capgemini.interfaces.Inode;

public class MyHashMapNode<T1 extends Comparable<T1>, T2> implements Inode<T1> {
	T1 Key;
	T2 Value;
	MyHashMapNode<T1, T2> Next;

	public MyHashMapNode(T1 key, T2 value) {
		this.Key = key;
		this.Value = value;
		Next = null;
	}

	@Override
	public T1 getKey() {
		return Key;
	}

	@Override
	public void setKey(T1 Key) {
		this.Key = Key;

	}

	@Override
	public Inode<T1> getNext() {
		return Next;
	}

	@Override
	public void setNext(Inode<T1> Next) {
		this.Next = (MyHashMapNode<T1, T2>) Next;
	}

	public T2 getValue() {
		return Value;
	}

	public void setValue(T2 value) {
		Value = value;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("My Map Node { " + " K = ").append(Key).append(" V = ").append(Value).append(" }");
		if (Next != null)
			str.append("->").append(Next);
		return str.toString();
	}

}
