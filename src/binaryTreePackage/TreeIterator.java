package binaryTreePackage;

import java.util.LinkedList;

/**
 * defines multiple ways to iterate through a binary tree, inOrder, preOrder, and postOrder
 */
public class TreeIterator<E> {

	private BaseBinaryTree<E> tree;
	private LinkedList<TreeNode<E>> list;
	
	/**
	 * creates an empty iterator with empty list
	 */
	public TreeIterator(){
		
		tree = new BaseBinaryTree<>();
		list.clear();
		
	}
	
	/**
	 * creates a tree iterator with an exising basebinarytree
	 * @param BaseBinaryTree<E> existing base binary tree
	 */
	public TreeIterator(BaseBinaryTree<E> tree){
		
		this.tree = tree;
		
	}
	
	/**
	 * returns the number of items in the iterator
	 * @return int number of items in the list
	 */
	public int size(){
		
		return list.size();
		
	}
	
	/**
	 * returns the next value in the list
	 * @return E pops next item off a linked list
	 */
	public E next(){
		
		return this.list.pop().getElement();
	
	}
	
	/**
	 * checks to see if there are more items in the list
	 * @return boolean true if list size is 0
	 */
	public boolean hasNext(){
		
		return list.size() == 0;
		
	}

	/**
	 * call this method for preorder traversal
	 * root->left->right
	 */
	public void preOrder(){
		
		//empties the linkedlist for a preorder list to be passed to
		 list = new LinkedList<>();
	     this.preorder(this.tree.root);
	     
	}
	
	/**
	 * call this method for inOrder traversal
	 * left->root->right
	 */
	public void inOrder(){
		
		//empties the linkedlist for a inOrder list to be passed to
		list = new LinkedList<>();
	    this.inorder(this.tree.root);
	    
	}
	
	/**
	 * call this method for postOrder traversal
	 * left->right->root
	 */
	public void postOrder(){
		
		//empties the linkedlist for a postOrder list to be passed to
		list = new LinkedList<>();
	    this.postorder(this.tree.root);
	     
	}
	
	/**
	 * defines preOrder traversal
	 * @param TreeNode<E> node root to start with
	 */
	private void preorder(TreeNode<E> node){
		
		if(node != null){
			
			//adds the root
			list.add(node);
			//descends the left tree, and adds it to the list
			preorder(node.getLeft());
			//descends the right tree, and adds it to the list
			preorder(node.getRight());
			
		}
		
	}
	
	/**
	 * defines inOrder traversal
	 * @param TreeNode<E> node root to start with
	 */
	private void inorder(TreeNode<E> node) {
		
		if(node != null){
			//traverses the left node, adds it to the list
		    inorder(node.getLeft());
		    //adds the root to the list
		    this.list.add(node);
		    //traverses the right tree, adds it to the list
		    inorder(node.getRight());
		    	
		}
	 }

	/**
	 * defines postOrder traversal
	 * @param TreeNode<E> node root to start with
	 */
	private void postorder(TreeNode<E> node) {
		
		if(node != null){
			
			//descends the left tree, adds it to the list
			postorder(node.getLeft());
			//descends the right tree, adds it to the list
			postorder(node.getRight());
			//adds the root to the list
		    this.list.add(node);
		    	
		}
	} 	
	
}
