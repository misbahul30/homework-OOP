public class School {

    // Declare instance variables for the school fields
    private String name;
    private Address address;
    private PrincipalName principalName;
    private Marks marks;
    
    // Default constructor
    public School(){        
    }
    
    // Class constructor
    public School(String name, Address address, PrincipalName principalName, Marks marks){
        // Initialize the instance variables with the values passed to the constructor
        this.name = name;
        this.address = address;
        this.principalName = principalName;
        this.marks = marks;
    }
    
    // Getter and setter methods for each instance variable
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public PrincipalName getPrincipalName() {
        return principalName;
    }
    public void setPrincipalName(PrincipalName principalName) {
        this.principalName = principalName;
    }
    public Marks getMarks() {
        return marks;
    }
    public void setMarks(Marks marks) {
        this.marks = marks;
    }
    
    // Method to collect the marks and calculate average and standard deviation
    public void setNumberParticipants() {
        marks = new Marks();
        float avg = marks.average();
        marks.stanDev(avg);
    }
    
    // toString method that returns a string representation of the school
    public String toString() {
        return "\nSchool Name       : " + name + "\nAddress           : " + address + "\nPrincipal Name    : " + principalName; 
    }
}
