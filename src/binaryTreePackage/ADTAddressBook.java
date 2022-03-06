package binaryTreePackage;

/**
 * an interface defining the operations of an AddressBook
 */
public interface ADTAddressBook {
	
	/**
	 * adds the contact to the address book
	 * @param Contact name
	 * @throws TreeException
	 */
	public void add(Contact name) throws TreeException;
	
	/**
	 * removes the contact from the address book
	 * @param String name
	 * @throws TreeException
	 */
	public void remove(String name) throws TreeException;
	
	/**
	 * finds if a contact exists in an address book and returns a reference to its contact object
	 * @param String name
	 * @throws TreeException
	 * @return Contact of the name looking for
	 */
	public Contact find(String name) throws TreeException;
	
	/**
	 * searches for a name in an address book and displays the contact information if the contact exists
	 * @param String name to be searched for
	 * @throws TreeException
	 */
	public void search(String name) throws TreeException;
	
	/**
	 * checks to see if there are any items in the address book
	 * @return boolean value true or false
	 */
	public boolean isEmpty();
	
	/**
	 * removes all items from an address book
	 */
	public void makeEmpty();


}
