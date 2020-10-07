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
	public void Given3Numbers_WhenPoped_ReturnsElement() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(MyFirstNode);
		myLinkedList.append(MySecondNode);
		myLinkedList.append(MyThirdNode);
		myLinkedList.printList();
		Inode result = myLinkedList.pop();
		myLinkedList.printList();
		assertEquals(MyFirstNode, result);
	}

	@Test
	public void Given3Numbers_WhenPopedLast_ReturnsLastElement() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(MyFirstNode);
		myLinkedList.append(MySecondNode);
		myLinkedList.append(MyThirdNode);
		myLinkedList.printList();
		Inode result = myLinkedList.popLast();
		myLinkedList.printList();
		assertEquals(MyThirdNode, result);
	}

	@Test
	public void Given3Numbers_WhenSearchByKey_ReturnsNode() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(MyFirstNode);
		myLinkedList.append(MySecondNode);
		myLinkedList.append(MyThirdNode);
		Inode result = myLinkedList.search(30);
		System.out.println(result.getKey());
		assertEquals(MySecondNode.getKey(), result.getKey());
	}

	@Test
	public void Given3NumbersList_WhenAddNewNumberBetweenNodes_ReturnsTrue() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(MyFirstNode);
		myLinkedList.append(MySecondNode);
		myLinkedList.append(MyThirdNode);
		myLinkedList.printList();
		MyNode<Integer> MyFourthNode = new MyNode<>(40);
		myLinkedList.insertBySearch(30, MyFourthNode);
		myLinkedList.printList();
		boolean result = myLinkedList.search(30).getNext().getKey().equals(40);
		assertEquals(true, result);
	}

	@Test
	public void Given4NumbersList_WhenSearchNodeAndDelete_ReturnsNewListSize() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(40);
		MyNode<Integer> MyFourthNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(MyFirstNode);
		myLinkedList.append(MySecondNode);
		myLinkedList.append(MyThirdNode);
		myLinkedList.append(MyFourthNode);
		myLinkedList.printList();
		myLinkedList.deleteBySearch(40);
		myLinkedList.printList();
		int i = myLinkedList.size();
		assertEquals(3, i);
	}

	@Test
	public void Given4NumbersList_WhenAddedInOrdered_ReturnsNewList() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(40);
		MyNode<Integer> MyFourthNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addInAscendingOrder(MyFirstNode);
		myLinkedList.printList();
		myLinkedList.addInAscendingOrder(MySecondNode);
		myLinkedList.printList();
		myLinkedList.addInAscendingOrder(MyThirdNode);
		myLinkedList.printList();
		myLinkedList.addInAscendingOrder(MyFourthNode);
		myLinkedList.printList();
		boolean result = myLinkedList.getHead().getKey().equals(30) && myLinkedList.getTail().getKey().equals(70);
		assertEquals(true, result);

	}

}
