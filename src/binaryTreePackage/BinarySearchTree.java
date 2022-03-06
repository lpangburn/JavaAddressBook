package binaryTreePackage;

public class BinarySearchTree<E extends Comparable<E>> {
	
	//creates new base binary tree with an empty root and two children
	BaseBinaryTree<E> tree = new BaseBinaryTree<>();
	
	//constructor method for empty tree
	public BinarySearchTree(){
		
		tree = new BaseBinaryTree<>();
		
	}
	
	//constructor method with an existing node to be used as the root
	public BinarySearchTree(TreeNode<E> newTree){
		
		tree = new BaseBinaryTree<>(newTree);
	
	}

	/**
	 * adds an item to the tree
	 * @param E data to be added of generic type
	 */
	public void add(E data) throws TreeException{
		
		//if there is no root, make this item the root
		if(tree.getRoot() == null){
			
			tree.setRoot(data);
		
		//if the root exists, pass data through the addTree method to set either the left or right child as a new tree
		}else{
			
			this.addTree(data);			
			
		}
		
	}
	
	/**
	 * finds a contact in a list, and returns the contact. returns a null contact if the name is not found
	 * @param String name to search for
	 * @return Contact object representing found contact, or null contact object if name is not found
	 */
	public Contact find(String name) throws TreeException{
		
		@SuppressWarnings("unchecked")
		TreeIterator<Contact> list = (TreeIterator<Contact>) this.iteratorIn();
		//create a null contact
		Contact contact = new Contact();
		
		while(list.size() != 0){
			
			//creates a new contact with the current contact in list being compared to
			Contact foundContact = list.next();
			String ctName = foundContact.getFirst();
			
			//if the searched name matches the first name of the contact being compared to, return this contact
			if(ctName.compareToIgnoreCase(name) == 0){
				return foundContact;
			}
		}
		
		//otherwise, return the null contact
		return contact;

	}

	/**
	 * removes a contact 
	 * @param Contact name contact to be removed
	 * @param TreeNode<Contact> root of tree to be searched
	 * @return TreeNode<Contact> node representing the root of the new tree
	 */
	public TreeNode<Contact> remove(Contact name, TreeNode<Contact> root){
		
		if(root == null){
			return root;
		}
		
		if(name.compareTo(root.getElement()) > 0){
			
			root.setRight(remove(name, root.getRight()));
			
		}else if(name.compareTo(root.getElement()) < 0){
			
			root.setLeft(remove(name, root.getLeft()));
			
		}else{
			
			if(root.getLeft() == null && root.getRight() == null){
				
				root = null;
				
			}else if(root.getRight() != null){
				
				root.setElement(successor(root));
				root.setRight(remove(root.getElement(), root.getRight()));
				
			}else{
				
				root.setElement(predecessor(root));
				root.setLeft(remove(root.getElement(), root.getLeft()));
				
			}
		}
		
		return root;
		
	}
	
	/**
	 * interates through a list inOrder
	 * @return TreeIterator<E> a tree iterator item with a list of items in order
	 */
	public TreeIterator<E> iteratorIn(){
		
		TreeIterator<E> list = new TreeIterator<>(tree);
		list.inOrder();
		
		return list;
		
	}
	
	/**
	 * interates through a list preOrder
	 * @return TreeIterator<E> a tree iterator item with a list of items pre order
	 */
	public TreeIterator<E> iteratorPre(){
		
		TreeIterator<E> list = new TreeIterator<>(tree);
		list.preOrder();
		
		return list;
		
	}
	
	/**
	 * interates through a list postOder
	 * @return TreeIterator<E> a tree iterator item with a list of items post order
	 */
	public TreeIterator<E> iteratorPost(){
		
		TreeIterator<E> list = new TreeIterator<>(tree);
		list.postOrder();
		
		return list;
		
	}
	
	/**
	 * gets the Contact after the current contact
	 * @param TreeNode<Contact> root of tree to find successor
	 * @return Contact object of contact after current contact
	 */
	private Contact successor(TreeNode<Contact> root){
		root = root.getRight();
		
		while(root.getLeft() != null){
			
			root = root.getLeft();
			
		}
		
		return root.getElement();
	}
	
	/**
	 * gets the Contact before the current contact
	 * @param TreeNode<Contact> root of tree to find successor
	 * @return Contact object of contact before current contact
	 */
	private Contact predecessor(TreeNode<Contact> root){
		
		root = root.getLeft();
		while(root.getRight() != null){
			
			root = root.getRight();
			
		}
		
		return root.getElement();
	}
	
	/**
	 * creates a new tree with data to be used as the root and adds it to an existing tree
	 * @param E newNode data to be used as the root for the new tree
	 */
	protected void addTree(E newNode) throws TreeException{
		
		
		if(tree.getRoot().compareTo(newNode) > 0){
			
			if(tree.root.getLeft() == null){

				tree.root.setLeft(newNode);
				
			}else{	
				
				BinarySearchTree<E> base = new BinarySearchTree<>(tree.root.getLeft());
				base.addTree(newNode);
				
			}

		}else{
			
			if(tree.root.getRight() == null){
				
				tree.root.setRight(newNode);
				
			}else{
				
				BinarySearchTree<E> base = new BinarySearchTree<>(tree.root.getRight());
				base.addTree(newNode);	
				
			}
		}
		
	}
	
}
