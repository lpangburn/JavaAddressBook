package binaryTreePackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Helper {
	
	/**
	 * initilizes an address book, fills the address book, manipulates the address book
	 * @throws TreeException
	 * @throws FileNotFoundException
	 */
	
	public static void start() throws TreeException, FileNotFoundException{

		AddressBook newBook = new AddressBook();
		System.out.println(newBook.size());
		
		//calls addContact method to fill addressbook from text file
		AddressBook book = addContact();
		
		//displays the TreeIterator list
		displayIterator(book);
		
		//display size of addressbook, then remove a contact with the first name "James"
		System.out.println(book.size());
		book.remove("James");
		
		//display the iterator again without the removed contact and print the new size of the list
		displayIterator(book);
		System.out.println(book.size());
		
		//searches for two contacts in the addressbook: Mattie, which does exist, and james, which does not exist
		book.search("Mattie");
		book.search("James");
		
		//empties the addressbook
		book.makeEmpty();
		System.out.println(book.isEmpty());
		

	}
	
	/**
	 * makes a new contact from a string with tab delimiters between data points
	 * @param String st text line from file
	 * @return Contact object with name, address object, phone number set
	 */
	@SuppressWarnings("resource")
	public static Contact newContact(String st){
		Contact ct = new Contact();
	
		Scanner textScan = new Scanner(st).useDelimiter("\t+");
		ct.setFirst(textScan.next());
		ct.setLast(textScan.next());
		ct.setAddress(textScan.next(), textScan.next(), textScan.next(), textScan.next());
		ct.setPhone(textScan.next());
		
		return ct;
		
	}
	
	/**
	 * fills an address book with contacts from a text file
	 * @return AddressBook with contacts
	 */
	public static AddressBook addContact() throws TreeException, FileNotFoundException{
		AddressBook book = new AddressBook();
		
		Scanner scanner = new Scanner(new File("contacts.txt"));
		@SuppressWarnings("unused")
		String garbage = scanner.nextLine();
		
		//fill address book with contacts from file
		while(scanner.hasNextLine()){
			
			Contact ct = newContact(scanner.nextLine());
			book.add(ct);
					
		}
		
		scanner.close();
		
		return book;
	}
	
	/**
	 * displays all the items in an addressbook in order 
	 * @param TreeIterator<Contact> iterator an iterator object with a list of contacts
	 */
	public static <E> void displayIterator(AddressBook book){
		
		//new in order iterator called on address book, stored as a list
		TreeIterator<Contact> list = book.tree.iteratorIn();
		
		while(list.size() != 0){
			
			System.out.println(list.next().display());
			
		}
		
	}

}
