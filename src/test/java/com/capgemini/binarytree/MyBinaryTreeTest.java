package com.capgemini.binarytree;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyBinaryTreeTest {

	@Test
	public void Given3Numbers_WhenAddedToTheTree_ShouldReturnSize3() {
	BinaryTree<Integer> myBinaryTree=new BinaryTree<>();
	myBinaryTree.add(56);
	myBinaryTree.add(30);
	myBinaryTree.add(70);
	int size=myBinaryTree.getSize();
	assertEquals(3,size);
	
	}

}
