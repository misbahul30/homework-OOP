public class Marks {

	float marks[]; // array to store marks
	int numdata; // number of data points
	
	//default constructor
	public Marks() {		
	}
	//class constructor
	public Marks(int numdata) { // constructor to set number of data points
		this.numdata = numdata;
	}
	
	//getter and setter method
	public void setMarks(int marks, int index) { // setter method to set marks at a given index
		this.marks[index] = marks;
	}
	public float getMarks(int index) { // getter method to get marks at a given index
		return marks[index];
	}
	
	//just an operations
	void createData(){ // method to generate data points
		float[] marks = new float[numdata]; // initialize array
		for(int i =0; i<numdata; i++) {
			marks[i]=i; // populate array with data points
		}
		this.marks = marks; // set array to marks variable
	}
	
	float average(){ // method to calculate average
		float sum =0;
        for (int i=0; i<numdata; i++) {
            sum += marks[i];
        }
        float avg = sum / numdata; // calculate average
        return avg;
	}
	
	float stanDev(float avg){ // method to calculate standard deviation
		 float sum = 0;
	        float sd;

	        for(int i =0; i< numdata; i++){
	            sum += Math.pow((marks[i]-avg),2); // calculate sum of squares
	        };

	        sd = (float) Math.sqrt(sum/(numdata-1)); // calculate standard deviation
	        return sd;
	}
}
