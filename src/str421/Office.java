package str421;



class Employee {

	String name;
	String address;
	String phoneNumber;
	float experience; 
	
}

interface Interviewer {

public void conductInterview();

}

class HRExecutive extends Employee implements Interviewer {

	String[] specialization;
	public void conductInterview () {
	  System.out.println("HRExecutive - conducting interview");	
	}
	}




public class Office {

	public static void main(String[] args) {
		Interviewer interviewer = new HRExecutive();
		interviewer.specialization = new String[] {"Staffing"};
		System.out.println(interviewer.specialization[0]);
		interviewer.name = "Pavni Gupta";
		System.out.println(interviewer.name);
		interviewer.conductInterview();
		}

	}