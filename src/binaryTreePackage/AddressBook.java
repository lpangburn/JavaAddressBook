package binaryTreePackage;

public class AddressBook implements ADTAddressBook {
	//creates an empty binarySearchTree
	BinarySearchTree<Contact> tree = new BinarySearchTree<>();

	int count = 0;
	
	/**
	 * returns the number of items in the tree
	 * @return int number of items in the tree
	 */
	public int size(){
		
		return count;
		
	}

	/**
	 * adds a contact to the tree
	 * @param Contact name contact to be added
	 */
	public void add(Contact name) throws TreeException {
		
		tree.add(name);
		count++;
		
	}

	/**
	 * removes a contact from the tree if it exists in the tree
	 * @param String name to be searched for
	 */
	public void remove(String name) throws TreeException {
		
		//if the find method returns a contact with a first name
		if(this.find(name).getFirst() != null){
			
			//create a contact object of the contact with the searched first name
			Contact key = this.find(name);
			//get the root of the binarysearchtree
			TreeNode<Contact> root = tree.tree.root;
			
			//calls the remove method remove from binarysearchtree and creates a new node representing the root of another tree
			TreeNode<Contact> node = tree.remove(key, root);
			
			//creates a new tree without the removed contact
			tree = new BinarySearchTree<>(node);
			
			count --;
		
		
		}else{
			
			System.out.println("Cannot remove contact. Contact does not exist.");
			
		}
		
	}

	/**
	 * finds a contact in the tree
	 * @param String name to be found
	 * @Contact contact object for the searched name
	 */
	public Contact find(String name) throws TreeException {
		
		Contact contact = tree.find(name);
		
		return contact;
		
	}

	/**
	 * searches for a contact to display the contact information or tell the user that the contact doesnt exist
	 * @param String name to search for
	 */
	public void search(String name) throws TreeException {
		
		//calls the find method and creates a contact object with the found contact, or a null contact if the name isnt found
		Contact contact = tree.find(name);
		
		//if the returned contact name is not 'null' , display first name, last name, address, phone number of contact
		try{
			if(contact.getFirst().compareToIgnoreCase(name) == 0){
				
				System.out.println("Found contact with name " + name + ":");
				System.out.println(contact.display());
				
			}	
		
		//inform the user the contact is not in the list	
		}catch(Exception e){
			
			System.out.println( "Contact with name " + name + " not in address book.");
		
		}
	}
	
	/**
	 * checks to see if the tree is empty
	 * @return boolean true if the root of the tree is null
	 */
	public boolean isEmpty() {
		
		return this.tree.tree.root.getElement() == null;
		
	}

	/**
	 * empties the address book by creating a new binarysearchtree
	 */
	public void makeEmpty() {
		
		this.tree = new BinarySearchTree<>();
		count = 0;
		
	}
	
}
