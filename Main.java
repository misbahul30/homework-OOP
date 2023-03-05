import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input the number of data
        System.out.print("Enter number of data: ");
        
        // Read the number of data entered by the user
        int numdata = scanner.nextInt();
        
        // Create a Marks object with the specified number of data
        Marks marks = new Marks(numdata);
        
        // Populate the data for the Marks object
        marks.createData();
        
        // Create a PrincipalName object with the name of the school principal
        PrincipalName principalName = new PrincipalName("Misbahul", "Munir");
        
        // Create an Address object with the address details of the school
        Address address = new Address("No 123, Jalan Paloh Hinai", "12345", " Kuching", "Sarawak");
        
        // Create a School object with the school name, address, principal name, and marks
        School school = new School("Sekolah Siput balik", address, principalName, marks);
    
        // Set the number of participants for the School object
        school.setNumberParticipants();
        
        // Print the details of the School object
        System.out.println(school.toString());
        
        // Calculate and print the average score for the Marks object
        System.out.printf("Average Score     : %.2f", marks.average());
        
        // Calculate and print the standard deviation for the Marks object
        System.out.printf("\nStandard Deviation: %.2f", marks.stanDev(marks.average()));
    }
}
