package str422;


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

public class OfficeInheritanceList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interviewer[] interviewers = new Interviewer[2];
		interviewers[0] = new Manager();
		interviewers[1] = new HRExecutive();
		for (Interviewer interviewer : interviewers) {
		    interviewer.conductInterview();

	}

}
