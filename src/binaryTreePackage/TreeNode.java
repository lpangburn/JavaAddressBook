package binaryTreePackage;

/**
 * creates a basic tree node with a stored element, and left and right node children
 */
public class TreeNode<E> {
	
	private E element;
	private TreeNode<E> left, right;
	
	/**
	 * creates a TreeNode object with no stored element or children
	 */
	TreeNode(){
		
		this(null,null,null);
		
	}
	
	/**
	 * creates a TreeNode with an object to be used as the stored element
	 * @param E item to be used as the element for this node
	 */
	TreeNode(E item){
		
		this(item, null, null);
		
	}
	
	/**
	 * Creates a TreeNode with an element, and left and right children nodes
	 * @param E item to be stored as the element of this node
	 * @param TreeNode left node to be used as left child
	 * @param TreeNode right node to be used as right child
	 */
	TreeNode(E item, TreeNode<E> left, TreeNode<E> right){
		
		element = item;
		
		this.left = left;
		this.right = right;
		
	}
	
	/**
	 * overwrites this node with the data from another node
	 */
	TreeNode(TreeNode<E> node){
		
		element = node.getElement();
		left = node.getLeft();
		right = node.getRight();
		
	}
	
	/**
	 * returns the element stored in this node
	 * @return E element stored in this node
	 */
	public E getElement(){
		
		return this.element;
		
	}
	
	/**
	 * sets the element stored in this node
	 * @param E item to be stored in this node
	 */
	public void setElement(E item){
		
		this.element = item;
		
	}
	
	/**
	 * gets the node in the right child of this node
	 * @return TreeNode node in the right child
	 */
	public TreeNode<E> getRight(){
		
		return this.right;
		
	}
	
	/**
	 * gets the node in the left child of this node
	 * @return TreeNode node stored in the left child
	 */
	public TreeNode<E> getLeft(){
		
		return this.left;	
	}
	
	/**
	 * creates and stores a new node in the right child of this node
	 * @param E right object to be stored in the node of the right child
	 */
	public void setRight(E right){
		
		TreeNode<E> r = new TreeNode<>(right);
		this.right = r;
		
	}
	
	/**
	 * creates and stores a new node in the left child of this node
	 * @param E left object to be stored in the node of the left child
	 */
	public void setLeft(E left){
		
		TreeNode<E> l = new TreeNode<>(left);
		this.left = l;
		
	}
	
	/**
	 * stores a new node in the right child of this node
	 * @param TreeNode rightNode object to be stored in the node of the right child
	 */
	public void setRight(TreeNode<E> rightNode){
		
		this.right = rightNode;
		
	}
	
	/**
	 * stores a new node in the left child of this node
	 * @param TreeNode leftNode object to be stored in the node of the left child
	 */
	public void setLeft(TreeNode<E> leftNode){
		
		this.left = leftNode;
	}

}
