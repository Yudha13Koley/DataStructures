package com.capgemini.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

import com.capgemini.interfaces.Inode;

public class MyTest {

	@Test
	public void Given3Numbers_WhenLinked_ReturnsTrue() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		MyFirstNode.setNext(MySecondNode);
		MySecondNode.setNext(MyThirdNode);
		boolean result = MyFirstNode.getNext().equals(MySecondNode) && MySecondNode.getNext().equals(MyThirdNode);
		assertEquals(true, result);
	}

	@Test
	public void Given3Numbers_WhenAddedToTheFrontSequentially_PrintsList() {
		MyNode<Integer> MyFirstNode = new MyNode<>(70);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(MyFirstNode);
		myLinkedList.add(MySecondNode);
		myLinkedList.add(MyThirdNode);
		myLinkedList.printList();
		boolean result = myLinkedList.getHead().equals(MyThirdNode)
				&& myLinkedList.getHead().getNext().equals(MySecondNode)
				&& myLinkedList.getHead().getNext().getNext().equals(MyFirstNode)
				&& myLinkedList.getTail().equals(MyFirstNode);
		assertEquals(true, result);

	}

	@Test
	public void Given3Numbers_WhenAppendToTheRearEnd_ReturnsTrue() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(MyFirstNode);
		myLinkedList.append(MySecondNode);
		myLinkedList.append(MyThirdNode);
		myLinkedList.printList();
		boolean result = myLinkedList.getHead().equals(MyFirstNode)
				&& myLinkedList.getHead().getNext().equals(MySecondNode)
				&& myLinkedList.getHead().getNext().getNext().equals(MyThirdNode)
				&& myLinkedList.getTail().equals(MyThirdNode);
		assertEquals(true, result);
	}

	@Test
	public void GivenANodeInsertAfterANode_WhenDone_ReturnsTrue() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(MyFirstNode);
		myLinkedList.append(MyThirdNode);
		myLinkedList.printList();
		myLinkedList.insert(MyFirstNode, MySecondNode);
		myLinkedList.printList();
		boolean result = myLinkedList.getHead().equals(MyFirstNode)
				&& myLinkedList.getHead().getNext().equals(MySecondNode)
				&& myLinkedList.getHead().getNext().getNext().equals(MyThirdNode)
				&& myLinkedList.getTail().equals(MyThirdNode);
		assertEquals(true, result);
	}
	
	@Test
	public void Given3Numbers_WhenPoped_ReturnsNewList() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(MyFirstNode);
		myLinkedList.append(MySecondNode);
		myLinkedList.append(MyThirdNode);
		myLinkedList.printList();
		Inode result=myLinkedList.pop();
		myLinkedList.printList();
		assertEquals(MyFirstNode,result);
	}
}
