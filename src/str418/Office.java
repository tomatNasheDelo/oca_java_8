package str418;

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
		// TODO Auto-generated method stub
		
		HRExecutive hr = new HRExecutive();
		hr.specialization = new String[] {"Staffing"};
		System.out.println(hr.specialization[0]);
		hr.name = "Pavni Gupta";
		System.out.println(hr.name);
		hr.conductInterview();
		
		}

	}


