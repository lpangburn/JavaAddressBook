package binaryTreePackage;

/**
 * throws custom exception in tree operations
 * @param String s error message to display
 */
@SuppressWarnings("serial")
public class TreeException extends Exception {
	
	public TreeException(String s) {
		
	    super(s);
	    
	}

}
