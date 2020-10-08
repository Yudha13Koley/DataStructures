package com.capgemini.linkedhashmap;

import java.util.ArrayList;

import com.capgemini.hashmap.MyHashMapNode;
import com.capgemini.linkedlist.MyLinkedList;

public class LinkedHashMap<K extends Comparable<K>, V> {
	private final int numBuckets;
	ArrayList<MyLinkedList<K>> myBucketArray;

	public LinkedHashMap() {
		numBuckets = 10;
		myBucketArray = new ArrayList<>(numBuckets);
		for (int i = 0; i < numBuckets; i++) {
			this.myBucketArray.add(null);
		}
	}

	public V get(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null)
			return null;
		MyHashMapNode<K, V> mynode = (MyHashMapNode<K, V>) myLinkedList.search(key);
		return (mynode == null) ? null : mynode.getValue();

	}

	public int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		//System.out.println("Key : " + key + " HashCode :" + hashCode + " Index " + index);
		return index;
	}

	public void add(K word, V value) {
		int index = this.getBucketIndex(word);
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			myLinkedList = new MyLinkedList<>();
			this.myBucketArray.set(index, myLinkedList);
		}
		MyHashMapNode<K, V> myHashNode = (MyHashMapNode<K, V>) myLinkedList.search(word);
		if (myHashNode == null) {
			myHashNode = new MyHashMapNode<>(word, value);
			myLinkedList.append(myHashNode);
		} else {
			myHashNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "My Linked Hash Map { "+myBucketArray+" }";
	}
	

}
