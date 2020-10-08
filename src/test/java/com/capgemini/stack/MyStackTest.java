package com.capgemini.stack;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.interfaces.Inode;
import com.capgemini.linkedlist.MyNode;

public class MyStackTest {

	@Test
	public void Given3Numbers_WhenAddedIntoTheStack_ReturnsTheLastAdded() {
		MyStack<Integer> myStack = new MyStack<Integer>();
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		myStack.push(MyFirstNode);
		myStack.push(MySecondNode);
		myStack.push(MyThirdNode);
		myStack.printSatck();
		Inode<Integer> result=myStack.peak();
		assertEquals(MyThirdNode,result);
	}
	
	@Test
	public void Given3Numbers_WhenPoped_ReturnsNewStack() {
		MyStack<Integer> myStack = new MyStack<Integer>();
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		myStack.push(MyFirstNode);
		myStack.push(MySecondNode);
		myStack.push(MyThirdNode);
		myStack.printSatck();
		myStack.pop();
		myStack.printSatck();
		myStack.pop();
		myStack.printSatck();
		Inode<Integer> result=myStack.pop();
		assertEquals(MyFirstNode,result);
		
	}

}
