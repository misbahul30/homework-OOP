public class PrincipalName {

	private String FirstName;
	private String LastName;
	
	// Default constructor
	public PrincipalName(){		
	}
	
	// Constructor with parameters
	public PrincipalName(String FirstName ,String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	
	// Getter and setter methods for the first name
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	
	// Getter and setter methods for the last name
	public String getSecondName() {
		return LastName;
	}
	public void setSecondName(String secondName) {
		this.LastName = secondName;
	}
	
	// Returns the full name of the principal
	public String toString() {
		return FirstName + " " + LastName;
	}
}
