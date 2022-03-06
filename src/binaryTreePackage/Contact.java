package binaryTreePackage;


public class Contact implements Comparable<Contact>{
		
		private String first, last, phone;
		private Address<String> address = new Address<>();
		
		/**
		 * contact constructor with null values
		 */
		public Contact(){
			
			this.first = null;
			this.last = null;
			this.phone = null;
			
		}
		
		/**
		 * contact constructor with only first name value
		 * @param String fn for first name
		 */
		public Contact(String fn){
			
			this.first = fn;
			this.last = null;
			this.phone = null;
			
		}
		
		/**
		 * contact constructor with first name, last name, and phone number
		 * @param String fn for first name
		 * @param String ln for last name
		 * @param String number for phone number
		 */
		public Contact(String fn, String ln, String number){
			
			this.first = fn;
			this.last = ln;
			this.phone = number;
			
		}
		
		/**
		 * sets the first name of the contact
		 * @param String first for first name
		 */
		public void setFirst(String first){
			
			this.first = first;
			
		}
		
		/**
		 * sets the last name of the contact
		 * @param String last for last name of the contact
		 */
		public void setLast(String last){
			
			this.last = last;
			
		}
		
		/**
		 * sets the phone number of the contact
		 * @param String phone for the phone number of the contact
		 */
		public void setPhone(String phone){
			
			this.phone = phone;
			
		}
		
		/**
		 * creates a new address object with street, city, state, and zip
		 * @param String street for the street
		 * @param String city for the city
		 * @param String state for the state
		 * @param String zip for the zipcode
		 */
		public void setAddress(String street, String city, String state, String zip){
			
			this.address = new Address<>(street, city, state, zip);
			
		}
		
		/**
		 * gets the first name of this contact
		 * @return String representing the first name of this contact
		 */
		public String getFirst(){
			
			return first;
			
		}
		
		/**
		 * gets the last name of this contact
		 * @return String representing the last name of this contact
		 */
		public String getLast(){
			
			return (String) last;
			
		}
		
		/**
		 * gets the phone number of this contact
		 * @return String representing the phone number of this contact
		 */
		public String getPhone(){
			
			return (String) phone;
			
		}
		
		/**
		 * gets the address of this contact
		 * @return String representing the full street address of this contact
		 */
		public String getAddress(){
			
			return address.getAddress();
			
		}

		/**
		 * displays all available information for this contact
		 * @return String representing the first name, last name, street address, and phone number of this contact
		 */
		public String display(){
			
			String displayFirst, displayLast, displayAddress, displayPhone;
			
			if(first == null){
				
				displayFirst = "N/A";
				
			}else{
				
				displayFirst = (String) first;
			}
			
			
			if(last == null){
				
				displayLast = "N/A";
				
			}else{
				
				displayLast = (String) last;
			}
			
			
			if(address.getStreet() == null){
				displayAddress = "N/A";
			}else {
				displayAddress = address.getAddress();
			}
			
			if(phone == null){
				
				displayPhone = "N/A";
				
			}else{
				
				displayPhone = (String) phone;
				
			}
			
			return displayFirst + " " + displayLast + ", " + displayAddress + ", " + displayPhone;
			
		}
		
		/**
		 * compares the first name of two contact objects
		 * @param Contact contact object to be compared to
		 * @return int value of compareTo
		 */
		public int compareTo(Contact contact){
					
			return this.getFirst().compareToIgnoreCase(contact.getFirst());
			
		}
		
		/**
		 * compares first name of a contact object with a string parameter
		 * @return String representing the first name of this contact
		 * @param String o to be compared to
		 */
		public int compareTo(String o) {

			return this.getFirst().compareToIgnoreCase(o);
			
		}

}
