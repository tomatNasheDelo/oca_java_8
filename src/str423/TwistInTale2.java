package str423;


class Employee {}
interface Interviewer {}
class Manager extends Employee implements Interviewer {}
class HRExecutive extends Employee implements Interviewer {}


public class TwistInTale2 {

	public static void main(String[] args) {
		
		Interviewer[] interviewer = new Interviewer[] {
		
		new Manager(),
		new Employee(),
		new HRExecutive(),
		new Interviewer()
	};
		

	}
}



