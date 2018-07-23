package weekFivePractice;

public class Student {
	
	static int numberOfStudents;
		
	private String firstName; //just a blueprint
	private String lastName;
	private String phoneNumber;
	private int gradeLevel;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	//overloaded constructor
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		this.firstName = firstName; //this is like self: whoever is using it
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel;
	}
	
	//public methods
	public void introduce() {
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);
	}
	
	//private method
	private boolean checkLength(String str, int length) {
		return str.length() > length;
	}
	
	//getters and setters
	public void setFirstName(String firstName) {
		if (checkLength(firstName, 1)) {	//validation
		this.firstName = firstName;
		}
	}
	
	public String getFirstName() {
		return firstName; //inside the scope 
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhoneeNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	
	public int getGradeLevel() {
		return gradeLevel;
	}
	
	
	
	
}
