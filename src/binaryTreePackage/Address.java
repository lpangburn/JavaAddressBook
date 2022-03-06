package binaryTreePackage;

/**
 * Creates an address type with a street, city, state, and zip
 */
public class Address<T> {
	
	private T street, city, state, zipcode;
	
	/**
	 * Creates an empty address
	 */
	public Address(){
		
		this.street = null;
		this.city = null;
		this.state = null;
		this.zipcode = null;
		
	}	
	
	/**
	 * creates an address object with T values for street, city, state, and zip.
	 * @param T street
	 * @param T city
	 * @param T state
	 * @param T zip
	 */
	public Address(T street, T city, T state, T zip){
		
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zip;
		
	}
	
	/**
	 * Produces a string representing the address of a contact
	 * @return String with complete address
	 */
	public String getAddress(){
		
		return street + ", " + city + ", " + state + " " + zipcode;
		
	}

	/**
	 * Returns the street value
	 * @return T street value
	 */
	public T getStreet() {
		
		return street;
		
	}

	/**
	 * Returns the city value
	 * @return T city value
	 */
	public T getCity() {
		
		return city;
		
	}

	/**
	 * Returns the state value
	 * @return T state value
	 */
	public T getState() {
		
		return state;
		
	}

	/**
	 * Returns the zip value
	 * @return T zip value
	 */
	public T getZipcode() {
		
		return zipcode;
		
	}

	/**
	 * sets the value for street
	 * @param T street value
	 */
	public void setStreet(T street) {
		
		this.street = street;
		
	}

	/**
	 * sets the city for street
	 * @param T city value
	 */
	public void setCity(T city) {
		
		this.city = city;
		
	}

	/**
	 * sets the value for state
	 * @param T state value
	 */
	public void setState(T state) {
		
		this.state = state;
		
	}

	/**
	 * sets the value for zip
	 * @param T zip value
	 */
	public void setZipcode(T zipcode) {
		
		this.zipcode = zipcode;
		
	}
	
}
