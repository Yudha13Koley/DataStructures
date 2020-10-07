package com.capgemini.interfaces;

public interface Inode<T> {
	T getKey();
	void setKey(T Key);
	 
	Inode<T> getNext();
	void setNext(Inode<T> Next);
}
