package com.capgemini.interfaces;

public interface Inode<T extends Comparable<T>> {
	T getKey();

	void setKey(T Key);

	Inode<T> getNext();

	void setNext(Inode<T> Next);
}