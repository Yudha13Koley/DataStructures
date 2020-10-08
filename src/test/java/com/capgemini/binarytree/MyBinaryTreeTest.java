package com.capgemini.binarytree;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyBinaryTreeTest {

	@Test
	public void Given3Numbers_WhenAddedToTheTree_ShouldReturnSize3() {
		BinaryTree<Integer> myBinaryTree = new BinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		assertEquals(3, size);

	}

	@Test
	public void GivenNumbersArray_WhenAddedToTheTree_ShouldReturnSize3() {
		BinaryTree<Integer> myBinaryTree = new BinaryTree<>();
		Integer[] nums = { 56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67 };
		int count = 0;
		for (Integer i : nums) {
			myBinaryTree.add(i);
			count++;
		}
		int size = myBinaryTree.getSize();
		assertEquals(count, size);
	}

	@Test
	public void GivenNumbersArray_WhenSearchedForAKey_ShouldReturnKey() {
		BinaryTree<Integer> myBinaryTree = new BinaryTree<>();
		Integer[] nums = { 56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67 };
		int count = 0;
		for (Integer i : nums) {
			myBinaryTree.add(i);
			count++;
		}
		MyBinaryNode<Integer> result = myBinaryTree.search(63);
		assertEquals(63, result.key.intValue());
	}

}
