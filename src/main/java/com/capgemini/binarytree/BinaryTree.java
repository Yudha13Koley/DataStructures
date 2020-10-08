package com.capgemini.binarytree;

public class BinaryTree<T extends Comparable<T>> {
	private MyBinaryNode<T> root;
	public void add(T i) {
		this.root=this.addRecursively(root,i);
	}
	private MyBinaryNode<T> addRecursively(MyBinaryNode<T> curr, T i) {
		if(curr==null)
			return new MyBinaryNode<>(i);
		int result=i.compareTo(curr.key);
		if(result==0)
			return curr;
		if(result<0)
			curr.left=addRecursively(curr.left, i);
		else
			curr.right=addRecursively(curr.right, i);
		return curr;
	}
	
	public int getSize() {
		return this.getSizeRecursively(root);
	}
	private int getSizeRecursively(MyBinaryNode<T> curr) {
		return 	(curr==null)?0:1+this.getSizeRecursively(curr.left)+this.getSizeRecursively(curr.right);
	}
	

}
