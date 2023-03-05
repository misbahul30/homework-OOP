public class Address {

    // Declare instance variables for the address fields
    private String street;
    private String postcode;
    private String district;
    private String state;
    
    // Default constructor
    public Address(){
    }
    
    // Class constructor
    public Address(String street, String postcode, String district, String state){
        // Initialize the instance variables with the values passed to the constructor
        this.street = street;
        this.postcode = postcode;
        this.district = district;
        this.state = state;
    }
    
    // Getter and setter methods for each instance variable
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    
    // toString method that returns a string representation of the address
    public String toString() {
        return street + " " + postcode + " " + district + " " + state;
    }
}
