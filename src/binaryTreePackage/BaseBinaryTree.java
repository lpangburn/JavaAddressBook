package binaryTreePackage;

/**
 * BaseBinaryTree that contains methods to manipulate the TreeNode root and its left and right children
 */
public class BaseBinaryTree<T> {
	
	//root of this tree
	protected TreeNode<T> root;
	
	//tree with empty root node
	public BaseBinaryTree(){
		
		root = new TreeNode<>();
		
	}
	
	//tree with root node and no children
	public BaseBinaryTree(T rootItem){
		
		this.root = new TreeNode<T>(rootItem, null, null);
	}
	
	//tree with root node and no children
	public BaseBinaryTree(TreeNode<T> tree){
		
		root = tree;
		
	}
	
	
	/**
	 * determines if this tree is empty
	 * @return boolean value indicating if the root of this tree is null
	 */
	public boolean isEmpty(){
		
		return this.root == null;
		
	}
	
	/**
	 * sets the root node of this tree to null.
	 */
	public void makeEmpty(){
		
		this.root = new TreeNode<T>();
	}
	
	
	/**
	 * Returns the object contained in the root of this tree
	 * @return T item in root
	 */
	public T getRoot() throws TreeException{
		
		//determine if there is anything stored in the root
		if(this.root == null){
			
			throw new TreeException("Empty Tree");
			
		}else {
			
			return this.root.getElement();
			
		}
	}
	
	/**
	 * sets the root value of this tree, if there is not one set already.
	 * @param T value to be stored in the root
	 */
	public void setRoot(T val) throws UnsupportedOperationException{
		
		if(val == null){
			
			root.setElement(val);
			
		}else if(root.getElement() != null){
			
			throw new UnsupportedOperationException("Root already has item");
			
		}else{
			
			root.setElement(val);
			
		}
	}
	
}
