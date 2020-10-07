package com.capgemini.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyTest {

	@Test
	public void Given3Numbers_WhenLinked_ReturnsTrue() {
	MyNode<Integer> MyFirstNode=new MyNode<>(56);
	MyNode<Integer> MySecondNode=new MyNode<>(30);
	MyNode<Integer> MyThirdNode=new MyNode<>(70);
	MyFirstNode.setNext(MySecondNode);
	MySecondNode.setNext(MyThirdNode);
	boolean result=MyFirstNode.getNext().equals(MySecondNode)&&MySecondNode.getNext().equals(MyThirdNode);
	assertEquals(true, result);
	}

}
