package str420;


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
		
		Employee emp = new HRExecutive();
		emp.specialization = new String[] {"Staffing"};
		System.out.println(emp.specialization[0]);
		emp.name = "Pavni Gupta";
		System.out.println(emp.name);
		emp.conductInterview();
		
		
		}

	}